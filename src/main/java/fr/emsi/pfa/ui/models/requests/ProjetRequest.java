package fr.emsi.pfa.ui.models.requests;

public class ProjetRequest {
	
	private long projet_developper_id;
	private long projet_tester_id;
	private String projet_name;
	private String projet_description;
	private String projet_type;
	private boolean etat_projet;

	public long getProjet_developper_id() {
		return projet_developper_id;
	}

	public void setProjet_developper_id(long projet_developper_id) {
		this.projet_developper_id = projet_developper_id;
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

}
