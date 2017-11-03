/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2iatelier.java.entite;

import java.util.Date;

/**
 *
 * @author Administrateur
 */
public class Serie {

        private String titre;
        private int anneeDeSortie;
        private int nbSaison;
        private String synopsis;
        
        
        public void initialise(String titre, int anneeDeSortie, int nbSaison, String synopsis){
            
            this.titre = titre;
            this.anneeDeSortie = anneeDeSortie;
            this.nbSaison = nbSaison;
            this.synopsis = synopsis;
            
        }

        public void affichage(){
            
            System.out.println(titre + " " + anneeDeSortie + " " + synopsis + " " + nbSaison);
        }
        
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnneeDeSortie() {
        return anneeDeSortie;
    }

    public void setAnneeDeSortie(int anneeDeSortie) {
        this.anneeDeSortie = anneeDeSortie;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getNbSaison() {
        return nbSaison;
    }

    public void setNbSaison(int NbSaison) {
        this.nbSaison = NbSaison;
    }

        

    
}
