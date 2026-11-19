package jeu.model;

import jeu.CasseBrique;

import java.awt.*;

public class Balle extends Cercle {

    public Balle() {
        this.x = (int)(Math.random() * CasseBrique.LARGEUR);
        this.y = (int)(Math.random() * CasseBrique.HAUTEUR);
        this.vitesseHorizontale = (int)(Math.random() * 9) + 1;
        this.vitesseVerticale = (int)(Math.random() * 9) + 1;
        this.couleur = new Color(
                (float)Math.random(),
                (float)Math.random(),
                (float)Math.random());
    }

    public Balle(int x, int y, int vitesseHorizontale, int vitesseVerticale) {
        this.x = x;
        this.y = y;
        this.vitesseHorizontale = vitesseHorizontale;
        this.vitesseVerticale = vitesseVerticale;
    }

    public void deplacement() {
        x += vitesseHorizontale;
        y += vitesseVerticale;

        if(x < 0 || x > CasseBrique.LARGEUR - 20) {
            vitesseHorizontale = -vitesseHorizontale;
        }

        if(y < 0 || y > CasseBrique.HAUTEUR - 20) {
            vitesseVerticale = -vitesseVerticale;
        }
    }

    public void inverserVitesseVerticale() {

        vitesseVerticale = -vitesseVerticale;

    }

}
