package fr.emsi.pfa.service.implInterfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import fr.emsi.pfa.entities.Projet;
import fr.emsi.pfa.service.interfaces.IProjet;

public class ProjetService implements IProjet {

	@Override
	public ResponseEntity<Projet> addProjet(Projet p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Projet> updateProjet(Projet p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<String> deleteProjet(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Projet> findAllProjets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Projet searchById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
