/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import m2iatelier.java.entite.Synthetiseur;
import org.junit.Test;

/**
 *
 * @author Administrateur
 */
public class SynthetiseurTest {
 
//    @Test
    public void alumageOnOffOK(){
        
        Synthetiseur yamaha = new Synthetiseur();
        
        yamaha.allumageOnOff();
        yamaha.allumageOnOff();
        
        
    }
    
//    @Test
    public void testJouerNoteOk(){
        Synthetiseur synth = new Synthetiseur();
        
        
    }
    @Test
    public void testVolumePlusOk(){
        
        Synthetiseur s1 = new Synthetiseur();
        s1.allumageOnOff();
        s1.volumePlus();
        s1.volumePlus();
        s1.volumePlus();
        s1.volumePlus();
        s1.volumePlus();
        s1.volumePlus();
        s1.volumePlus();
        s1.volumePlus();
        System.out.println( s1.getVolume() );
    }
    
//    @Test
    public void b() throws MidiUnavailableException, InterruptedException{
        Synthesizer synth = MidiSystem.getSynthesizer();
        
        synth.open();
        MidiChannel[] channels = synth.getChannels();
        Instrument[] instrus = synth.getDefaultSoundbank().getInstruments();
        synth.loadInstrument( instrus[1] );
        channels[5].noteOn(30, 600);
        Thread.sleep(10000);
    }
    
}
