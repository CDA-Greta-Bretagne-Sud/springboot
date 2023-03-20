package vannes.lamy.rest.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import vannes.lamy.rest.entity.Livre;

@Repository
public interface  LivreRepository extends JpaRepository<Livre,Integer>{

}
