package segundocorte.tallerSegundoCorte.Advance;

import java.util.*;

public class Sales {

    private static Scanner sc = new Scanner(System.in);
    private static float[] saleas = new float[30];

    static void started (){

        String salir = "";

        while(!(salir.equals("s"))){

            IO.println("\n==========================");
            IO.println("= ESTADISTICAS DE VENTAS =");
            IO.println("==========================\n");

            getAllSales();

            IO.print("¿Quieres termianr la ejecución? (s/n): ");
            sc.nextLine();
            salir = sc.nextLine();

        }

    }

    private static void getAllSales() {

        int iteration = 0;

        while(iteration < 30){

            float sale;

            IO.print("Ingrese la cantidad de dinero generado en el día " + (iteration+1) + ": ");
            sale = sc.nextFloat();

            saleas[iteration] = sale;

            iteration++;

        }

        IO.println("se agregaron todas las ventas por día\n");

        showAverage();

    }

    private static void showAverage() {

        int iteration = 0;
        float accumulated = 0;

        while(iteration < 30){

            accumulated = accumulated + saleas[iteration];

            iteration++;

        }

        float average = accumulated/30;

        IO.println("ventas totales: " + accumulated);
        IO.println("el promedio de ventas realizadas por día es: " + average + "\n");

        //calculamos cuantos días superaron el promedio

        iteration = 0;
        int majorThanAverage = 0;

        while(iteration < 30){

            if(saleas[iteration] > average){
                majorThanAverage++;
            }

            iteration++;

        }

        IO.println(majorThanAverage + " días superaron el promedio.\n");

        showMaxAndMinSalesDay();
    }

    private static void showMaxAndMinSalesDay() {

        int iteration = 0;

        float maxSales = saleas[0];
        float minSales = saleas[0];

        int maxIndex = 0;
        int minIndex = 0;

        int salesInZero = 0;

        while(iteration < 30){

            if(saleas[iteration] > maxSales){
                maxSales = saleas[iteration];
                maxIndex = iteration;
            }
            if(saleas[iteration] < minSales){
                minSales = saleas[iteration];
                minIndex = iteration;
            }
            if(saleas[iteration] == 0){
                salesInZero++;
            }

            iteration++;

        }

        IO.println("El día con mayor ventas fue " + maxIndex + " con un total de $" + maxSales + "COP.");
        IO.println("El día con menor ventas fue " + minIndex + " con un total de $" + minSales + "COP.");
        IO.println(salesInZero + " días no tuvieron ventas.\n");

    }
}
