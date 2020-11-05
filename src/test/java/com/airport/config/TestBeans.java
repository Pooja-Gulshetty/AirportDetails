package com.airport.config;

import java.util.Collections;

import com.airport.data.DataStore;
import com.airport.domain.Country;
import org.springframework.context.annotation.Bean;

public class TestBeans {
  /**
   * this.id = data[index++];
   * this.code = data[index++];
   * this.name = data[index++];
   * this.continent = data[index++];
   * this.wikipediaLink = data[index++];
   * this.keywords = data[index];
   */
  private static final String[] data = {"1", "ZZ", "TestCountry", "TestContinent", "any", "any"};
  public static final Country TEST_COUNTRY = new Country(data);

  @Bean
  public DataStore dataStore() {
    return new DataStore(Collections.singletonList(TEST_COUNTRY), Collections.emptyList(), Collections.emptyList());
  }
}
