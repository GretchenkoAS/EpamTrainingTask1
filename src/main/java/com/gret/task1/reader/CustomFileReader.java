package com.gret.task1.reader;

import com.gret.task1.exeption.ArrayException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomFileReader {

    public List<String> readFromFile(String file) throws ArrayException {

        if(file.isEmpty()){
            throw new ArrayException("incorrect file name");
        }
        Path path = Paths.get(file);
        if (Files.notExists(path)) {
            throw new ArrayException("file does not exist");
        }
        List<String> lines = new ArrayList<>();
        try (Stream<String> stream = Files.lines(path)) {

            lines = stream.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
