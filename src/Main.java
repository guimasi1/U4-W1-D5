import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immagine;
import entities.Video;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ElementoMultimediale[] elementiMultimediali = new ElementoMultimediale[5];

    public static void main(String[] args) {
        aggiungiMedia();
        player();
    }
    public static void aggiungiMedia() {
        String sceltaTipo;
        String titolo;
        int durata;
        for (int i = 0; i < elementiMultimediali.length; i++) {
            do {
                System.out.println("Scegli il tipo di media: 1 - audio, 2 - immagine, 3 - video.");
                sceltaTipo = scanner.nextLine();
            } while (!sceltaTipo.matches("[123]"));
            System.out.println("Inserisci il nome del file.");
            titolo = scanner.nextLine();
            switch (sceltaTipo) {
                case "1":
                    do {
                        System.out.println("Inserisci la durata dell'audio. Deve essere un numero positivo.");
                        durata = Integer.parseInt(scanner.nextLine());
                    } while(!(durata > 0));
                    elementiMultimediali[i] = new Audio(titolo, durata);
                    break;
                case "2":
                    elementiMultimediali[i] = new Immagine(titolo);
                    break;
                case "3":
                    do {
                        System.out.println("Inserisci la durata del video. Deve essere un numero positivo.");
                        durata = Integer.parseInt(scanner.nextLine());
                    } while(!(durata > 0));
                    elementiMultimediali[i] = new Video(titolo, durata);
                    break;
                default:
                    System.out.println("Errore.");
            }
        }

    }
    public static void player() {
        System.out.println("Apro la console");
        boolean exit = false;
        do {

            System.out.println("Questi sono i media disponibili");
            for (ElementoMultimediale elemento : elementiMultimediali
            ) {
                System.out.println(elemento.getTitolo() + " " + elemento.getClass().getSimpleName());
            }
            int elementoScelto;
            do {
                System.out.println("Inserisci un numero da 1 a 5.");
                System.out.println("Se vuoi uscire dalla console premi 0.");
                elementoScelto = Integer.parseInt(scanner.nextLine());
            } while (!(elementoScelto <= 5 && elementoScelto >= 0));

            if (elementoScelto == 0) {
                exit = true;
                System.out.println("Chiudo il programma.");
                break;
            }

            String azione;
            int numeroVolume;
            int numeroLuminosità;

            if (elementiMultimediali[elementoScelto - 1] instanceof Audio) {
                do {
                    System.out.println("Premi p per far partire l'audio.");
                    System.out.println("Premi '+' per aumentare il volume e '-' per diminuirlo.");
                    azione = scanner.nextLine();
                    if (azione.equals("+")) {
                        System.out.println("Di quanto vuoi aumentare il volume?");
                        numeroVolume = Integer.parseInt(scanner.nextLine());
                        for (int i = 0; i < numeroVolume; i++) {
                            ((Audio) elementiMultimediali[elementoScelto - 1]).alzaVolume();
                        }
                    }
                    if (azione.equals("-")) {
                        System.out.println("Di quanto vuoi diminuire il volume?");
                        numeroVolume = Integer.parseInt(scanner.nextLine());
                        for (int i = 0; i < numeroVolume; i++) {
                            ((Audio) elementiMultimediali[elementoScelto - 1]).abbassaVolume();
                        }
                    }
                } while (!azione.equals("p"));
                ((Audio) elementiMultimediali[elementoScelto - 1]).play();
            }
            if (elementiMultimediali[elementoScelto - 1] instanceof Immagine) {
                do {
                    System.out.println("Premi 'm' per mostrare l'immagine.");
                    System.out.println("Premi '+' per aumentare la luminosità o '-' per diminuirla.");
                    azione = scanner.nextLine();
                    if (azione.equals("+")) {
                        System.out.println("Di quanto vuoi aumentare la luminosità?");
                        numeroLuminosità = Integer.parseInt(scanner.nextLine());
                        for (int i = 0; i < numeroLuminosità; i++) {
                            ((Immagine) elementiMultimediali[elementoScelto - 1]).aumentaLuminosita();
                        }
                    }
                    ;
                    if (azione.equals("-")) {
                        System.out.println("Di quanto vuoi diminuire la luminosità?");
                        numeroLuminosità = Integer.parseInt(scanner.nextLine());
                        for (int i = 0; i < numeroLuminosità; i++) {
                            ((Immagine) elementiMultimediali[elementoScelto - 1]).diminuisciLuminosita();
                        }
                    }
                    ;
                } while (!azione.equals("m"));
                ((Immagine) elementiMultimediali[elementoScelto - 1]).show();
            }
            if (elementiMultimediali[elementoScelto - 1] instanceof Video) {
                do {
                    System.out.println("Premi p per far partire il video.");
                    System.out.println("Premi '+' per aumentare il volume e '-' per diminuirlo.");
                    System.out.println("Premi 'a' per aumentare la luminosità e 'd' per diminuirla.");
                    azione = scanner.nextLine();
                    if (azione.equals("+")) {
                        System.out.println("Di quanto vuoi aumentare il volume?");
                        numeroVolume = Integer.parseInt(scanner.nextLine());
                        for (int i = 0; i < numeroVolume; i++) {
                            ((Video) elementiMultimediali[elementoScelto - 1]).alzaVolume();
                        }
                    }
                    if (azione.equals("-")) {
                        System.out.println("Di quanto vuoi diminuire il volume?");
                        numeroVolume = Integer.parseInt(scanner.nextLine());
                        for (int i = 0; i < numeroVolume; i++) {
                            ((Video) elementiMultimediali[elementoScelto - 1]).abbassaVolume();
                        }
                        if (azione.equals("a")) {
                            System.out.println("Di quanto vuoi aumentare la luminosità?");
                            numeroLuminosità = Integer.parseInt(scanner.nextLine());
                            for (int i = 0; i < numeroLuminosità; i++) {
                                ((Video) elementiMultimediali[elementoScelto - 1]).aumentaLuminosita();
                            }
                        }
                        if (azione.equals("d")) {
                            System.out.println("Di quanto vuoi diminuire la luminosità?");
                            numeroLuminosità = Integer.parseInt(scanner.nextLine());
                            for (int i = 0; i < numeroLuminosità; i++) {
                                ((Video) elementiMultimediali[elementoScelto - 1]).diminuisciLuminosita();
                            }
                        }
                    }
                } while (!azione.equals("p"));
                ((Video) elementiMultimediali[elementoScelto - 1]).play();
            }

        } while(!exit);
    }
}