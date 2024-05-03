package com.hiperTimo.element;

import java.util.LinkedList;
import java.util.Queue;

public class Cashier {
    private int checkoutPoint = 1;
    private Boolean checkoutPointOperativeEstate = false;
    private Queue<Client> fila = new LinkedList<Client>();
    
    public Cashier() {
        this.checkoutPoint = checkoutPoint;
        this.fila = fila;
        this.checkoutPointOperativeEstate = checkoutPointOperativeEstate;
    }
    
    public Boolean getCheckoutPointOperativeEstate() {
        return checkoutPointOperativeEstate;
    }

    public void setCheckoutPointOperativeEstate(Boolean checkoutPointOperativeEstate) {
        this.checkoutPointOperativeEstate = checkoutPointOperativeEstate;
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
        if (checkoutPointOperativeEstate == true) {
            Client client = new Client();
            fila.add(client);   
            System.out.println("\nUn cliente esta esperando en la fila.");
        } else {
            System.out.println("\nLa caja no está abierta, ningún cliente esperará a ser atendido.");
        }
    }

    public void openCheckoutPoint(){
        if (this.checkoutPointOperativeEstate == false) {
            this.checkoutPointOperativeEstate = true;
            System.out.println("\nLa caja numero "+this.checkoutPoint+" se ha abierto.");
        }
    }
    
    public void closeCheckoutPoint(){
        if (this.checkoutPointOperativeEstate == false && fila.isEmpty() == true) {
            this.checkoutPointOperativeEstate = false;
            System.out.println("\nLa caja numero "+this.checkoutPoint+" se ha cerrado.");
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

    public void checkQueue(){
        if (fila.isEmpty() == false) {
            System.out.println("Hay "+fila.size()+" clietnes, esperando a ser atendidos en la caja "+this.checkoutPoint+".");
        } else{
            System.out.println("No hay nadie esperando en la caja "+this.checkoutPoint+".");
        }
    }

    public String closeMarket(){
        String value ="";
        if (this.checkoutPointOperativeEstate == false) {
            System.out.println("El establecimiento ha cerrado sus puertas.");
            value ="0";
        } else{
            System.out.println("Antes de cerrar el local, debe cerrar la caja para no recibir mas clientes.");
        }
        return value;
    }
}
