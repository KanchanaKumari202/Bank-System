package com.bank.system.Bank_System_Kanchana;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Kanchana's Banking App",
				description = "Backend Rest APIs for Banking App",
				version = "v1.0",
				contact = @Contact(
						name = "Kanchana Kumari",
						email = "ckkumari202@gmail.com",
						url = "https://github.com/KanchanaKumari202/Bank-System"
				),
				license = @License(
						name = "Kanchana Kumari",
						url = "https://github.com/KanchanaKumari202/Bank-System"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Kanchana's Banking App Documentation",
				url = "https://github.com/KanchanaKumari202/Bank-System"
		)
)

public class BankSystemKanchanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankSystemKanchanaApplication.class, args);
	}

}
