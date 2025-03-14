package it.epicode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class ElementoMultimediale {
    private String title;

    public abstract void esegui();
}
