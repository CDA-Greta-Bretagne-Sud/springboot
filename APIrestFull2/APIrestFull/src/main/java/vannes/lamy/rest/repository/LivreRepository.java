package vannes.lamy.rest.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import vannes.lamy.rest.entity.Livre;
@Repository
public interface LivreRepository extends JpaRepository<Livre, Integer> {

	 @Query(value = "SELECT * FROM Livre WHERE nom=?1",nativeQuery = true)
     public Livre findByNom(String nom);
	
}
