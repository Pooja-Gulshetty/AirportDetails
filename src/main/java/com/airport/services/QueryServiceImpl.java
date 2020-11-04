package com.airport.services;

import java.util.Optional;

import com.airport.data.DataStore;
import com.airport.domain.Country;
import com.airport.exceptions.ItemNotFound;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueryServiceImpl implements QueryService {

  private static final Logger LOGGER = LoggerFactory.getLogger(QueryServiceImpl.class);

  final DataStore dataStore;

  @Autowired
  public QueryServiceImpl(final DataStore dataStore) {
    this.dataStore = dataStore;
  }

  @Override
  public Country getCountry(final String code) {
    final Optional<Country> country = dataStore.getCountry(code);
    if (country.isPresent()) {
      LOGGER.info("Country for the country code:[{}] found successfully and returning it", code);
      return country.get();
    }

    LOGGER.info("Country not found for the country code:[{}]", code);
    throw new ItemNotFound("User requested country does not exists for the countryCode: " + code);
  }
}
