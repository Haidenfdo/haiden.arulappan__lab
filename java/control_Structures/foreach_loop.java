package control_Structures;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class foreach_loop {
    public static void main(String[] args) {
        String[] languages = { "Tamil", "English", "Hindi", "Telugu" };

        for (String i : languages) {
            System.out.println(i);
        }
    }
}
