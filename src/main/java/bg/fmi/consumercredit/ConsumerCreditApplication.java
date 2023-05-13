package bg.fmi.consumercredit;

import bg.fmi.vaultmanagerclient.annotation.EnableVaultManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableVaultManager
@EnableAutoConfiguration
public class ConsumerCreditApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerCreditApplication.class, args);
	}

}
