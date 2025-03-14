package it.epicode;

import lombok.Getter;

import java.util.Scanner;

@Getter
public class Video extends ElementoMultimediale implements Riproducibile {
    private int durata;
    private int volume;
    private int luminosita;

    //construttori per la classe Video
    public Video(String title, int durata, int volume, int luminosita) {
        super(title);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    //metodi per aumentare e diminuire il volume e la luminosita
    public void alzaVolume() {
        volume++;
        System.out.println("Volume aumentato: " + volume);
    }

    public void abbasaVolume() {
        volume--;
        System.out.println("Volume diminuito: " + volume);
    }

    public void aumentaLuminosita() {
        luminosita++;
        System.out.println("Luminosità aumentata: " + luminosita);
    }

    public void diminuisciLuminosita() {
        luminosita--;
        System.out.println("Luminosità diminuita: " + luminosita);
    }

    //metodo che ritorna punti esclamativi per il volume della registrazione
    public String getPuntiEsclamativi() {
        String puntiEsclamativi = "";
        for (int i = 0; i < volume; i++) {
            puntiEsclamativi += "!";
        }
        return puntiEsclamativi;
    }

    //metodo che ritorna asterischi per la luminosita della registrazione
    public String getAsterischi() {
        String asterischi = "";
        for (int i = 0; i < luminosita; i++) {
            asterischi += "*";
        }
        return asterischi;
    }


    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean cambiaVolume = true;
        boolean cambiaLuminosita = true;
        do {
            for (int i = 0; i < durata; i++) {
                System.out.println("Riproduzione video: " + getTitle() + " " + getPuntiEsclamativi() + " " + getAsterischi());
            }
            System.out.println("Il volume é impostato a: " + volume + ". Vuoi alzare o abbassare il volume? (s: Sì/n: No)");
            String scelta = scanner.nextLine();
            if (scelta.equals("s")) {
                System.out.println("Vuoi alzare o abbassare il volume? (+: Alza/-: Abbassa)");
                String scelta2 = scanner.nextLine();
                if (scelta2.equals("+")) {
                    alzaVolume();
                } else if (scelta2.equals("-")) {
                    abbasaVolume();
                }
            } else if (scelta.equals("n")) {
                cambiaVolume = false;
                for (int i = 0; i < durata; i++) {
                    System.out.println("Riproduzione video: " + getTitle() + " " + getPuntiEsclamativi() + " " + getAsterischi());
                }
                cambiaLuminosita = true;
                do {
                    System.out.println("La luminosita é impostata a: " + luminosita + ". Vuoi alzare o abbassare la luminosita? (s: Sì/n: No)");
                    String scelta3 = scanner.nextLine();
                    if (scelta3.equals("s")) {
                        System.out.println("Vuoi alzare o abbassare la luminosita? (+: Alza/-: Abbassa)");
                        String scelta4 = scanner.nextLine();
                        if (scelta4.equals("+")) {
                            aumentaLuminosita();
                        } else if (scelta4.equals("-")) {
                            diminuisciLuminosita();
                        }
                    } else if (scelta3.equals("n")) {
                        cambiaLuminosita = false;
                    } else {
                        System.out.println("Scelta non valida. Riprova.");
                    }
                } while (cambiaLuminosita);
            } else {
                System.out.println("Scelta non valida. Riprova.");
            }
        } while (cambiaVolume);
    }

    @Override
    public void esegui() {
        play();
    }
}
