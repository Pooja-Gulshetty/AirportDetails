package com.airport.dto;

public class CountryAirportsDto {
  private final String code;
  private final String name;
  private final String numberOfAirports;

  public CountryAirportsDto(final String code, final String name, final String numberOfAirports) {
    this.code = code;
    this.name = name;
    this.numberOfAirports = numberOfAirports;
  }

  public String getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  public String getNumberOfAirports() {
    return numberOfAirports;
  }
}
