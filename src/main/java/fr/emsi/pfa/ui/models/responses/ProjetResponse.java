package fr.emsi.pfa.ui.models.responses;

public class ProjetResponse {

	private String projet_name;
	private String projet_description;
	private String projet_type;
	private boolean etat_projet;

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
