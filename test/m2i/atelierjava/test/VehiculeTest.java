/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2iatelier.java.entite.Avion;
import m2iatelier.java.entite.SousMarin;
import m2iatelier.java.entite.Vehicule;
import org.junit.Test;

/**
 *
 * @author Administrateur
 */
public class VehiculeTest {
    
    @Test
    public void sousMarinMonteTest(){
        SousMarin s = new SousMarin(true, "JFK", true, "modele", "couleur", 0, 0, 0, 0, 12);
        s.avancer();
        s.affichage();
        s.avancer();
        s.affichage();
    }
    
    
//    @Test
//    public void testIf(){
//        
//        int a = 10;
//        int b = 20;
//        
//        if (a==b){
//            System.out.println("Plus petit");
//        }else{
//            System.out.println("Plus grand ou égal");
//        }
//    }
//    @Test
    public void testAvion(){
        
        Avion a = new Avion("boeing", true, "457", "blanc", 0, 0, 0, 0, 150);
        
        a.avancer();
        a.affichage();
        
        
    }
//    @Test
    public void testVehicule(){
        
        Vehicule vehic1 = new Vehicule("Ferrari", true, "F-50", "rouge", 2, 0, 0, 0, 100);
        
        vehic1.affichage();
        vehic1.avancer();
        vehic1.affichage();
        vehic1.avancer();
        vehic1.affichage();
        vehic1.avancer();
        vehic1.affichage();
        vehic1.reculer();
        vehic1.affichage();
        vehic1.reculer();
        vehic1.affichage();
        
        
    }
    
}
