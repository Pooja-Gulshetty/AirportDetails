package com.airport.domain;


public class Runway {

  private static final int numberOfFields = 20;

  private final String id;

  private final String airportRef;

  private final String airportIdent;

  private final String lengthFt;

  private final String widthFt;

  private final String surface;

  private final String lighted;

  private final String closed;

  private final String leIdent;

  private final String leLatitudeDeg;

  private final String leLongitudeDeg;

  private final String leElevationFt;

  private final String leHeadingDegT;

  private final String leDisplacedThresholdFt;

  private final String heIdent;

  private final String heLatitudeDeg;

  private final String heLongitudeDeg;

  private final String heElevationFt;

  private final String heHeadingDegT;

  private final String heDisplacedThresholdFt;

  public Runway(String[] data) {
    int index = 0;
    this.id = data[index++];
    this.airportRef = data[index++];
    this.airportIdent = data[index++];
    this.lengthFt = data[index++];
    this.widthFt = data[index++];
    this.surface = data[index++];
    this.lighted = data[index++];
    this.closed = data[index++];
    this.leIdent = data[index++];
    this.leLatitudeDeg = data[index++];
    this.leLongitudeDeg = data[index++];
    this.leElevationFt = data[index++];
    this.leHeadingDegT = data[index++];
    this.leDisplacedThresholdFt = data[index++];
    this.heIdent = data[index++];
    this.heLatitudeDeg = data[index++];
    this.heLongitudeDeg = data[index++];
    this.heElevationFt = data[index++];
    this.heHeadingDegT = data[index++];
    this.heDisplacedThresholdFt = data[index];
  }

  public static int getNumberOfFields() {
    return numberOfFields;
  }

  public String getId() {
    return id;
  }

  public String getAirportRef() {
    return airportRef;
  }

  public String getAirportIdent() {
    return airportIdent;
  }

  public String getLengthFt() {
    return lengthFt;
  }

  public String getWidthFt() {
    return widthFt;
  }

  public String getSurface() {
    return surface;
  }

  public String getLighted() {
    return lighted;
  }

  public String getClosed() {
    return closed;
  }

  public String getLeIdent() {
    return leIdent;
  }

  public String getLeLatitudeDeg() {
    return leLatitudeDeg;
  }

  public String getLeLongitudeDeg() {
    return leLongitudeDeg;
  }

  public String getLeElevationFt() {
    return leElevationFt;
  }

  public String getLeHeadingDegT() {
    return leHeadingDegT;
  }

  public String getLeDisplacedThresholdFt() {
    return leDisplacedThresholdFt;
  }

  public String getHeIdent() {
    return heIdent;
  }

  public String getHeLatitudeDeg() {
    return heLatitudeDeg;
  }

  public String getHeLongitudeDeg() {
    return heLongitudeDeg;
  }

  public String getHeElevationFt() {
    return heElevationFt;
  }

  public String getHeHeadingDegT() {
    return heHeadingDegT;
  }

  public String getHeDisplacedThresholdFt() {
    return heDisplacedThresholdFt;
  }

  @Override
  public String toString() {
    return "Runway [id=" + id + ", airportRef=" + airportRef + ", airportIdent=" + airportIdent + ", lengthFt="
        + lengthFt + ", widthFt=" + widthFt + ", surface=" + surface + ", lighted=" + lighted + ", closed="
        + closed + ", leIdent=" + leIdent + ", leLatitudeDeg=" + leLatitudeDeg + ", leLongitudeDeg="
        + leLongitudeDeg + ", leElevationFt=" + leElevationFt + ", leHeadingDegT=" + leHeadingDegT
        + ", leDisplacedThresholdFt=" + leDisplacedThresholdFt + ", heIdent=" + heIdent + ", heLatitudeDeg="
        + heLatitudeDeg + ", heLongitudeDeg=" + heLongitudeDeg + ", heElevationFt=" + heElevationFt
        + ", heHeadingDegT=" + heHeadingDegT + ", heDisplacedThresholdFt=" + heDisplacedThresholdFt + "]";
  }

}
