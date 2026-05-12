package segundocorte.tallerSegundoCorte.Easy;

import java.util.*;

public class GroupAge {

    private static Scanner sc = new Scanner(System.in);

    private static int[] peopleAges = new int[9];
    static void started (){

        String salir = "";

        while(!(salir.equals("s"))){

            IO.println("\n======================");
            IO.println("  EDADES DE UN GRUPO  ");
            IO.println("======================\n");

            getAges();

            IO.print("¿Quieres termianr la ejecución? (s/n): ");
            sc.nextLine();
            salir = sc.nextLine();

        }

    }

    private static void getAges() {

        int ages = 0;
        while(ages < 9){

            int age = 0;

            IO.print("ingrese una edad: ");
            age = sc.nextInt();

            peopleAges[ages] = age;

            ages++;
        }

        processArray();
    }

    private static void processArray() {

        //dividr los procesos

        int ages = 0;

        int maxAge = peopleAges[0];
        int minAges = peopleAges[0];

        int minors = 0;
        int adults = 0;

        int accumulatedAges = 0;

        while (ages < 8){

            if(peopleAges[ages] > maxAge){
                maxAge = peopleAges[ages];
            }
            if(peopleAges[ages] < minAges){
                minAges = peopleAges[ages];
            }

            if(peopleAges[ages] >= 18){
                adults++;
            }
            else{
                minors++;
            }

            accumulatedAges = accumulatedAges + peopleAges[ages];

            ages++;
        }

        float averageAge = (float)accumulatedAges/9;

        IO.println("La mayor edad es: " + maxAge);
        IO.println("La menor edad es: " + minAges);

        IO.println("hay " + adults + " mayores de edad.");
        IO.println("hay " + minors + " menores de edad.");

        IO.println("el promedio de edades de este grupo es: " + averageAge);

    }
}
