package fr.emsi.pfa.ui.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.emsi.pfa.entities.Projet;
import fr.emsi.pfa.service.interfaces.IProjet;

@RestController
@RequestMapping("/api/gestionProjet")
public class ProjetController {
 
	@Autowired
	private IProjet projetService;
	
	@PostMapping("/create")
	public ResponseEntity<Projet> create(@RequestBody Projet p){
		if(projetService.addProjet(p).equals(null)) {
			return new ResponseEntity<Projet>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Projet>(projetService.addProjet(p),HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Projet> update(@RequestBody Projet p){
		if(projetService.updateProjet(p).equals(null)) {
			return new ResponseEntity<Projet>(HttpStatus.NOT_MODIFIED);
		}
		return new ResponseEntity<Projet>(projetService.updateProjet(p),HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteByid(@PathVariable("id") long id){
		if(projetService.deleteProjet(id).equals(null)) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>(projetService.deleteProjet(id),HttpStatus.OK);
	} 
	
	@GetMapping("/get/{id}")
	public Projet getById(@PathVariable("id") long id){
		System.out.println(id);
		return projetService.searchById(id);
//		if(projetService.deleteProjet(id).equals(null)) {
//			return new ResponseEntity<Projet>(HttpStatus.NOT_FOUND);
//		}
//		System.out.println(projetService.searchById(id));
//		return new ResponseEntity<Projet>(projetService.searchById(id),HttpStatus.FOUND);
	}
	@GetMapping("/findAll")
	public ResponseEntity<List<Projet>> getAll(){
		if(projetService.findAllProjets().equals(null)) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<Projet>>(projetService.findAllProjets(),HttpStatus.OK);
		
	}
}
