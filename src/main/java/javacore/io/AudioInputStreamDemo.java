package javacore.io;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

/**
 * Created by serezha on 18.08.17.
 */
public class AudioInputStreamDemo {
    public static void main(String[] args) {
        try {
            File file = new File("/home/serezha/Downloads/Samurai_Trap_Bass_Japanese_Type_Beat_Lofi_HipHop_M.wav");
            AudioInputStream stream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(stream);
            clip.start();

            // sleep to allow enough time for the clip to play
            Thread.sleep(500);

            stream.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
