package com.gonzzportfolio.tomas.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombrePro;

    private String descripcionPro;

    private String fechaPro;

    private String imgPro;
    
    private String urlPro;

    public Proyecto() {
    }

    public Proyecto(String nombrePro, String descripcionPro, String fechaPro, String imgPro, String urlPro) {
        this.nombrePro = nombrePro;
        this.descripcionPro = descripcionPro;
        this.fechaPro = fechaPro;
        this.imgPro = imgPro;
        this.urlPro = urlPro;
    }
    
    
}
