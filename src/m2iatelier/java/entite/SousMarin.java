/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2iatelier.java.entite;

/**
 *
 * @author Administrateur
 */
public class SousMarin extends Vehicule {
    
    private boolean monte;

    public boolean isMonte() {
        return monte;
    }

    public void setMonte(boolean monte) {
        this.monte = monte;
    }
    
    

    public SousMarin(boolean monte, String marque, boolean utilitaire, String modele, String couleur, int nbPlaces, int x, int y, int z, int vitesse) {
        super(marque, utilitaire, modele, couleur, nbPlaces, x, y, z, vitesse);
        this.monte = monte;
    }

    @Override
    public void avancer() {
        super.avancer(); //To change body of generated methods, choose Tools | Templates.
        
        if(this.monte == true){
            this.y = this.y +=pas;
        }else{
            this.y = this.y -= pas;
        }
    }

    @Override
    public void reculer() {
        super.reculer(); //To change body of generated methods, choose Tools | Templates.
        
        if(this.monte == true){
            
        }
    }
    
}
