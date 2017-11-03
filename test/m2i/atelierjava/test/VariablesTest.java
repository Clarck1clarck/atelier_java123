package m2i.atelierjava.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class VariablesTest {
    
    
    public void testConcerneKingstonEtJamaique () {
       
        String a = "Jamaique";
        String b = "kingston";
        String c = b.toUpperCase() + ", " + a.toUpperCase();
        
        System.out.println(c);
    }

    
    public void testex2(){
    
        int a = 123;
    String b = "Coucou";
    String c = a+b;
    String d = b+a;
    
        System.out.println(c);
        System.out.println(d);
    
    }
   
    public void testex3 (){
        
        int a = 10;
        String b = "20";
        int c = a+Integer.parseInt(b);
        int d = Integer.parseInt(b)+a;
        
        System.out.println("a+b = " + c);
        System.out.println("b+a = " + d);
        
    }
    
    public int carre (int nb){
        
        int resultat = nb * nb;
        return resultat;
        
    }
    
    public void testex4(){
        
        int resultat = carre(100);
        
        System.out.println(resultat);
    }
}
    

