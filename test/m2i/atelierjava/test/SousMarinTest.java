/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2iatelier.java.entite.SousMarin;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Administrateur
 */
public class SousMarinTest {
    
    @Test
    public void sousMarinMonteTest(){
        SousMarin s = new SousMarin(true, "JFK", true, "modele", "couleur", 0, 0, 0, 0, 10);
        s.avancer();
        Assert.assertEquals(10, s.getZ());
        Assert.assertEquals(10, s.getY());
        s.affichage();
        s.avancer();
        s.affichage();
    }
    
    
    
}