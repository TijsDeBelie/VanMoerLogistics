
package be.odisee.brainstorm.domain;


import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Date;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * @author aikod
 * @version 1.0
 * @created 25-Mar-2018 23:18:12
 */



@Entity
@Table(name="klant")
public class Klant extends Rol {
	@Column(name="bedrijfsnaam")
	private String bedrijfsnaam;
	@Column(name="emailadres")
	private String emailadres;

	public Klant() {

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

		public Klant(String voornaam,String familienaam,String gebruikersnaam, String paswoord, String status, String bedrijfsnaam, String emailadres){
		this.setVoornaam(voornaam);
		this.setFamilienaam(familienaam);
		this.setGebruikersnaam(gebruikersnaam);
		this.setPaswoord(paswoord);
		this.setStatus(status);
		this.setBedrijfsnaam(bedrijfsnaam);
		this.setEmailadres(emailadres);
	}

	public java.lang.String bekijkTransportStatus(){
		return "";
	}

	/**
	 * 
	 * @param voorstel
	 */
	public void bekijkVoorstel(Voorstel voorstel){

	}

	/**
	 * 
	 * @param transport
	 */
	public Locatie krijgTransportLocatie(Transport transport){
		return null;
	}

	/**
	 * 
	 * @param klant
	 * @param bestemming
	 * @param vertrekpunt
	 * @param producten
	 * @param tijd
	 * @param datum
	 */
	public void vraagTransportAan(Klant klant, Locatie bestemming, Locatie vertrekpunt, List<Product> producten, int tijd, Date datum){

	}

	public String getBedrijfsnaam() {
		return bedrijfsnaam;
	}


	public void setBedrijfsnaam(String bedrijfsnaam) {
		this.bedrijfsnaam = bedrijfsnaam;
	}

	public String getEmailadres() {
		return emailadres;
	}

	public void setEmailadres(String emailadres) {
		this.emailadres = emailadres;
	}
}