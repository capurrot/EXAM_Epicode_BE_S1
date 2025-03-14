package it.epicode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean menu = true;
        do {

            // Ho scelto di inserire un menù aggiuntivo per la gestione dell'inserimento e visualizzazione degli elementi

            System.out.println("------  Menu Player  ------");
            System.out.println("################################");
            System.out.println();
            System.out.println("1. Inserisci gli elementi nel player");
            System.out.println("2. Player degli elementi");
            System.out.println("3. Esci");
            System.out.println();
            System.out.println("################################");
            System.out.println();

            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();
            ElementoMultimediale[] elementoMultimediale = new ElementoMultimediale[5];


            switch (scelta) {
                case 1:
                    System.out.println();
                    System.out.println("------  Inserisci i 5 elementi nel player ------");
                    System.out.println();


                    for (int i=0; i<elementoMultimediale.length; i++) {
                        System.out.println("Devi inserire ancora " + (elementoMultimediale.length-i) + " elementi");
                        System.out.println();
                        System.out.println("Inserisci il tipo dell'elemento multimediale: 1 = Immagine, 2 = Audio, 3 = Video");
                        int tipo = scanner.nextInt();
                        switch (tipo) {
                            case 1:
                                System.out.println();
                                System.out.println("Inserisci il titolo dell'immagine:");
                                scanner.nextLine();
                                String titoloImmagine = scanner.nextLine();
                                System.out.println("Inserisci la luminosità dell'immagine:");
                                int luminositaImmagine = scanner.nextInt();
                                elementoMultimediale[i] = new Immagine(titoloImmagine, luminositaImmagine);
                                System.out.println();
                                System.out.println("Immagine con titolo: " + titoloImmagine + " e luminosità: " + luminositaImmagine + " inserita correttamente");
                                System.out.println();
                                System.out.println("*************************************");
                                System.out.println();
                                break;
                            case 2:
                                System.out.println();
                                System.out.println("Inserisci il titolo dell'audio:");
                                scanner.nextLine();
                                String titoloAudio = scanner.nextLine();
                                System.out.println("Inserisci la durata dell'audio:");
                                int durataAudio = scanner.nextInt();
                                System.out.println("Inserisci il volume dell'audio:");
                                int volumeAudio = scanner.nextInt();
                                elementoMultimediale[i] = new RegistrazioneAudio(titoloAudio, durataAudio, volumeAudio);
                                System.out.println();
                                System.out.println("Registrazione audio con titolo: " + titoloAudio + " e durata: " + durataAudio + " inserita correttamente");
                                System.out.println();
                                System.out.println("*************************************");
                                System.out.println();
                                break;
                            case 3:
                                System.out.println();
                                System.out.println("Inserisci il titolo del video:");
                                scanner.nextLine();
                                String titoloVideo = scanner.nextLine();
                                System.out.println("Inserisci la durata del video:");
                                int durataVideo = scanner.nextInt();
                                System.out.println("Inserisci il volume del video:");
                                int volumeVideo = scanner.nextInt();
                                System.out.println("Inserisci la luminosità del video:");
                                int luminositaVideo = scanner.nextInt();
                                elementoMultimediale[i] = new Video(titoloVideo, durataVideo, volumeVideo, luminositaVideo);
                                System.out.println();
                                System.out.println("Video con titolo: " + titoloVideo + " e durata: " + durataVideo + " e luminosità: " + luminositaVideo + " inserito correttamente");
                                System.out.println();
                                System.out.println("*************************************");
                                System.out.println();
                                break;
                        }
                    }
                case 2:
                    System.out.println("Player degli elementi");
                    if (elementoMultimediale != null) {
                        System.out.println();
                        System.out.println("Devi inserire i 5 elementi per essere riprodotti");
                        System.out.println();
                    } else {

                    }
                    break;
                case 3:
                    menu = false;
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        } while (menu);





    }
}
