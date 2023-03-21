package vannes.lamy.rest.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import vannes.lamy.rest.entity.Livre;
import vannes.lamy.rest.service.LivreServiceImp;

@RestController
public class LivreController {

	private LivreServiceImp livreService;

	@Autowired
	public LivreController(final LivreServiceImp ls) {
		this.livreService = ls;
	}

	@RequestMapping(value = "/livre/{livreId}", method = RequestMethod.GET)

	Livre getLivreById(@PathVariable final Integer livreId) {

		return this.livreService.getLivreById(livreId);

	}

	@RequestMapping(value = "/livres", method = RequestMethod.GET)

	List<Livre> getAllLivre() {

		return this.livreService.getListeLivre();

	}

	@RequestMapping(value = "/livre/{nom}/{auteur}", method = RequestMethod.POST)

	String ajoutLivre(@PathVariable final String nom, @PathVariable final String auteur) {

		Livre l = new Livre();
		l.setAuteur(auteur);
		l.setNom(nom);

		try {
			this.livreService.save(l);
		} catch (Exception e) {

			System.out.print("Erreur ajout livre:" + e);
		}

		return "Livre ajouté en base de données! ";
	}
	@RequestMapping(value = "/livre/{livreId}/{nom}/{auteur}", method = RequestMethod.PUT)

	String updateLivre(@PathVariable final Integer livreId,@PathVariable final String nom,@PathVariable final String auteur) {

		Livre l = new Livre();
		l.setAuteur(auteur);
		l.setNom(nom);
		l.setId(livreId);

		try {
			this.livreService.save(l);
		} catch (Exception e) {

			System.out.print("Erreur update livre:" + e);
		}

		return "Livre mis à jour en base de données! ";
	}
		
	@RequestMapping(value = "/livre/{livreId}", method = RequestMethod.DELETE)

	String deleteLivreById(@PathVariable final Integer livreId) {
		
		try {

		this.livreService.suppression(livreId);
		
		}
		catch (Exception e) {

			System.out.print("Erreur delete livre:" + e);
		}
		return "Livre supprimé en base de données! ";
	}
	@RequestMapping(value = "/livres", method = RequestMethod.DELETE)

	String deleteAllLivre() {
		
		try {

		this.livreService.suppressionAll();
		
		}
		catch (Exception e) {

			System.out.print("Erreur delete tous les livres:" + e);
		}
		return "tous les Livres supprimés en base de données! ";
	}
	@RequestMapping(value = "/rechercheLivre/{nomLivre}", method = RequestMethod.GET)

	 Livre getLivreByName(@PathVariable final String nomLivre) {

		return this.livreService.getLivreByName(nomLivre);

	}



}
