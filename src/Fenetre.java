package TestFenetre;

import javax.swing.JFrame;

public class Fenetre extends JFrame {
    // Attributs
    Panneau monPan = new Panneau();

    // Methodes
    public Fenetre (){
        // Titre
        this.setTitle("Ma premiere fenetre");

        // Taille
        this.setSize(800, 600);

        // Position
        this.setLocationRelativeTo(null);

        // Fermeture
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Ajout du panneau
        this.setContentPane(monPan);

        // Visible ?
        this.setVisible(true);
    }
    public static void main(String[] args) {

    }
}
