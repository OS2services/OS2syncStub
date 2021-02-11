package dk.digitalidentity.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
@ConfigurationProperties(prefix = "configuration")
public class AppConfiguration {
	private String apiKey;

	private TestDataConfiguration testData = new TestDataConfiguration();
}