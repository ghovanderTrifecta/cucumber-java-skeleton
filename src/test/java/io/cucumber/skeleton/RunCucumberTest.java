package io.cucumber.skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

import static org.junit.runners.Suite.*;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@smoke", features="out/test/resources/io/cucumber/skeleton", plugin = {"pretty", "junit:out/reports/cucumber.xml","json:out/reports/Cucumber.json"})
public class RunCucumberTest{
}


