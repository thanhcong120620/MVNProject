package study.maven.thanhcong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class ThanhcongApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThanhcongApplication.class, args);
	}

}
