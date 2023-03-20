package vannes.lamy.fr.service;

import org.springframework.stereotype.Component;
import vannes.lamy.fr.model.Metier;

@Component
public class BusinessService {

	public Metier getCoucou() {

		Metier m = new Metier();
		m.setValue("Coucou les cdas!");

		return m;
	}

}
