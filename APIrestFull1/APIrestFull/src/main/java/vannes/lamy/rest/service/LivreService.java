package vannes.lamy.rest.service;

import java.util.List;

import vannes.lamy.rest.entity.Livre;
public interface LivreService {
	
	void save(Livre l);
	List<Livre> getListeLivre();
	Livre getLivreById(Integer id);
	

}
