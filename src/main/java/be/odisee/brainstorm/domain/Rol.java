
package be.odisee.brainstorm.domain;
import java.util.List;

/**
 * @author aikod
 * @version 1.0
 * @created 25-Mar-2018 23:18:19
 */
public abstract  class Rol {

	private String familienaam;
	private String gebruikersnaam;
	private int id;
	private String paswoord;
	private String status;
	private String voornaam;



	public void finalize() throws Throwable {

	}

	public Rol(){

	}

	/**
	 * 
	 * @param voorstel
	 */
	public void keurVoorstelGoed(Voorstel voorstel){
		voorstel.goedkeuren(this);
	}

	public List<Transport> krijgLijstTransporten(){
		return null;
	}

	public List<Voorstel> krijgLijstVoorstellen(){
		return null;
	}

	/**
	 * 
	 * @param voorstel
	 */
	public void weigerVoorstel(Voorstel voorstel){
		voorstel.weigeren();
	}

	public String getFamilienaam() {
		return familienaam;
	}

	public void setFamilienaam(String familienaam) {
		this.familienaam = familienaam;
	}

	public String getGebruikersnaam() {
		return gebruikersnaam;
	}

	public void setGebruikersnaam(String gebruikersnaam) {
		this.gebruikersnaam = gebruikersnaam;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPaswoord() {
		return paswoord;
	}

	public void setPaswoord(String paswoord) {
		this.paswoord = paswoord;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
}