package entities;

import entities.interfaces.Riproducibile;

public class Audio extends ElementoMultimediale implements Riproducibile {

    // ATTRIBUTI
    private final int durata;
    private int volume;

    // COSTRUTTORI
    public Audio(String title, int durata) {
        super(title);
        this.durata = durata;
        this.volume = 10;
    }

    // METODI

    @Override
    public void play() {
        System.out.println("PLAY");
        for (int i = 0; i < this.durata; i++) {
            System.out.println(this.getTitolo() + " " + this.puntiEsclamativiVolume());
        }
        System.out.println("Fine audio.");
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


}
