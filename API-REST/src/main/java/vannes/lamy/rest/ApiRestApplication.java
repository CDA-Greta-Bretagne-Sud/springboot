package vannes.lamy.rest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vannes.lamy.rest.entity.Livre;
import vannes.lamy.rest.service.LivreService;

@SpringBootApplication
public class ApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestApplication.class, args);
	}
@Bean
public CommandLineRunner demo(LivreService LivreService) {
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

}
