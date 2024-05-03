import java.util.Scanner;

import com.hiperTimo.element.Cashier;

public class App {
    public static void main(String[] args) throws Exception {
        Cashier cajero = new Cashier();
        cajero.openCheckoutPoint();
        cajero.enqueueClient();
        cajero.serveClient();

        /* Client client = new Client();
        client.FillBaskect();
        System.out.println(client); */
    }
}
