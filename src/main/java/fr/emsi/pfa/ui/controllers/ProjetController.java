package fr.emsi.pfa.ui.controllers;

import fr.emsi.pfa.entities.Projet;
import fr.emsi.pfa.service.implInterfaces.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Api/gestionProjet")
public class ProjetController {

    @Autowired
    private ProjetService ps;

    @PostMapping("/")
    public void save(Projet pj){
        ps.save(pj);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Projet pj) {
        this.ps.update(pj);
    }

    @GetMapping("/id/{id}")
    public Projet findById(int id) {
        return ps.findById(id);
    }

    @DeleteMapping("/deleteAll/")
    public void deleteAll() {
        ps.deleteAll();
    }

    @GetMapping("/findAll/")
    public List<Projet> findAll() {
        return ps.findAll();
    }

    @DeleteMapping("/deleteId/{id}")
    public void deleteById(@PathVariable int id) {
        ps.deleteById(id);
    }


}
