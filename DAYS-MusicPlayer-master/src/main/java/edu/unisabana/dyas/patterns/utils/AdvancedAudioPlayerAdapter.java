package edu.unisabana.dyas.patterns.utils;
/**
 *
 * @author David Lopez
 */
public class AdvancedAudioPlayerAdapter implements AudioPlayer {

    public AdvancedAudioPlayerAdapter(AdvancedAudioPlayer advancedAudioPlayer) {
    }
    

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType) {
            case "mp4" -> {
                AdvancedAudioPlayer mp4 =new AdvancedAudioPlayer();
                mp4.playMp4(fileName);
            }   
            case "vlc" -> {
                AdvancedAudioPlayer vlc = new AdvancedAudioPlayer();
                vlc.playVlc(fileName);
            }
            default -> System.out.println("Tipo de archivo ingresado Invalido");
        }
    }

    @Override
    public void stop() {
        AdvancedAudioPlayer stop = new AdvancedAudioPlayer();
        stop.stop();
    }
       

}
