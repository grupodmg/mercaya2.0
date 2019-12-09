package com.example.mercaya;

import android.view.View;
import android.widget.ImageView;

public class Productos {

    private String name;
    private int imageResource;
    private String detalle;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getdetalle() {
        return detalle;
    }

    public void setdetalle(String detalle) {
        this.detalle = detalle;
    }


    public Productos(String name, int imageResource, String detalle) {
        this.name = name;
        this.imageResource = imageResource;
        this.detalle = detalle;
    }

}
