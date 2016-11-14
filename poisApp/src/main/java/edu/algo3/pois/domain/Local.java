package edu.algo3.pois.domain;

/**
 * Created by Laboratorio on 01/11/2016.
 */
public class Local extends Poi {
    private String categoria;

    public Local(int id) {
        super(id);

    }

    public String getCategoria () {
        return categoria;
    }

    public void setCategoria (String categoria) {
        this. categoria = categoria;
    }


}
