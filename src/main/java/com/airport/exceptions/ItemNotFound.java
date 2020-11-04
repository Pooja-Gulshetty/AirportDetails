package com.airport.exceptions;

public class ItemNotFound extends RuntimeException {
  private final String message;

  public ItemNotFound(final String message) {
    super(message);
    this.message = message;
  }

  @Override
  public String getMessage() {
    return message;
  }
}
