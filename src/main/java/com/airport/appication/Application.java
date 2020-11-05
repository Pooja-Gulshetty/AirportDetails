package com.airport.appication;

import java.util.List;
import java.util.stream.Collectors;

import com.airport.data.DataStore;
import com.airport.domain.Airport;
import com.airport.domain.Country;
import com.airport.domain.Runway;
import com.airport.utils.FileReaderUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan(basePackages = {"com.airport"})
@Configuration
public class Application {

  private final static Logger LOGGER = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {
    LOGGER.info("Starting application");
    SpringApplication.run(Application.class, args);
  }

  @Bean
  public DataStore dataStore() {

    // TODO: Can be read all the files in parallel by running 3 threads
    LOGGER.info("Reading country data");
    List<Country> countries = FileReaderUtility.readCsvFile("countries.csv")
        .parallelStream()
        .map(countryLine -> new Country(countryLine))
        .collect(Collectors.toList());
    LOGGER.info("Successfully read country data");

    LOGGER.info("Reading airport data");
    List<Airport> airports = FileReaderUtility.readCsvFile("airports.csv")
        .parallelStream()
        .map(airport -> new Airport(airport))
        .collect(Collectors.toList());
    LOGGER.info("Successfully read airport data");

    LOGGER.info("Read runways data");
    List<Runway> runways = FileReaderUtility.readCsvFile("runways.csv")
        .parallelStream()
        .map(runway -> new Runway(runway))
        .collect(Collectors.toList());
    LOGGER.info("Successfully read runways data");

    return new DataStore(countries, airports, runways);
  }
}
