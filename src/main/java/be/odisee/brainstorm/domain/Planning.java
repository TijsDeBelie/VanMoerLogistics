
package be.odisee.brainstorm.domain;

import java.util.List;
import java.util.Date;

/**
 * @author aikod
 * @version 1.0
 * @created 25-Mar-2018 23:18:16
 */
public class Planning {

	private List<Beschikbaarheid> beschikbaarheden;
	private Chauffeur chauffeur;
	private Date datum;
	private int id;
	private String status;
	private Transportplanner transportplanner;
	private Chauffeur m_Chauffeur;



	public void finalize() throws Throwable {

	}

	public Planning(){

	}

}