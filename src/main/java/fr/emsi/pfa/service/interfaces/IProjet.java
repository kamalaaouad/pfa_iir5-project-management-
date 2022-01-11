package fr.emsi.pfa.service.interfaces;



import java.util.List;

import fr.emsi.pfa.entities.Projet;

public interface IProjet {

	Projet addProjet(Projet p);

	Projet updateProjet(Projet p);

	String deleteProjet(long id);

	List<Projet> findAllProjets();

	Projet searchById(long id);
}
