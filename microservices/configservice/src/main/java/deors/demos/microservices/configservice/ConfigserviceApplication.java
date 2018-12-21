package deors.demos.microservices.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigserviceApplication.class, args);
	}

}


@org.springframework.cloud.config.server.EnableConfigServer