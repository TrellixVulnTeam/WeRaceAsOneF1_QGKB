package ual.dra.weRaceAsOneF1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
public class WeRaceAsOneF1Application {

	public static void main(String[] args) {
		SpringApplication.run(WeRaceAsOneF1Application.class, args);
	}

}
