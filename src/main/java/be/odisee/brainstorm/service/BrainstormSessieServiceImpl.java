package be.odisee.brainstorm.service;

import be.odisee.brainstorm.domain.*;
import be.odisee.brainstorm.dao.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.*;

@Service("brainstormSessieService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly=true)
public class BrainstormSessieServiceImpl implements BrainstormSessieService {

    @Autowired
    private PersoonRepository persoonRepository = null;

    public BrainstormSessieServiceImpl(){}

    public List<Klant> geefAlleKlanten() {
        return persoonRepository.findAll();
    }

	@Transactional(propagation= Propagation.REQUIRED,readOnly=false)
    public Klant zoekKlantMetId(int id){
		return persoonRepository.findOne(id);
    }
    
	@Transactional(propagation= Propagation.REQUIRED,readOnly=false)
	@Override
	public Klant zoekKlantMetEmail(String email) {
		return persoonRepository.findByEmailadres(email);
	}

	@Transactional(propagation= Propagation.REQUIRED,readOnly=false)
    public Klant voegKlantToe(String voornaam,String familienaam,String gebruikersnaam, String paswoord, String bedrijfsnaam, String emailadres) {

    	return persoonRepository.save( createKlant(voornaam,familienaam,gebruikersnaam, paswoord, "actief", bedrijfsnaam, emailadres) );
    }

    private Klant createKlant(String voornaam,String familienaam,String gebruikersnaam, String paswoord, String status, String bedrijfsnaam, String emailadres){

    	return new Klant(voornaam,familienaam,gebruikersnaam, paswoord, status, bedrijfsnaam, emailadres);
	}

}