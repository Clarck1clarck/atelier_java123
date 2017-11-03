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
 
    
    public void synthetiseurTest()throws MidiUnavailableException, InterruptedException{
        
        Synthetiseur s1 = new Synthetiseur()
    }
    
    @Test
    public void testJouerNoteOk(){
        Synthesizer synth = new Synthetiseur();
        
        synth
    }
    @Test
    public void testVolumePlusOk(){
        Synthetiseur s1 = new Synthetiseur();
        System.out.println(s1.getVolume());
        s1.volumePlus();
    }
    
//    @Test
    public void synthetiseurTest() throws MidiUnavailableException, InterruptedException{
        Synthesizer synth = MidiSystem.getSynthesizer();
        
        synth.open();
        MidiChannel[] channels = synth.getChannels();
        Instrument[] instrus = synth.getDefaultSoundbank().getInstruments();
        synth.loadInstrument( instrus[1] );
        channels[5].noteOn(30, 600);
        Thread.sleep(10000);
    }
    
}
