package be.odisee.brainstorm.controller;

import be.odisee.brainstorm.domain.Klant;
import be.odisee.brainstorm.service.BrainstormSessieService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class PersoonController {

    @Autowired
    protected BrainstormSessieService brainstormSessieService=null; // ready for dependency injection

    @RequestMapping(value={"/home.html","/index.html","lijst.html"},method=RequestMethod.GET)
    public String index(ModelMap model){
        List<Klant> deLijst = brainstormSessieService.geefAlleKlanten();
        model.addAttribute("klanten", deLijst);
        return "/index";
    }
    // je zal naar index.jsp gaan

    @RequestMapping(value={"/persoon.html"},method=RequestMethod.GET)
    public String persoonDetail(@RequestParam("id") Integer id, ModelMap model){
        Klant klant = brainstormSessieService.zoekKlantMetId(id);
        model.addAttribute("klant", klant);
        return "/klant";
    }
    // je zal naar persoon.jsp gaan
    
    @RequestMapping(value={"/persoonviamail.html"},method=RequestMethod.GET)
    public String persoonDetailViaEmail(@RequestParam("email") String email, ModelMap model){
        Klant klant = brainstormSessieService.zoekKlantMetEmail(email);
        model.addAttribute("klant", klant);
        return "/klant";
    }
    // je zal naar persoon.jsp gaan
    
    @RequestMapping(value={"/nieuweKlant.html"},method=RequestMethod.GET)
    public String klantFormulier(ModelMap model){
        Klant klant = new Klant();
        model.addAttribute("deklant", klant);
        return "/nieuweKlant";
    }
    // je zal naar nieuwePersoon.jsp gaan

    @RequestMapping(value={"/nieuweKlant.html"},method=RequestMethod.POST)
    public String persoonToevoegen(@ModelAttribute("deklant") Klant klant, ModelMap model){
        Klant toegevoegdKlant = brainstormSessieService.voegKlantToe(klant.getVoornaam(),
                klant.getFamilienaam(),
                klant.getPaswoord(),
                klant.getGebruikersnaam(),
                klant.getBedrijfsnaam(),
                klant.getEmailadres());
        System.out.println("DEBUG klantgegevens familienaam: "+klant.getFamilienaam());
        return "redirect:klant.html?id="+toegevoegdKlant.getId();
    }
    // je zal naar de detailpagina van de toegevoegde persoon gaan

}
