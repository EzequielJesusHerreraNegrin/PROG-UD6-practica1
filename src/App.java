import com.hiperTimo.element.Cashier;
import com.hiperTimo.element.Client;

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
