/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2iatelier.java.main;

import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class PointEntree {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {

        String monLogin;
        Scanner maVarScanner = new Scanner (System.in);
        
        System.out.print("Votre identifiant:");
        monLogin = maVarScanner.nextLine();
        
        System.out.print("Votre mot-de-passe:");
        monLogin = maVarScanner.nextLine();
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = b + s + i;
        System.out.println(l);

    }
}
