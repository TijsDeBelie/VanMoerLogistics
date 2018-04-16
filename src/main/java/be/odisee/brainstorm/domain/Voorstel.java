
package be.odisee.brainstorm.domain;
import java.lang.String;
import java.util.Date;
import java.util.List;

/**
 * @author aikod
 * @version 1.0
 * @created 25-Mar-2018 23:18:32
 */
public class Voorstel {

	private Aanvraag aanvraag;
	private Locatie bestemming;
	private Chauffeur chauffeur;
	private Date datum;
	private int id;
	private Klant klant;
	private List<Product> producten;
	private String status;
	private int tijd;
	private Transportplanner transportverantwoordelijke;
	private Locatie vertrekpunt;
	private Locatie m_Locatie;
	private Klant m_Klant;
	private Transportplanner m_Transportplanner;
	public Transport m_Transport;



	public void finalize() throws Throwable {

	}

	public Voorstel(){
	}

	/**
	 * 
	 * @param rol
	 */
	public void goedkeuren(Rol rol){
		System.out.println("Beginstatus van Voorstel: " + status);
		String type = rol.getClass().toString();
		if(type.equals("class domain.Transportplanner")){
			status = "vastgelegd";
		} else if(type.equals("Klant")){
			status = "class domain.goedgekeurdKlant";
		} else if(type.equals("goedgekeurdChauffeur")){
			status = "class domain.goedgekeurdChauffeur";
		}
		System.out.println("Eindstatus van Voorstel: " + status);
	}

	public void weigeren(){
		status = "geweigerd";
		System.out.println("Status van Voorstel: " + status);
	}

	public void setStatus(){
		status = "goedgekeurdKlant";
	}

}