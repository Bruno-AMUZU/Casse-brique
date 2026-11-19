package jeu.model;

import jeu.CasseBrique;

import java.awt.*;

public class Bonus extends Cercle {

    public Bonus(){
        this.x = (int)(Math.random() * CasseBrique.LARGEUR);
        this.y = 20;
        this.vitesseHorizontale = (int)(Math.random() * 9) + 1;
        this.vitesseVerticale = (int)(Math.random() * 9) + 1;
        this.couleur = new Color(
                (float)Math.random(),
                (float)Math.random(),
                (float)Math.random());
    }

    public void deplacement() {
        x += vitesseHorizontale;
        y += vitesseVerticale;

        if(x < 0 || x > CasseBrique.LARGEUR - 20) {
            vitesseHorizontale = -vitesseHorizontale;
        }
    }
}
