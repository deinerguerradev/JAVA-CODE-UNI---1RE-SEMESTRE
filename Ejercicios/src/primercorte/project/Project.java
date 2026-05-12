package primercorte.project;

import java.util.Scanner;

public class Project {

    public static Scanner sc = new Scanner(System.in);

    public static void started (){

        IO.println("\n========================");
        IO.println("  PROYCETOS REALIZADOS  ");
        IO.println("========================\n");

        IO.println("1. Proceso de Ingreso a Uniguajira");
        IO.println("2. Promedio de Curso de Ingenieria de sistemas");
        IO.println("3. Calculadora para el Promedio de un estudiante");

        IO.print("\nIngrese una de las opciones anteriores: ");
        int option = sc.nextInt();

        redirectionFlow(option);

    }

    private static void redirectionFlow(int option){

        switch(option){
            case 1:
                IO.println("Acción 1");
                break;
            case 2:
                IO.println("Acción 2");
                break;
            case 3:
                IO.println("Acción 3");
                break;
            default:
                IO.println("Debe de ingresar un valor valido!");
                break;
        }
    }

}
