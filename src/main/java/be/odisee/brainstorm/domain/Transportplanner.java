
package be.odisee.brainstorm.domain;
import java.util.List;
import java.util.Date;

/**
 * @author aikod
 * @version 1.0
 * @created 25-Mar-2018 23:18:30
 */
public class Transportplanner extends Rol {

	private String emailadres;
	public Planning m_Planning;
	private Transport m_Transport;



	public void finalize() throws Throwable {
		super.finalize();
	}

	public Transportplanner(){

	}

	/**
	 * 
	 * @param aanvraag
	 */
	public void bekijkAanvraag(Aanvraag aanvraag){

	}

	public void krijgLijstAanvragen(){

	}

	/**
	 * 
	 * @param voorstel
	 */
	public void legVoorstelVast(Voorstel voorstel){

	}

	/**
	 * 
	 * @param aanvraag
	 * @param chauffeur
	 * @param klant
	 * @param producten
	 * @param locatie
	 * @param datum
	 * @param tijd
	 */
	public void maakVoorstelAan(Aanvraag aanvraag, Chauffeur chauffeur, Klant klant, List<Product> producten, Locatie locatie, Date datum, int tijd){

	}

	/**
	 * 
	 * @param voorstel
	 */
	public void pasVoorstelAan(Voorstel voorstel){

	}

	/**
	 * 
	 * @param aanvraag
	 */
	public void weigerAanvraag(Aanvraag aanvraag){

	}

}