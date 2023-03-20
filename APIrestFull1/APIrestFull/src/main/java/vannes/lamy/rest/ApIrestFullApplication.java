package vannes.lamy.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import vannes.lamy.rest.entity.Livre;
import vannes.lamy.rest.service.LivreServiceImp;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ApIrestFullApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApIrestFullApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(LivreServiceImp LivreService) {
		return (args) -> {
			Livre Livre1 = new Livre();
			// save few Livre
			Livre1.setNom("Les Miserables");
			Livre1.setAuteur("Victor Hugo");

			Livre Livre2 = new Livre();
			Livre2.setNom("1984");
			Livre2.setAuteur("Georges orwell");

			LivreService.save(Livre1);
			LivreService.save(Livre2);

			// fetch all Livre
			System.out.println("-----List of Livres------");
			for (Livre Livre : LivreService.getListeLivre()) {
				System.out.println("Livre Detail:" + Livre);
			}
		};
	}

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("vannes.lamy.rest")).build();
	}

}
