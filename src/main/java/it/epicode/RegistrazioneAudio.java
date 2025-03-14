package it.epicode;

import lombok.Getter;

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
        for (int i = 0; i < durata; i++) {
            System.out.println("Riproduzione registrazione audio: " + getTitle() + " " + getPuntiEsclamativi());
        }
    }
}
