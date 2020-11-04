package com.airport.domain;

public class Country {

  private static final int numberOfFields = 6;

  private final String id;

  private final String code;

  private final String name;

  private final String continent;

  private final String wikipediaLink;

  private final String keywords;

  public Country(String[] data) {
    int index = 0;
    this.id = data[index++];
    this.code = data[index++];
    this.name = data[index++];
    this.continent = data[index++];
    this.wikipediaLink = data[index++];
    this.keywords = data[index];
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

  public String getWikipediaLink() {
    return wikipediaLink;
  }

  public String getKeywords() {
    return keywords;
  }

  public static int getNumberoffields() {
    return numberOfFields;
  }

  @Override
  public String toString() {
    return "Country [id=" + id + ", code=" + code + ", name=" + name + ", continent=" + continent
        + ", wikipediaLink=" + wikipediaLink + ", keywords=" + keywords + "]";
  }


}