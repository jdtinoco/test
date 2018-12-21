package deors.demos.microservices.eurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EurekaserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserviceApplication.class, args);
	}

}
@org.springframework.cloud.netflix.eureka.server.EnableEurekaServer
