package com.airport.controllers;

import java.util.List;

import com.airport.dto.AirportDto;
import com.airport.dto.CountryAirportsDto;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Controller
public class AirportController {

  @RequestMapping(
      path = "/countries/{countryCode}/airports",
      method = RequestMethod.GET,
      produces = MediaType.APPLICATION_JSON_VALUE
  )
  public ResponseEntity<AirportDto> getAirportsOfAContry() {
    // TODO : Return top 10 countries having highest number of airports in descending order
    throw new NotImplementedException();
  }
}
