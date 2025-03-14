package it.epicode;

import lombok.Getter;

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
    public void aumentaVolume() {
        volume++;
        System.out.println("Volume aumentato: " + volume);
    }

    public void diminuisciVolume() {
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

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println("Riproduzione video");
    }
}
