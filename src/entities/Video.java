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
        if (this.volume > 0) {
            System.out.println("Abbasso il volume");
            this.volume--;
        } else {
            System.out.println("Il volume è già a 0");
        }
    }

    @Override
    public void alzaVolume() {
        if (this.volume < 30) {
            System.out.println("Alzo il volume");
            this.volume++;
        } else {
            System.out.println("Il volume è già al massimo");
        }
    }

    @Override
    public void play() {
        System.out.println("PLAY");
        for (int i = 0; i < this.durata; i++) {
            System.out.println(this.getTitolo() + " " + this.puntiEsclamativiVolume() + " " +
            this.asterischiLuminosita());
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
        if (this.luminosita < 30) {
            System.out.println("Aumento la luminosita");
            this.luminosita++;
        } else {
            System.out.println("La luminosità è già al massimo");
        }
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
