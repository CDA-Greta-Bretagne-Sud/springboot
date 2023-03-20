package vannes.lamy.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vannes.lamy.rest.entity.Livre;
import vannes.lamy.rest.repository.LivreRepository;
@Service
public class LivreService {

	@Autowired
	LivreRepository livreRepo;
	
	
	public void save(Livre l) {		
		livreRepo.save(l);
	}

	
	public List<Livre> getListeLivre() {
		
		return livreRepo.findAll();
	}

}


