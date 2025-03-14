package it.epicode;

public class OmniPlayer {
    public static void riproduci(Riproducibile riproducibile) {
        if (riproducibile != null) {
            riproducibile.play();
        }
    }

    public static void visualizza(Visualizzabile visualizzabile) {
        if (visualizzabile != null) {
            visualizzabile.show();
        }
    }
}
