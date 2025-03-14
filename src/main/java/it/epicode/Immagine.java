package it.epicode;

import lombok.Getter;

@Getter
public class Immagine extends ElementoMultimediale implements Visualizzabile {
    private int luminosita;

    //costruttore che estende il costruttore di ElementoMultimediale
    public Immagine(String title, int luminosita) {
        super(title);
        this.luminosita = luminosita;
    }

    //metodi per aumentare e diminuire la luminosita
    public void aumentaLuminosita() {
        luminosita++;
        System.out.println("Luminosità aumentata: " + luminosita);
    }

    public void diminuisciLuminosita() {
        luminosita--;
        System.out.println("Luminosità diminuita: " + luminosita);
    }

    @Override
    public void show() {
        System.out.println("Visualizzazione immagine" + getTitle());
    }
}
