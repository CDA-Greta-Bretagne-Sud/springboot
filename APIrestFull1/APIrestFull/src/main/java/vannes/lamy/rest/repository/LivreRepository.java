package vannes.lamy.rest.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import vannes.lamy.rest.entity.Livre;

public interface LivreRepository extends JpaRepository<Livre, Integer> {

}
