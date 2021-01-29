package com.gret.task1.reader;

import com.gret.task1.exeption.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomFileReader {
    static Logger logger = LogManager.getLogger();

    public List<String> readFromFile(String file) throws ArrayException {
        Path path = Paths.get(file);
        List<String> lines;
        if (Files.notExists(path) || Files.isDirectory(path) || !Files.isReadable(path)) {
            logger.error("resource exception" + file);
            throw new ArrayException("resource exception" + file);
        }
        try (Stream<String> stream = Files.lines(path)) {
            lines = stream.collect(Collectors.toList());
        } catch (IOException e) {
            logger.error("io exception");
            throw new ArrayException(e);
        }
        logger.info("read string from file : " + lines);
        return lines;
    }
}
