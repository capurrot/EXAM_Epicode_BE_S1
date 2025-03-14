package it.epicode;

import lombok.Getter;

import java.util.Scanner;

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

    //metodo che ritorna asterischi per la luminosita della registrazione
    public String getAsterischi() {
        String asterischi = "";
        for (int i = 0; i < luminosita; i++) {
            asterischi += "*";
        }
        return asterischi;
    }


    @Override
    public void show() {
        Scanner scanner = new Scanner(System.in);
        boolean cambiaLuminosita = true;
        do {
            System.out.println("Visualizzazione immagine: " + getTitle() + " " + getAsterischi());
            System.out.println("La luminosita é impostato a: " + luminosita + ". Vuoi alzare o abbassare la luminosita? (s: Sì/n: No)");
            String scelta = scanner.nextLine();
            if (scelta.equals("s")) {
                System.out.println("Vuoi alzare o abbassare la luminosita? (+: Alza/-: Abbassa)");
                String scelta2 = scanner.nextLine();
                if (scelta2.equals("+")) {
                    aumentaLuminosita();
                } else if (scelta2.equals("-")) {
                    diminuisciLuminosita();
                }
            } else if (scelta.equals("n")) {
                cambiaLuminosita = false;
            } else {
                System.out.println("Scelta non valida. Riprova.");
            }
        } while (cambiaLuminosita);

    }

    @Override
    public void esegui() {
        show();
    }
}
