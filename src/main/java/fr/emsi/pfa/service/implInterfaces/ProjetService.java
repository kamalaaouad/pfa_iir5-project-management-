package fr.emsi.pfa.service.implInterfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import fr.emsi.pfa.entities.Projet;
import fr.emsi.pfa.service.interfaces.IProjet;
import org.springframework.stereotype.Service;

@Service
public class ProjetService{

	@Autowired
	private IProjet iapp;


	public void save(Projet p) {
		 iapp.save(p);
	}

	public void update(Projet up) {
		this.iapp.findById((int)up.getProjet_id())
				.map(item -> {
					item.setEtat_projet(up.isEtat_projet());
					item.setProjet_description(up.getProjet_description());
					item.setProjet_developper_id(up.getProjet_developper_id());
					item.setProjet_type(up.getProjet_type());
					item.setProjet_name(up.getProjet_name());
					item.setProjet_tester_id(up.getProjet_tester_id());
					return this.iapp.save(item);
				}).orElseGet(() -> {
			up.setProjet_id((int) up.getProjet_id());
			return this.iapp.save(up);
		});
	}


	public Projet findById(int projet_id) {
		return iapp.findById(projet_id).get();
	}


	public void deleteAll() {
		iapp.deleteAll();
	}

	public List<Projet> findAll() {
		return iapp.findAll();
	}

	public void deleteById(int projet_id) {
		iapp.deleteById(projet_id);
	}
}
