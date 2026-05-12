package segundocorte.tallerSegundoCorte;
import segundocorte.tallerSegundoCorte.Advance.Advance;
import segundocorte.tallerSegundoCorte.Easy.Easy;
import segundocorte.tallerSegundoCorte.Medium.Medium;

import java.util.*;

public class PrincipalMenu {

    private static Scanner sc = new Scanner(System.in);

    private static String[] options = {"1. Nivel facil", "2. Nivel Intermedio", "3. Nivel Avanzado"};
    private static String[] easyLevel = {"1. calificaciones", "2. precio de productos", "3. edades del grupo", "4. registro de goles"};
    private static String[] mediumLevel = {"1. temperatura semanal", "2. inventario de tienda", "3. control de pacientes", "4. Consumo electrico"};
    private static String[] advanceLevel = {"1. Estadisticas de ventas", "2. Analisis de carrera universitaria"};

    public static void started(){

        boolean continueExecution = false;

        while(!(continueExecution)){

            IO.println("\n============================");
            IO.println("==== TALLER DE VECTORES ====");
            IO.println("============================\n");

            printOptions();

            IO.print("\nIngrese el nivel deseado: ");
            int level = sc.nextInt();

            boolean hasOptionToDisplay = printOptions(level);

            if(hasOptionToDisplay){

                IO.print("ingrese un algoritmo a ejecutar: ");
                int algorithm = sc.nextInt();

                processLevel(level, algorithm);
                continueExecution = true;
            }

        }

    }
    private static void printOptions() {

       for(int i = 0; i < options.length; i++){
           IO.println(options[i]);
       }

    }

    private static boolean printOptions(int level){

        if (level == 1){
            printLevelOption(easyLevel);
            return true;
        }
        else if (level == 2){
            printLevelOption(mediumLevel);
            return true;
        }
        else if (level == 3) {
            printLevelOption(advanceLevel);
            return true;
        }
        else{
            IO.println("Ingrese un número adecuado");
            return false;
        }

    }
    private static void printLevelOption(String[] levelOption){

        for(int i = 0; i < levelOption.length; i++){
            IO.println( "\t" + levelOption[i]);
        }

    }

    private static void processLevel(int level, int algorithm){

        switch(level){
            case 1:
                Easy.identifyAlgorithm(algorithm);
                break;
            case 2:
                Medium.identifyAlgorithm(algorithm);
                break;
            case 3:
                Advance.identifyAlgorithm(algorithm);
                break;
        }

    }


}
