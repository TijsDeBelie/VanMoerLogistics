
package be.odisee.brainstorm.domain;
import java.util.Date;

import java.util.List;

/**
 * @author aikod
 * @version 1.0
 * @created 25-Mar-2018 23:17:53
 */
public class Aanvraag {

	private Locatie bestemming;
	private Date datum;
	private int id;
	private Klant klant;
	private List<Product> producten;
	private String status;
	private int tijd;
	private Transportplanner transportverantwoordelijke;
	private Locatie vertrekpunt;
	private Locatie m_Locatie;
	public Voorstel m_Voorstel;
	private Klant m_Klant;
	private Transportplanner m_Transportplanner;



	public void finalize() throws Throwable {

	}

	public Aanvraag(){

	}

	public void accepteren(){

	}

	public void terugAanvragen(){

	}

	public void weigeren(){

	}

}