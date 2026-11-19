package jeu.model;

import jeu.CasseBrique;

import java.awt.*;

public class Cercle extends Sprite {

    protected int vitesseHorizontale;
    protected int vitesseVerticale;



    public void dessiner(Graphics2D dessin) {
        dessin.setColor(couleur);
        dessin.fillOval(x, y,20,20);
    }



    public int getVitesseHorizontale() {
        return vitesseHorizontale;
    }

    public void setVitesseHorizontale(int vitesseHorizontale) {
        this.vitesseHorizontale = vitesseHorizontale;
    }

    public int getVitesseVerticale() {
        return vitesseVerticale;
    }

    public void setVitesseVerticale(int vitesseVerticale) {
        this.vitesseVerticale = vitesseVerticale;
    }


}
