package com.hiperTimo.utils;

public class DataGenerator {
    private static String[] clientName = {"Sofía","Juan","María","Alejandro","Valentina","Diego","Camila","Carlos","Gabriela","Andrés","Lucía","Daniel","Isabella","Mateo","Valeria","Santiago","Ana","Nicolás","Laura","Manuel"};
    private static String[] productName = {"Café gourmet","Smartphone Xplorer","Auriculares SoundWave","Zapatillas AirRun","Camisa Evergreen","Tableta Digital Plus","Perfume Elegance","Crema Hidratante SilkSkin","Mochila Adventure","Reloj ChronoMaster","Bolígrafo Diamond","Barra de chocolate Supreme"};

    public static String RandomProductName(){
        int randomNum = (int)(Math.random() *(11 - 0 + 1) + 0);
        return productName[randomNum];
    }
    public static String RandomClientName(){
        int randomNum = (int)(Math.random() *(19 - 0 + 1) + 0);
        return clientName[randomNum];
    }


}
