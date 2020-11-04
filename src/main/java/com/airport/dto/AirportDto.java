package com.airport.dto;

public class AirportDto {
  private final String id;
  private final String ident;
  private final String type;
  private final String name;

  public AirportDto(final String id, final String ident, final String type, final String name) {
    this.id = id;
    this.ident = ident;
    this.type = type;
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public String getIdent() {
    return ident;
  }

  public String getType() {
    return type;
  }

  public String getName() {
    return name;
  }
}
