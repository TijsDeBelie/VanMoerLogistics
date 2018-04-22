
package be.odisee.brainstorm.domain;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="rol")
public abstract  class Rol {
	@Column(name="familienaam")
	private String familienaam;
	@Column(name="gebruikersnaam")
	private String gebruikersnaam;
	@Id @GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="paswoord")
	private String paswoord;
	@Column(name="status")
	private String status;
	@Column(name="voornaam")
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