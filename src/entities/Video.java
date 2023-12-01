package entities;

import entities.interfaces.Luminosita;
import entities.interfaces.Riproducibile;

public class Video extends ElementoMultimediale implements Riproducibile, Luminosita {

    // ATTRIBUTI
    private final int durata;
    private int volume;
    private int luminosita;
    // COSTRUTTORI

    public Video(String title, int durata) {
        super(title);
        this.durata = durata;
        this.luminosita = 10;
        this.volume = 10;
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
        System.out.println("Abbasso il volume");
        this.volume--;
    }

    @Override
    public void alzaVolume() {
        System.out.println("Alzo il volume");
        this.volume++;
    }

    @Override
    public void play() {
        System.out.println("PLAY");
        for (int i = 0; i < this.durata; i++) {
            System.out.println(this.getTitle() + this.puntiEsclamativiVolume() + this.asterischiLuminosita());
        }
        System.out.println("Fine video.");
    }

    @Override
    public StringBuilder puntiEsclamativiVolume() {
        StringBuilder puntiEsclamativi = new StringBuilder();
        for (int i = 0; i < this.volume; i++) {
            puntiEsclamativi.append("!");
        }
        return puntiEsclamativi;
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
        System.out.println("Aumento la luminosita");
        this.luminosita++;
    }

    @Override
    public void diminuisciLuminosita() {
        if(this.luminosita > 1) {
            System.out.println("Diminuisco la luminosità");
            this.luminosita--;
        } else {
            System.out.println("La luminosità è già 0");
        }
    }
}
