package fr.emsi.pfa.service.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import fr.emsi.pfa.entities.Projet;
import org.springframework.stereotype.Repository;

@Repository
public interface IProjet extends JpaRepository<Projet, Integer> {

/*	ResponseEntity<Projet> addProjet(Projet p);

	ResponseEntity<Projet> updateProjet(Projet p);

	ResponseEntity<String> deleteProjet(long id);

	List<Projet> findAllProjets();

	Projet searchById(long id);*/
}
