package com.hiperTimo.element;

import java.util.LinkedList;
import java.util.Queue;

public class Cashier {
    private int checkoutPoint;
    private Boolean checkoutPointEstate = false;
    private Queue<Client> fila = new LinkedList<Client>();
    
    public Cashier() {
        this.checkoutPoint = checkoutPoint;
        this.fila = fila;
        this.checkoutPointEstate = checkoutPointEstate;
    }

    public int getCheckoutPoint() {
        return checkoutPoint;
    }

    public void setCheckoutPoint(int checkoutPoint) {
        this.checkoutPoint = checkoutPoint;
    }

    public Queue<Client> getFila() {
        return fila;
    }

    public void setFila(Queue<Client> fila) {
        this.fila = fila;
    }

    public void enqueueClient(){
        if (checkoutPointEstate = true) {
            Client client = new Client();
            fila.add(client);   
            System.out.println("\nUn cliente esta esperando en la fila.");
        } else {
            System.out.println("\nLa caja no está abierta, ningún cliente esperará a ser atendido.");
        }
    }

    public void openCheckoutPoint(){
        if (checkoutPointEstate = false) {
            checkoutPointEstate = true;
            System.out.println("\nLa caja numero"+checkoutPoint+" se ha abierto.");
        }
    }
    
    public void closeCheckoutPoint(){
        if (checkoutPointEstate = true && fila.isEmpty() == true) {
            checkoutPointEstate = false;
            System.out.println("\nLa caja numero"+checkoutPoint+" se ha cerrado.");
        } else {
            System.out.println("\nTodavía hay clientes en la cola, atiendelos antes de cerrar.");
        }
    }

    public void serveClient(){
        if (fila.isEmpty() == false) {
            System.out.println(fila.poll());
        } else{
            System.out.println("No hay nadie esperando en la fila.");
        }
    }
}
