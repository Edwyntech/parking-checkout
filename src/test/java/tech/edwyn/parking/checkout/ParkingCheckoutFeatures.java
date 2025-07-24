package tech.edwyn.parking.checkout;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "tech.edwyn.parking.checkout")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "json:target/cucumber/report.json")
@ConfigurationParameter(key = PLUGIN_PUBLISH_QUIET_PROPERTY_NAME, value = "true")
@ConfigurationParameter(key = JUNIT_PLATFORM_NAMING_STRATEGY_PROPERTY_NAME, value = "long")
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "not ( @WIP )")
public class ParkingCheckoutFeatures {
}
