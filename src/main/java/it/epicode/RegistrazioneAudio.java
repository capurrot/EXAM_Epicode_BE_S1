package it.epicode;

import lombok.Getter;

import java.util.Scanner;

@Getter
public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
    private int durata;
    private int volume;

    //costruttori che implementano la superclasse
    public RegistrazioneAudio(String title, int durata, int volume) {
        super(title);
        this.durata = durata;
        this.volume = volume;
    }

    //metodi per aumentare e diminuire il volume
    public void alzaVolume() {
        volume++;
        System.out.println("Volume aumentato: " + volume);
    }

    public void abbasaVolume() {
        volume--;
        System.out.println("Volume diminuito: " + volume);
    }

    //metodo che ritorna punti esclamativi per il volume della registrazione
    public String getPuntiEsclamativi() {
        String puntiEsclamativi = "";
        for (int i = 0; i < volume; i++) {
            puntiEsclamativi += "!";
        }
        return puntiEsclamativi;
    }

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean cambiaVolume = true;
        do {
            for (int i = 0; i < durata; i++) {
                System.out.println("Riproduzione registrazione audio: " + getTitle() + " " + getPuntiEsclamativi());
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
