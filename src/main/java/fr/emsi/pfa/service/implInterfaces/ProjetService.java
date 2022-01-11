package fr.emsi.pfa.service.implInterfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.emsi.pfa.entities.Projet;
import fr.emsi.pfa.io.repositories.ProjetRepository;
import fr.emsi.pfa.service.interfaces.IProjet;

@Service
public class ProjetService implements IProjet {

	@Autowired
	private ProjetRepository pr;

	@Override
	public Projet addProjet(Projet p) {
		try {
			return pr.save(p);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public Projet updateProjet(Projet p) {
		try {
			return pr.save(p);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public String deleteProjet(long id) {
		Optional<Projet> projet = pr.findById(id);
		if (projet.isPresent()) {
			pr.delete(projet.get());
			return "deleted";
		}else
		   return null;
	}

	@Override
	public List<Projet> findAllProjets() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public Projet searchById(long id) {
		System.out.println("id service ===="+id);
		Optional<Projet> projet = pr.findById(id);
		if (projet.isPresent())
			return projet.get();
		else
		    return null;
	}

}
