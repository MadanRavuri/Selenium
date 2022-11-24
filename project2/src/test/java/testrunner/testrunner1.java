package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\sathi\\eclipse-workspace\\project2\\src\\test\\resources\\features\\login2.feature",
glue= {"C:\\Users\\sathi\\eclipse-workspace\\project2\\src\\test\\java\\stepdefinition\\test13.java"},
plugin= {"pretty","html:target\\HTML\\a1.html"})


public class testrunner1 {

}
