package com.airport.controllers;

import com.airport.dto.CountryAndRunwaysDto;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Controller
public class RunwaysController {
  @RequestMapping(
      path = "/countries/{countryCode}/runways",
      method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  public ResponseEntity<CountryAndRunwaysDto> getRunwaysOfCountry(@PathVariable("countryCode") final String countryCode) {
    // TODO : Return types of runway in a country
    throw new NotImplementedException();
  }

  @RequestMapping(
      path = "/airports/{airportId}/runways",
      method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  public ResponseEntity<CountryAndRunwaysDto> getRunwaysOfAirport(@PathVariable("countryCode") final String countryCode) {
    // TODO : Return types of runway for a given airport ident
    throw new NotImplementedException();
  }
}
