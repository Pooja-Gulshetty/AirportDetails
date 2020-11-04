package com.airport.services;

import com.airport.domain.Country;

public interface QueryService {
  Country getCountry(String code);
}
