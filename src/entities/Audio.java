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
            System.out.println(this.getTitle() + this.puntiEsclamativiVolume());
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
        System.out.println("Abbasso il volume");
        this.volume--;
    }

    @Override
    public void alzaVolume() {
        System.out.println("Alzo il volume");
        this.volume++;
    }
}
