package vannes.lamy.rest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Livre {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String auteur;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String name) {
        this.nom = name;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String author) {
        this.auteur = author;
    }

	@Override
	public String toString() {
		return "Livre [id=" + id + ", nom=" + nom + ", auteur=" + auteur + "]";
	}

}

