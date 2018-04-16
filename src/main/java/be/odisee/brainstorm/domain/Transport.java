

package be.odisee.brainstorm.domain;

import java.util.List;

/**
 * @author aikod
 * @version 1.0
 * @created 25-Mar-2018 23:18:29
 */
public class Transport {

	private Locatie bestemming;
	private Locatie huidige_locatie;
	private int id;
	private Route optimaleRoute;
	private List<Product> producten;
	private int status;
	private Locatie vertrekpunt;
	private Voorstel voorstel;
	private Locatie m_Locatie;
	private Route m_Route;
	private Beschikbaarheid m_Beschikbaarheid;



	public void finalize() throws Throwable {

	}

	public Transport(){

	}

	public void aangekomen(){

	}

	public void beginLaden(){

	}

	public void sluitAf(){

	}

	public void start(){

	}

	public void vertrokken(){

	}

}