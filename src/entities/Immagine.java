package entities;

import entities.interfaces.Luminosita;
import entities.interfaces.NonRiproducibile;

public class Immagine extends ElementoMultimediale implements Luminosita, NonRiproducibile {

    // ATTRIBUTI

    private int luminosita;

    // COSTRUTTORI
    public Immagine(String title) {
        super(title);
        this.luminosita = 10;
    }

    // METODI
    @Override
    public void show() {
        System.out.println("Mostro l'immagine");
        System.out.println(this.getTitolo() + this.asterischiLuminosita());
    }

    @Override
    public StringBuilder asterischiLuminosita() {
        StringBuilder asterischi = new StringBuilder();
        for (int i = 0; i < this.luminosita; i++) {
            asterischi.append("*");
        }
        return asterischi;
    }

    @Override
    public void aumentaLuminosita() {
        System.out.println("Aumento la luminosità");
        this.luminosita++;
    }

    @Override
    public void diminuisciLuminosita() {
        if(this.luminosita > 0) {
            System.out.println("Diminuisco la luminosità");
            this.luminosita--;
        } else {
            System.out.println("La luminosità è già 0");
        }
    }
}
