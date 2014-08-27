package at.porscheinformatik.cucumber.formatter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.Ignore;
import org.junit.runner.RunWith;

@CucumberOptions(features = "classpath:at/porscheinformatik/cucumber/formatter/basic_arithmetic.feature",
        format = "at.porscheinformatik.cucumber.formatter.ConcreteMongoDbFormatter")
@RunWith(Cucumber.class)
@Ignore
public class MongoFormatIT
{

}
