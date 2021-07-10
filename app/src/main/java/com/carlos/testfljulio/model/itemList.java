package com.carlos.testfljulio.model;

import java.io.Serializable;

public class itemList implements Serializable {
    private String titulo;
    private String descripcion;
    private String categoria;
    private int imgResource;

    public itemList(String titulo, String descripcion, String categoria, int imgResource) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.imgResource = imgResource;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getImgResource() {
        return imgResource;
    }
}
