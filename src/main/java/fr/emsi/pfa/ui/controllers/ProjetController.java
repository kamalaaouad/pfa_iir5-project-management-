package fr.emsi.pfa.ui.controllers;

import fr.emsi.pfa.entities.Projet;
import fr.emsi.pfa.service.implInterfaces.ProjetService;
import net.bytebuddy.build.BuildLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class ProjetController {

    @Autowired
    private ProjetService ps;

    @PostMapping("")
    public void save(@RequestBody Projet pj){
        //System.out.println(pj);
        ps.save(pj);
    }

    @PutMapping("")
    public void update(@RequestBody Projet pj) {
        this.ps.update(pj);
    }

    @GetMapping("{id}")
    public Projet findById(@RequestBody int projet_id) {
        return ps.findById(projet_id);
    }

    @DeleteMapping("")
    public void deleteAll() {
        ps.deleteAll();
    }

    @GetMapping("")
    public List<Projet> findAll() {
        return ps.findAll();
    }


    @DeleteMapping("{id}")
    public void deleteById(@RequestBody int projet_id) {
        ps.deleteById(projet_id);
    }

  /*  @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteByid(@PathVariable("id") int projet_id){
        if(ps.deleteById(projet_id) (null)) {
            return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<String>("deleted",HttpStatus.OK);
    }*/


}
