package segundocorte.practicaVectores;

import java.util.*;

public class Vehicle {

    private static String[] placas = {"ABC123", "XYZ870", "DEF459", "GHI439", "JKL345"};
    private static String[] propietario = {"Laura", "Camilo", "Sandra", "Ricardo", "Patricia"};
    private static int[] fabricacion = {2018, 2010, 2022, 2015, 2008};

    private static Scanner sc = new Scanner(System.in);

    static void started(){

       String salir = "";

       while(!(salir.equals("s"))){

           IO.print("Ingrese la placa a buscar: ");
           String placa = sc.nextLine().toUpperCase();

           int auto = searchEmployee(placa);

           boolean elAutoEstaEnSistema = estaRegistrado(auto);

           if(elAutoEstaEnSistema){
               printEmployeeInfo(auto);
           }
           else{
               IO.println("la placa " + placa + " no se encuntra en el sistema!");
           }

           IO.print("Quieres seguir buscando un auto? (S/N): ");
           sc.nextLine();
           salir = sc.nextLine();

       }

    }

    private static boolean estaRegistrado(int id){

        if(id == -1){
            return false;
        }
        else{
            return true;
        }

    }

    private static int searchEmployee(String id){

        int i = -1;
        int placa = 0;

        while(i < (placas.length-1)){

            i++;

            if(id.equalsIgnoreCase(placas[i])){
                placa = i;
                break;
            }
            else{
                placa = -1;
            }

        }

        return placa;

    }

    static void printEmployeeInfo(int index){

        String necesitaTecnoMecanica = tecnoMecanica(index);

        IO.println("Auto Encontrado: ");
        IO.println("\taño: " + fabricacion[index]);
        IO.println("\tpropietario: " + propietario[index]);
        IO.println("\tTecnomecanica: " + necesitaTecnoMecanica);
    }

    private static String tecnoMecanica(int index){

        if(fabricacion[index] < 2019){
            return "Necesita tecnomecanica";
        }
        else{
            return "No necesita tecnomecanica";
        }

    }

}
