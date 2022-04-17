package com.faiz.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\ProjectWorkSpace\\OrangeHRM\\src\\test\\java\\com\\faiz\\feature", 
					glue = "com.faiz.execution", dryRun = false, monochrome = true, publish = true)
public class Runner {

}
