package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Yaswanth Asapu\\eclipse-workspace\\Cucumber_FrameWork\\src\\test\\resources\\Features\\Orange.feature",
        glue = "stepDefinitions")

public class TestRunner {

}
