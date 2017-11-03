/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2iatelier.java.entite.Serie;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class SerieTest {
    
    @Test
    public void affichageTeste() {
        
        Serie s1 = new Serie ();
        s1.initialise("Dexter", 2008, 8, "synopsis" );
//        s1.setTitre ("Dexter");
//        s1.setAnneeDeSortie (2008);
//        s1.setNbSaison(8);
//        s1.setSynopsis("");
s1.affichage();
    }
    
}
