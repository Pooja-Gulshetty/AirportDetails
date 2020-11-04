package com.airport.utils;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileReaderUtility {
  private static final Logger LOGGER = LoggerFactory.getLogger(FileReaderUtility.class);

  /*
   * @Description : Load the data from csv file, Read whole data at once
   * a,b,c == [a,b,c]
   */
  public static List<String[]> readCsvFile(String fileName) {
    LOGGER.info("Reading file:[{}]", fileName);
    try (CSVReader reader = new CSVReader(
        new InputStreamReader(FileReaderUtility.class.getClassLoader().getResourceAsStream(fileName)),
        CSVParser.DEFAULT_SEPARATOR,
        CSVParser.DEFAULT_QUOTE_CHARACTER,
        1
    )) {

      LOGGER.info("Successfully read all file data for the file:[{}]", fileName);
      return reader.readAll();
    } catch (IOException e) {
      LOGGER.error("Unable to read the file data:[{}]", fileName, e);
      throw new RuntimeException("Error while loading data for " + fileName);
    } finally {

    }
  }
}
