package com.airport.dto;

import java.util.Objects;

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

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final CountryDto that = (CountryDto) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(code, that.code) &&
        Objects.equals(name, that.name) &&
        Objects.equals(continent, that.continent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, name, continent);
  }
}
