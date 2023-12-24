package sk.simo.DemoRestAPI;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DemoRestApiApplication {

	public static void main(String[] args) {
		log.info("Before spring app started");
		SpringApplication.run(DemoRestApiApplication.class, args);
	}

}
