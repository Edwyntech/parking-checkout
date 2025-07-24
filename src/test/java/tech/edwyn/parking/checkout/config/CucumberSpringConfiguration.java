package tech.edwyn.parking.checkout.config;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJson;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@CucumberContextConfiguration
@SpringBootTest
@ActiveProfiles("features")
@AutoConfigureJson
public class CucumberSpringConfiguration {
}
