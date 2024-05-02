package com.hiperTimo.element;

import com.hiperTimo.utilitys.DataGenerator;

public class Product {
    protected String name;
    protected int id;
    protected float price;

    public Product() {
        this.name = DataGenerator.RandomProductName();
        this.id = DataGenerator.RandomProductID();
        this.price = DataGenerator.RandomProductPrice();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public String toString(){
        return "Nombre del articulo: "+this.name+
                "Precio del articulo: "+this.price+
                "numero de serie : "+this.id;
    }
}
