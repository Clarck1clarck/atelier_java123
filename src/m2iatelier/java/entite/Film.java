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
public class Film {

    private String titre;
    private String synopsis;
    private int anneeDeProduction;
    private Date dateCreation;
    
    public void initialise (String titre, String synopsis, int anneDeProduction, Date dateCreation){
        this.titre = titre;
        this.synopsis = synopsis;
        this.anneeDeProduction = anneDeProduction;
        this.dateCreation = dateCreation;
    }
    
    public void affichage (){
        System.out.println(titre + " " + synopsis + " " + anneeDeProduction + " " + dateCreation);
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String t) {
        titre = t;
    }

    public int getAnneeDeProduction() {
        return anneeDeProduction;
    }

    public void setAnneDeProduction(int a) {
        anneeDeProduction = a;
    }

    

}
