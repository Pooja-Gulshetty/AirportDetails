package com.airport.dto;

import java.util.Set;

public class CountryAndRunwaysDto {
  private final String code;
  private final String name;
  private final Set<String> typesOfRunways;

  public CountryAndRunwaysDto(final String code, final String name, final Set<String> typesOfRunways) {
    this.code = code;
    this.name = name;
    this.typesOfRunways = typesOfRunways;
  }

  public String getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  public Set<String> getTypesOfRunways() {
    return typesOfRunways;
  }
}
