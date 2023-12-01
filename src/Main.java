import entities.Audio;
import entities.Immagine;
import entities.Video;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Audio audio1 = new Audio("bellaciao", 10);
        audio1.play();

        Video video1 = new Video("nono", 20);
        video1.diminuisciLuminosita();
        video1.diminuisciLuminosita();
        video1.diminuisciLuminosita();
        video1.diminuisciLuminosita();
        video1.play();

        Immagine immagine1 = new Immagine("gioconda");
        immagine1.diminuisciLuminosita();
        immagine1.diminuisciLuminosita();
        immagine1.diminuisciLuminosita();
        immagine1.diminuisciLuminosita();
        immagine1.diminuisciLuminosita();
        immagine1.diminuisciLuminosita();
        immagine1.diminuisciLuminosita();
        immagine1.diminuisciLuminosita();
        immagine1.diminuisciLuminosita();
        immagine1.diminuisciLuminosita();
        immagine1.diminuisciLuminosita();
        immagine1.diminuisciLuminosita();
        immagine1.show();
    }
}