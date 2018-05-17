package secondhandtrade.paltform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("secondhandtrade.paltform.*")
public class PaltformApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaltformApplication.class, args);
	}
}
