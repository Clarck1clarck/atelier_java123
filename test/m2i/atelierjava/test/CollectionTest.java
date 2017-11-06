/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class CollectionTest {
 
//    @Test
    public void testList(){
        List<String> listeFilms = new ArrayList<>();
        listeFilms.add("Dracula");
        listeFilms.add("Matrix");
        listeFilms.add("Winnie l'ourson");
        
        for (String film : listeFilms) {
            
            System.out.println(film);
        }
    }
    
    @Test
   public void testSommeListFranceBelgiquePlusListeEspagneItTotal4OK(){
       List<String> listePays1 = new ArrayList<>();
       listePays1.add("France");
       listePays1.add("Belgique");
       
       List<String> listepays2 = new ArrayList<>();
       listepays2.add("Espagne");
       listepays2.add("Italie");
       
       List<String> listTotale = new ArrayList<>();
       listTotale.addAll(listePays1);
       listTotale.addAll(listepays2);
       
       int nbElem = listTotale.size();
       Assert.assertEquals(4, nbElem);
       
//       for (String pays : listTotale){
//           
//           System.out.println(pays);
//       }
   }
    
}
