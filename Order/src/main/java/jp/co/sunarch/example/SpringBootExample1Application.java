package jp.co.sunarch.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("jp.co.sunarch.example.entity")
@EnableJpaRepositories("jp.co.sunarch.example.repository")
@SpringBootApplication
public class SpringBootExample1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExample1Application.class, args);
	}

}
