/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import java.util.Date;
import m2iatelier.java.entite.Film;
import org.junit.Test;

/**
 *
 * @author Administrateur
 */
public class FilmTest {

    @Test
    public void nouveauFilm() {
        
        Date d = new Date();
        Film f1 = new Film();
        
        f1.initialise("dracula", "synVanpir", 2001, d);
//        f1.setTitre ("dracula");
//        f1.setAnneDeProduction(2001);
        f1.affichage();
        
        Film f2 = new Film ();
//        f2.setTitre ("kung fu Panda");
//        f2.setAnneDeProduction(2010);
        
//        System.out.println(f1.getTitre() + ", " + f1.getAnneeDeProduction() + ". " + f2.getTitre() + ", " + f2.getAnneeDeProduction());
//        
//        System.out.println(f1.getAnneeDeProduction());
//        System.out.println(f1.getTitre()+ ", " + f1.getAnneeDeProduction());
//        System.out.println(f2.getAnneeDeProduction());
//        System.out.println(f2.getTitre()+ ", " + f2.getAnneeDeProduction());
                
        

    }



}
