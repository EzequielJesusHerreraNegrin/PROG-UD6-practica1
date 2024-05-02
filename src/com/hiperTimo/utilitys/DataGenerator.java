package com.hiperTimo.utilitys;

public class DataGenerator {
    private static String[] productName = {"Sofía","Juan","María","Alejandro","Valentina","Diego","Camila","Carlos","Gabriela","Andrés","Lucía","Daniel","Isabella","Mateo","Valeria","Santiago","Ana","Nicolás","Laura","Manuel"};
    private static String[] clientName = {"Café gourmet","Smartphone Xplorer","Auriculares SoundWave","Zapatillas AirRun","Camisa Evergreen","Tableta Digital Plus","Perfume Elegance","Crema Hidratante SilkSkin","Mochila Adventure","Reloj ChronoMaster","Bolígrafo Diamond","Barra de chocolate Supreme"};
    protected static String clientWallet;
    protected static String productPrice;
    protected static String productID;

    public static String RandomProductName(){
        int randomNum = (int)(Math.random() *(12 - 0 + 1) + 0);
        return productName[randomNum];
    }
    public static String RandomClientName(){
        int randomNum = (int)(Math.random() *(12 - 0 + 1) + 0);
        return clientName[randomNum];
    }
    public static float RandomClientWallet(){
        float randomNum = (float)(Math.random() *( 1000000- 1000 + 1) + 1000);
        return randomNum;
    }
    public static float RandomProductPrice(){
        return (float)Math.floor(Math.random() *(1000 - 0 + 1) + 0);
    }
    public static int RandomProductID(){
        int randomNum = (int)(Math.random() *( 1000000- 1000 + 1) + 1000);
        return randomNum;
    }


}
