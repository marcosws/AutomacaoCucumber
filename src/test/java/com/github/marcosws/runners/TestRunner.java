package com.github.marcosws.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features/"},
		glue = {"com.github.marcosws.steps"},
		tags = "@cadastro"
		)
public class TestRunner {
	

}
