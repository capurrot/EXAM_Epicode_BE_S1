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
    public void aumentaVolume() {
        volume++;
        System.out.println("Volume aumentato: " + volume);
    }

    public void diminuisciVolume() {
        volume--;
        System.out.println("Volume diminuito: " + volume);
    }

    @Override
    public void play() {
        System.out.println("Riproduzione audio");
    }
}
