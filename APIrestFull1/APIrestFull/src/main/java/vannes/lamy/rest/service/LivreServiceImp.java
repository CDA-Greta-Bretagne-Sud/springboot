package vannes.lamy.rest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import vannes.lamy.rest.entity.Livre;
import vannes.lamy.rest.repository.LivreRepository;
import org.springframework.stereotype.Service;



import org.springframework.beans.factory.annotation.Autowired;

@Service
public class LivreServiceImp implements LivreService {
	@Autowired
	LivreRepository livreRepo;
	
	@Override
	public void save(Livre l) {		
		livreRepo.save(l);
	}

	@Override
	public List<Livre> getListeLivre() {
		
		if(livreRepo.count()>0) {
		return livreRepo.findAll();
		}
		return new ArrayList<>();
	}

	@Override
	public Livre getLivreById(Integer id) {
		
		Optional<Livre> livreResponse =  livreRepo.findById(id);
		if(livreResponse.isPresent()){
		Livre l = livreResponse.get();
		return l;
		}
		return new Livre();

	}


}
