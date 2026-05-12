package segundocorte.tallerSegundoCorte.Medium;

import java.util.Scanner;

public class Stockroom {

    private static Scanner sc = new Scanner(System.in);

    private static String[] products = {"pan de queso", "pan mogolla", "desodorante", "arroz", "harina"};
    private static int[] productsQuantity = {20, 2, 7, 5, 3};
    private static float[] productPrice = {300.0f, 300.0f, 4500.0f, 2500.0f, 3500.0f};

    static void started (){

        String salir = "";

        while(!(salir.equals("s"))){

            IO.println("\n======================");
            IO.println(" INVENTARIA DE TIENDA ");
            IO.println("======================\n");

            showAllProducts();

            IO.print("¿Quieres termianr la ejecución? (s/n): ");
            sc.nextLine();
            salir = sc.nextLine();

        }

    }

    private static void showAllProducts() {

        int iteration = 0;

        while(iteration < 5){

            IO.println("Nombre del producto: " + products[iteration]);
            IO.println("\tCantidad del producto: " + productsQuantity[iteration]);
            IO.println("\tprecio del producto: $" + productPrice[iteration] + "COP.\n");

            iteration++;

        }

        getStockPrice();
    }

    private static void getStockPrice(){

        int iteration = 0;
        float totalAmount = 0;

        while (iteration < 5){

            totalAmount = totalAmount + (productsQuantity[iteration] * productPrice[iteration]);

            iteration++;

        }

        IO.println("El precio total del inventario es de: $" + totalAmount + "COP.\n");

        getProductsWithLess5Quantity();
    }

    private static void getProductsWithLess5Quantity(){

        int iteration = 0;

        while(iteration < 5){

            if(productsQuantity[iteration] < 5){
                IO.println(products[iteration] + " tiene menos de 5 productos");
            }

            iteration++;
        }

    }

}
