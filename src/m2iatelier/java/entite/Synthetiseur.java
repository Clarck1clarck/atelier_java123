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
public class Synthetiseur {

    private boolean on;
    private String instrument;
    private int volume;

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {

        this.instrument = instrument;
    }

    public int getVolume() {
        return this.volume;
    }
    
    
    

    public void allumageOnOff() {
        if (this.on == true) {
            // il est allumé => on l'éteint
            this.on = false;
            System.out.println("Synthé éteint.");
        } else {
            // éteint => on l'allume
            this.on = true;
            instrument = "Piano";
            volume = 5;
            this.afficher();
        }
    }

    public void afficher() {
        System.out.println("Synthé allumé. Instrument : " + this.instrument + ", Volume : " + this.volume);
    }

    public void ajouterVolume(int quantiteDeVolume) {

        this.volume = quantiteDeVolume + this.volume;
        if (this.volume >10){
            this.volume = 10;
        }
        this.afficher();

    }

    public void volumePlus() {
        if (this.volume < 10) {
            this.volume = volume + 1;
        } else {
            System.out.println("Volume max atteint");
        }
        this.afficher();
    }

    public void volumeMoins() {
        if (this.volume > 0) {
            this.volume--;
        } else {
            if (this.on) {
                System.out.println("Volume min atteint");
            }
        }
        this.afficher();
    }

    public void jouerNote(String noteAJouer) {
        if (this.on == true) {
            System.out.print("jouer : " + noteAJouer + " : ");
        } else {
            System.out.print("Le synthé est éteint ");
        }
        this.afficher();
    }

}
