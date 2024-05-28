package com.afdtech.eventsmanager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/event/",
        glue = {"com.afdtech.eventsmanager.gherkin.event", "com.afdtech.eventsmanager.configurations"},
        plugin = {"pretty", "html:target/cucumber-report-events.html"})
public class EventsCucumberTest {

}