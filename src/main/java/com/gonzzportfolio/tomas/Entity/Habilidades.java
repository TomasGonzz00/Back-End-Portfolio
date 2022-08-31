
package com.gonzzportfolio.tomas.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
@Entity
public class Habilidades implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    
    private String nombreHab;
    
    private int  porcentaje;
    
    private String color;

    public Habilidades() {
    }

    public Habilidades(String nombreHab, int porcentaje, String color) {
        this.nombreHab = nombreHab;
        this.porcentaje = porcentaje;
        this.color = color;
    }
    
}
