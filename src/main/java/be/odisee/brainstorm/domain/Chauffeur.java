

package be.odisee.brainstorm.domain;

import java.util.List;

/**
 * @author aikod
 * @version 1.0
 * @created 25-Mar-2018 23:17:57
 */
public class Chauffeur extends Rol {

	private Transport m_Transport;
	public Beschikbaarheid m_Beschikbaarheid;



	public void finalize() throws Throwable {
		super.finalize();
	}

	public Chauffeur(){

	}

	/**
	 * 
	 * @param transport
	 */
	public void beginTransportLaden(Transport transport){

	}

	public List<Beschikbaarheid> bekijkBeschikbaarheden(){
		return null;
	}

	/**
	 * 
	 * @param bestemming
	 */
	public void krijgRoute(Locatie bestemming){

	}

	/**
	 * 
	 * @param beschikbaarheid
	 */
	public void pasBeschikbaarheidAan(Beschikbaarheid beschikbaarheid){

	}

	/**
	 * 
	 * @param beschikbaarheid
	 */
	public void slaBeschikbaarheidOp(Beschikbaarheid beschikbaarheid){

	}

	/**
	 * 
	 * @param transport
	 */
	public void sluitTransportAf(Transport transport){

	}

	/**
	 * 
	 * @param transport
	 */
	public void startTransport(Transport transport){

	}

	/**
	 * 
	 * @param transport
	 */
	public void transportAangekomen(Transport transport){

	}

	/**
	 * 
	 * @param transport
	 */
	public void transportVertrokken(Transport transport){

	}

}