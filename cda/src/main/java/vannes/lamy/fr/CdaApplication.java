package vannes.lamy.fr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import vannes.lamy.fr.service.BusinessService;

@SpringBootApplication
public class CdaApplication implements CommandLineRunner {
	
	@Autowired
	private BusinessService bs;

	public static void main(String[] args) {
		SpringApplication.run(CdaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println(bs.getCoucou());
		
	}

}
