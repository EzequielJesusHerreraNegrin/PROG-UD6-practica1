import java.util.Scanner;

import com.hiperTimo.element.Cashier;

public class App {
    public static void main(String[] args) throws Exception {
        Cashier cajero = new Cashier();
        Scanner scaner = new Scanner(System.in);
        String option = "1";
        String menu = """
                \n-----------------*HiperTimo*-----------------
                        1. Abrir caja.
                        2. Añadir un cliente a la cola.
                        3. Atender a un clietne.
                        4. Ver clientes pendientes.
                        0. Cerrar supermercado.
                -----------SELECCIONE UNA OPCION-------------
                """;

        while (!option.contains("0")) {
            System.out.println(menu);
            option = scaner.next();
            switch (option) {
                case "1":
                    System.out.println("""
                    -----------------*OPCION*-----------------
                                1. Abrir caja.
                    ------------------------------------------
                            """);
                    cajero.openCheckoutPoint();
                    
                    break;
            
                case "2":
                System.out.println("""
                    -----------------*OPCION*-----------------
                        2. Añadir un cliente a la cola.
                    ------------------------------------------
                        """);
                    cajero.enqueueClient();
                    break;
            
                case "3":
                System.out.println("""
                    -----------------*OPCION*-----------------
                            3. Atender a un clietne.
                    ------------------------------------------
                        """);

                    cajero.serveClient();
                    break;
            
                case "4":
                    
                    break;
            
                case "0":
                System.out.println("""
                    -----------------*OPCION*-----------------
                            0. Cerrar supermercado.
                    ------------------------------------------
                        """);

                    option = cajero.closeMarket();
                    break;
            
                default:
                    System.out.println("No se contempla ese valor.\nIntroduzca uno de los indices.");
                    break;
            }
        }
        scaner.close();
    }
}
