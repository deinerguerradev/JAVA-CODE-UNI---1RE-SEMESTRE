package segundocorte.practicaVectores;

import java.util.*;

public class Central {

    private static String[] algorithms = {"1. Registro de Empleados", "2. Registro de Vehiculos",
            "3. Sistema de Gestión de estudiantes"};

    private static Scanner sc = new Scanner(System.in);

    public static void started() {

        IO.println("\n==========================");
        IO.println("  TALLER DE VECTORE -  2  ");
        IO.println("==========================\n");

        displayAlgorithms();

        IO.print("Ingrese una de las opciones anteriores: ");
        int option = sc.nextInt();

        processOption(option);

    }

    private static void displayAlgorithms() {

        for(int i = 0; i < algorithms.length; i++){
            IO.println(algorithms[i]);
        }

        IO.println();

    }

    private static void processOption(int option) {

        switch(option){
            case 1:
                Employees.started();
                break;
            case 2:
                Vehicle.started();
                break;
            case 3:
                Students.started();
                break;
            default:
                IO.println("Ingrese un valor valido dentro del rango (1-3)");
                break;
        }

    }

}
