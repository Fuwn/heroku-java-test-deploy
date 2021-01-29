package me.fuwn.herokujavatestdeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://spring.io/quickstart
 */
@SpringBootApplication
@RestController
public class HerokujavatestdeployApplication {
	public static void main(String[] args) {
		SpringApplication.run(HerokujavatestdeployApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "The deploy seemed to have worked...";
	}
}
