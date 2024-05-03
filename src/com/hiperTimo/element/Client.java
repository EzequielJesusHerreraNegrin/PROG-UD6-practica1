package com.hiperTimo.element;

import java.util.Stack;

import com.hiperTimo.utilitys.DataGenerator;


public class Client  extends Product{
    protected String name;
    protected Stack<Product> basket = new Stack<Product>();

    public Client() {
        this.name = DataGenerator.RandomClientName();
        this.basket = basket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stack<Product> getBasket() {
        return basket;
    }

    public void setBasket(Stack<Product> basket) {
        this.basket = basket;
    }

    public void FillBaskect(){
        int randomNum = (int)(Math.random() *(11 - 0 + 1) + 0);

        for (int i = 0; i <= randomNum; i++) {
            Product product = new Product();
            basket.push(product);
        }
    }

    public void ShowBasket(){
        int productCounter = 1;
        for (Product product : basket) {
            System.out.println("\n"+productCounter+". "+product);
            productCounter++;
        }
    }

    @Override
    public String toString(){
        String mensaje="Nombre: "+this.name+  "\nTotal de productos: "+basket.size()+ "\n Lista de articulos de la cesta: "; 
        for (Product product : basket) {
            mensaje += "\n"+". "+product;
        }
                return mensaje;
    }
}
