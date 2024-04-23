package TestFenetre;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panneau extends JPanel {
    // Attributs

    // Methodes
    public Panneau() {
        super();
    }

    public void paintComponent (Graphics gr){
        // Couleur du trait
        gr.setColor(Color.red);
        
        //Dessin
        gr.fillOval(75,100,100,200);
        gr.setColor(Color.blue);
        gr.drawRect(125,100,200,100);

    }
}
