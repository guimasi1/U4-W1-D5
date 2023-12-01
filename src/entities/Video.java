package entities;

import entities.interfaces.Luminosita;
import entities.interfaces.Riproducibile;

public class Video extends ElementoMultimediale implements Riproducibile, Luminosita {

    // ATTRIBUTI
    private final int durata;
    private int luminosita;
    // COSTRUTTORI

    public Video(String title, int durata, int luminosita) {
        super(title);
        this.durata = durata;
        this.luminosita = luminosita;
    }

    // GETTER


    public int getDurata() {
        return durata;
    }

    public int getLuminosita() {
        return luminosita;
    }

    // METODI
    @Override
    public void abbassaVolume() {

    }

    @Override
    public void alzaVolume() {

    }

    @Override
    public void play() {

    }

    @Override
    public StringBuilder puntiEsclamativiVolume() {

        return null;
    }

    @Override
    public void aumentaLuminosita() {

    }

    @Override
    public void diminuisciLuminosita() {

    }
}
