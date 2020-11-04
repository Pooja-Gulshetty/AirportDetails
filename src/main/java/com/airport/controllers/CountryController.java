package com.airport.controllers;

import java.util.List;

import com.airport.domain.Country;
import com.airport.dto.CountryAirportsDto;
import com.airport.dto.CountryAndRunwaysDto;
import com.airport.dto.CountryDto;
import com.airport.services.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Controller
public class CountryController {

  private final QueryService queryService;

  @Autowired
  public CountryController(final QueryService queryService) {
    this.queryService = queryService;
  }

  @RequestMapping(
      path = "/countries/{countryCode}",
      method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  public ResponseEntity<CountryDto> getCountry(@PathVariable("countryCode") final String countryCode) {
    Country country = queryService.getCountry(countryCode);
    CountryDto countryDto = mapToDto(country);
    return new ResponseEntity<>(countryDto, HttpStatus.OK);
  }

  private CountryDto mapToDto(final Country country) {
    return new CountryDto(
        country.getId(),
        country.getCode(),
        country.getName(),
        country.getContinent()
    );
  }

  @RequestMapping(
      path = "/countries/highestAirports",
      method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  public ResponseEntity<List<CountryAirportsDto>> getCountriesWithHighestAirports() {
    // TODO : Return top 10 countries having highest number of airports in descending order
    throw new NotImplementedException();
  }
}
