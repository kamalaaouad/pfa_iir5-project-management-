package fr.emsi.pfa.io.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import fr.emsi.pfa.entities.Projet;

@EnableJpaRepositories
public interface ProjetRepository extends JpaRepository<Projet, Long> {

}
