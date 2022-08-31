package com.gonzzportfolio.tomas.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProDto {

    private String nombrePro;

    private String descripcionPro;

    private String fechaPro;

    private String imgPro;

    private String urlPro;

    public ProDto() {
    }

    public ProDto(String nombrePro, String descripcionPro, String fechaPro, String imgPro, String urlPro) {
        this.nombrePro = nombrePro;
        this.descripcionPro = descripcionPro;
        this.fechaPro = fechaPro;
        this.imgPro = imgPro;
        this.urlPro = urlPro;
    }

}
