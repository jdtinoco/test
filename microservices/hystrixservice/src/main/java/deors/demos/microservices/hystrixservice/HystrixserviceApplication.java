package deors.demos.microservices.hystrixservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HystrixserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixserviceApplication.class, args);
	}

}
@org.springframework.cloud.client.discovery.EnableDiscoveryClient
@org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard
