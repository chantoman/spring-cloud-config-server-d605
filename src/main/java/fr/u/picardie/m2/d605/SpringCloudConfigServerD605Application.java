package fr.u.picardie.m2.d605;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerD605Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerD605Application.class, args);
	}

}
