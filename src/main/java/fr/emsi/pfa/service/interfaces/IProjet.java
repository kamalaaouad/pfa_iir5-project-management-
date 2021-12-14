package fr.emsi.pfa.service.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import fr.emsi.pfa.entities.Projet;

public interface IProjet {

	ResponseEntity<Projet> addProjet(Projet p);

	ResponseEntity<Projet> updateProjet(Projet p);

	ResponseEntity<String> deleteProjet(long id);

	List<Projet> findAllProjets();

	Projet searchById(long id);
}
