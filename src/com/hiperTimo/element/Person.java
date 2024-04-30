package com.hiperTimo.element;

import java.util.ArrayList;

public class Person {

    protected final static String[] names = {"Sofía","Juan","María","Alejandro","Valentina","Diego","Camila","Carlos","Gabriela","Andrés","Lucía","Daniel","Isabella","Mateo","Valeria","Santiago","Ana","Nicolás","Laura","Manuel"};
    protected static final  float[] wallets = {235.34f, 74.12f, 42.2f, 87.15f, 10.5f, 20.82f,31.2f,51.5f,100f,15f};


    public static   String randomName(){
        int randomNum = (int)Math.floor(Math.random() *(20 - 0 + 1) + 0);
        return names[randomNum];
    }

    public static   float randomWallet(){
        int randomNum = (int)Math.floor(Math.random() *(10 - 0 + 1) + 0);
        return wallets[randomNum];
    }
}
