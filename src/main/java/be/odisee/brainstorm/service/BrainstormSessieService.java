package be.odisee.brainstorm.service;

import be.odisee.brainstorm.domain.*;
import java.util.List;

public interface BrainstormSessieService {

    public List<Klant> geefAlleKlanten();

    public Klant voegKlantToe(String voornaam,String familienaam,String gebruikersnaam, String paswoord, String bedrijfsnaam, String emailadres);

    public Klant zoekKlantMetId(int id);

	public Klant zoekKlantMetEmail(String email);
}