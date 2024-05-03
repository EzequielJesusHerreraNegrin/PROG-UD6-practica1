package com.hiperTimo.element;

import com.hiperTimo.utils.DataGenerator;

public class Product {
    protected String name;

    public Product() {
        this.name = DataGenerator.RandomProductName();
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String toString(){

        return " Nombre del articulo: "+this.name;
    }
}
