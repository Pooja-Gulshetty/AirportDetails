package com.airport.controllers;

import com.airport.appication.Application;
import com.airport.config.TestBeans;
import com.airport.dto.CountryDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.airport.config.TestBeans.TEST_COUNTRY;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.testng.Assert.assertEquals;

@EnableWebMvc
@WebAppConfiguration
@TestPropertySource(locations = "classpath:application.properties")
@ContextConfiguration(classes = {Application.class, TestBeans.class})
public class CountryControllerTest extends AbstractTestNGSpringContextTests {

  private static final Logger LOGGER = LoggerFactory.getLogger(CountryControllerTest.class);

  @Autowired
  private WebApplicationContext context;

  @Autowired
  private ObjectMapper objectMapper;

  private MockMvc mockMvc;

  @BeforeClass
  public void beforeClass() {
    mockMvc = MockMvcBuilders.webAppContextSetup(context)
        .build();
  }

  @Test
  public void testCountrySearchWorksFineWithGivenInput() throws Exception {
    CountryDto expectedCountry =
        new CountryDto(TEST_COUNTRY.getId(), TEST_COUNTRY.getCode(), TEST_COUNTRY.getName(), TEST_COUNTRY.getContinent());

    LOGGER.info("Making https call to country end point");
    MvcResult mvcResult = mockMvc.perform(get("/countries/{0}", expectedCountry.getCode()))
        .andExpect(status().isOk())
        .andReturn();

    String responseBody = mvcResult.getResponse().getContentAsString();
    CountryDto actualCountry = objectMapper.readValue(responseBody, CountryDto.class);
    assertEquals(actualCountry, expectedCountry, "Expected country for the query is not equals to actual country");
  }


  @Test
  public void testCountrySearchUsingCaseInsensitiveCode() throws Exception {

    MvcResult mvcResult = mockMvc.perform(get("/countries/{0}", TEST_COUNTRY.getCode().toLowerCase()))
        .andExpect(status().isOk())
        .andReturn();
    String responseBody = mvcResult.getResponse().getContentAsString();
    CountryDto lowerCaseCountryCodeResponse = objectMapper.readValue(responseBody, CountryDto.class);
    LOGGER.info("Lower case country code response:[{}]", lowerCaseCountryCodeResponse.getCode());

    mvcResult = mockMvc.perform(get("/countries/{0}", TEST_COUNTRY.getCode().toUpperCase()))
        .andExpect(status().isOk())
        .andReturn();
    responseBody = mvcResult.getResponse().getContentAsString();
    CountryDto upperCaseCaseCountryCodeResponse = objectMapper.readValue(responseBody, CountryDto.class);
    LOGGER.info("Upper case country code response:[{}]", upperCaseCaseCountryCodeResponse.getCode());

    assertEquals(lowerCaseCountryCodeResponse, upperCaseCaseCountryCodeResponse,
        "Making sure the API supports both lower case and upper case country code path param");
  }

}