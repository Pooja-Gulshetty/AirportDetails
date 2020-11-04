# AirportDetails
Provide airport and runway details in a country

## Description
The main goal of the project is to provide user with country, airport and runway details for the given country code and airport code.

## Available resources
* [Country](/countries/{countryCode})
* [Airports](/countries/{countryCode}/airports)
* [Runways in a country](/countries/{countryCode}/runways)
* [Runways in of a airport](/airports/{airportId}/runways)
* [10 Countries having highest number of airports](/countries/highestAirports)

## project can be build using maven
```
$ mvn clean install
```

## Run project
Can run the jar file directly as it has the data files in resource directory no other external details required
```
$ java -jar target/AiportDetails-1.0-SNAPSHOT.jar
```

## Tests
Needs to be implemented