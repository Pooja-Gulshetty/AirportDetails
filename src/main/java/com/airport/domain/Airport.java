package com.airport.domain;

public class Airport {

  private static final int numberOfFields = 18;

  private final String id;

  private final String ident;

  private final String type;

  private final String name;

  private final String latitudeDeg;

  private final String longitudeDeg;

  private final String elevationFt;

  private final String continent;

  private final String isoCountry;

  private final String isoRegion;

  private final String municipality;

  private final String scheduledService;

  private final String gpsCode;

  private final String iataCode;

  private final String localCode;

  private final String homeLink;

  private final String wikipediaLink;

  private final String keywords;

  public Airport(String[] data) {
    int index = 0;
    this.id = data[index++];
    this.ident = data[index++];
    this.type = data[index++];
    this.name = data[index++];
    this.latitudeDeg = data[index++];
    this.longitudeDeg = data[index++];
    this.elevationFt = data[index++];
    this.continent = data[index++];
    this.isoCountry = data[index++];
    this.isoRegion = data[index++];
    this.municipality = data[index++];
    this.scheduledService = data[index++];
    this.gpsCode = data[index++];
    this.iataCode = data[index++];
    this.localCode = data[index++];
    this.homeLink = data[index++];
    this.wikipediaLink = data[index++];
    this.keywords = data[index];
  }

  public static int getNumberOfFields() {
    return numberOfFields;
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

  public String getLatitudeDeg() {
    return latitudeDeg;
  }

  public String getLongitudeDeg() {
    return longitudeDeg;
  }

  public String getElevationFt() {
    return elevationFt;
  }

  public String getContinent() {
    return continent;
  }

  public String getIsoCountry() {
    return isoCountry;
  }

  public String getIsoRegion() {
    return isoRegion;
  }

  public String getMunicipality() {
    return municipality;
  }

  public String getScheduledService() {
    return scheduledService;
  }

  public String getGpsCode() {
    return gpsCode;
  }

  public String getIataCode() {
    return iataCode;
  }

  public String getLocalCode() {
    return localCode;
  }

  public String getHomeLink() {
    return homeLink;
  }

  public String getWikipediaLink() {
    return wikipediaLink;
  }

  public String getKeywords() {
    return keywords;
  }

  @Override
  public String toString() {
    return "Airport [id=" + id + ", ident=" + ident + ", type=" + type + ", name=" + name + ", latitudeDeg="
        + latitudeDeg + ", longitudeDeg=" + longitudeDeg + ", elevationFt=" + elevationFt + ", continent="
        + continent + ", isoCountry=" + isoCountry + ", isoRegion=" + isoRegion + ", municipality="
        + municipality + ", scheduledService=" + scheduledService + ", gpsCode=" + gpsCode + ", iataCode="
        + iataCode + ", localCode=" + localCode + ", homeLink=" + homeLink + ", wikipediaLink=" + wikipediaLink
        + ", keywords=" + keywords + "]";
  }

}