
package com.gonzzportfolio.tomas.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    
    private String nombreExp;
    
    private String descripcionExp;
    
    private String periodoExp;
   
    private String imgExp;

    public Experiencia() {
    }

    public Experiencia(String nombreExp, String descripcionExp, String periodoExp, String imgExp) {
        this.nombreExp = nombreExp;
        this.descripcionExp = descripcionExp;
        this.periodoExp = periodoExp;
        this.imgExp = imgExp;
    }
    
    
    
}
