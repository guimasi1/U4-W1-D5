package entities;

import entities.interfaces.Luminosita;
import entities.interfaces.NonRiproducibile;

public class Immagine extends ElementoMultimediale implements Luminosita, NonRiproducibile {

    // ATTRIBUTI

    private int luminosita;

    // COSTRUTTORI
    public Immagine(String title, int luminosita) {
        super(title);
        this.luminosita = luminosita;
    }

    // METODI
    @Override
    public void show() {
        System.out.println("Mostro l'immagine");
    }

    @Override
    public void aumentaLuminosita() {
        System.out.println();
    }

    @Override
    public void diminuisciLuminosita() {

    }
}
