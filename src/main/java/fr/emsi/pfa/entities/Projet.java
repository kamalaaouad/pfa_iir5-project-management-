package fr.emsi.pfa.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Projet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int projet_id;
	private long projetdevelopperid;
	private long projet_tester_id;
	private String projet_name;
	private String projet_description;
	private String projet_type;
	private boolean etat_projet;

	public int getProjet_id() {
		return projet_id;
	}

	public void setProjet_id(int projet_id) {
		this.projet_id = projet_id;
	}

	public long getProjet_developper_id() {
		return projetdevelopperid;
	}

	public void setProjet_developper_id(long projet_developper_id) {
		this.projetdevelopperid = projet_developper_id;
	}

	public long getProjet_tester_id() {
		return projet_tester_id;
	}

	public void setProjet_tester_id(long projet_tester_id) {
		this.projet_tester_id = projet_tester_id;
	}

	public String getProjet_name() {
		return projet_name;
	}

	public void setProjet_name(String projet_name) {
		this.projet_name = projet_name;
	}

	public String getProjet_description() {
		return projet_description;
	}

	public void setProjet_description(String projet_description) {
		this.projet_description = projet_description;
	}

	public String getProjet_type() {
		return projet_type;
	}

	public void setProjet_type(String projet_type) {
		this.projet_type = projet_type;
	}

	public boolean isEtat_projet() {
		return etat_projet;
	}

	public void setEtat_projet(boolean etat_projet) {
		this.etat_projet = etat_projet;
	}

	@Override
	public String toString() {
		return "Projet{" +
				"projet_id=" + projet_id +
				", projet_developper_id=" + projetdevelopperid +
				", projet_tester_id=" + projet_tester_id +
				", projet_name='" + projet_name + '\'' +
				", projet_description='" + projet_description + '\'' +
				", projet_type='" + projet_type + '\'' +
				", etat_projet=" + etat_projet +
				'}';
	}
}
