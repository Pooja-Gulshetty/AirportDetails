package com.airport.dto;

public class CountryDto {
  private final String id;

  private final String code;

  private final String name;

  private final String continent;

  public CountryDto(final String id, final String code, final String name, final String continent) {
    this.id = id;
    this.code = code;
    this.name = name;
    this.continent = continent;
  }

  public String getId() {
    return id;
  }

  public String getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  public String getContinent() {
    return continent;
  }
}
