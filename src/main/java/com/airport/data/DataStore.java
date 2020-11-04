package com.airport.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.airport.domain.Airport;
import com.airport.domain.Country;
import com.airport.domain.Runway;

public class DataStore {
  private final Map<String, Country> countriesMap;
  private final List<Airport> airports;
  private final List<Runway> runways;

  public DataStore(final List<Country> countries,
                   final List<Airport> airports,
                   final List<Runway> runways) {
    countriesMap = new HashMap<>();

    for (Country country : countries) {
      // IN
      countriesMap.put(country.getCode().toLowerCase(), country);
    }
    this.airports = airports;
    this.runways = runways;
  }

  public Optional<Country> getCountry(final String countryCode) {
    return Optional.ofNullable(countriesMap.get(countryCode.toLowerCase()));
  }
}
