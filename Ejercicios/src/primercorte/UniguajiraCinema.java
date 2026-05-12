package primercorte;

import java.util.Scanner;

public class UniguajiraCinema {

    public static Scanner sc = new Scanner (System.in);

    public static void stared() {

        IO.print("Cuantas personas realizaran la compra: ");
        int peopleNumber = sc.nextInt();
        sc.nextLine();

        makeOrder(peopleNumber);

    }

    private static void makeOrder(int peopleNumber) {

        final int TICKPRICE = 8000;
        double totalSales = 0;

        for (int i = 0; i < peopleNumber; i++){

            double totalToPay;
            double totalDiscount = 0;

            IO.print("Ingrese el nombre del usuario: ");
            String customerName = sc.nextLine();

            IO.println("hola " + customerName + "BIENVENIDO A CINE UNIGUAJIRA");

            IO.print("Ingrese su edad: ");
            int customerAge = sc.nextInt();
            sc.nextInt();

            IO.print("Cuantas entradas vas a comprar: ");
            int ticks = sc.nextInt();
            sc.nextLine();

            totalDiscount = processToDiscount(customerAge, ticks);
            totalToPay = (ticks *TICKPRICE) - totalDiscount;

            IO.println("pagar: $" + totalToPay + "COP " + customerName);
            totalSales = totalSales + totalToPay;

        }

        IO.println("Se vendieron: $" + totalSales + "COP");

    }

    private static double processToDiscount (int customerAge, int ticks) {

        double tickPrice = 8000;

        if (customerAge < 12){
           return (ticks * tickPrice ) * 0.30;
        }
        else if (customerAge >= 18 && customerAge <= 25) {
            return (ticks * tickPrice) * 0.10;
        }
        else if (customerAge > 25){
            return (ticks * tickPrice ) * 0.05;
        }
        else {
            return 0;
        }

    }

}
