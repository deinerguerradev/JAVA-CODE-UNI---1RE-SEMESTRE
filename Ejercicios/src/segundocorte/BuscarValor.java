package segundocorte;

import java.util.*;

public class BuscarValor {

    private static int[] numero = {12, 34, 45, 21, 11, 34};
    private static String[] nombres = {"DEINER GUERRA", "SAMUEL GOMEZ"};
    public static Scanner sc = new Scanner(System.in);

    public static void started () {

        IO.println("=========================");
        IO.println("= BUSCAR VALOR EN ARRAY =");
        IO.println("=========================\n");

        IO.println("1. array para buscar un número.");
        IO.println("2. array para buscar un nombre");
        IO.println("0. salir\n");

        IO.println("ingrese una de las opciones anteriores: ");
        int option = sc.nextInt();

        switch(option){
            case 0:
                return;
            case 1:
                searchInt();
                break;
            case 2:
                searchString();
                break;
        }

    }

    private static void searchString() {

        IO.print("Ingrese un nombre: ");
        String name = sc.nextLine().toLowerCase();

        for(String names: nombres){
            if (names.equals(name)){
                IO.println("Esta en al lista");
                break;
            }
            else {
                name = null;
            }
        }

        if(name == null){
            IO.println("No te encunetras en la lista");
        }

    }

    private static void searchInt() {

        IO.println("=========================");
        IO.println("== busca un número ==");
        IO.println("=========================\n");

        IO.println("Tienes " + numero.length + " oportunidades");
        IO.println();

        for (int i = numero.length; i >= 0; i--){

            IO.print("Ingrese un número: ");
            int number = sc.nextInt();

            if (Arrays.asList(numero).contains(number)){
                IO.println("El numero esta en el arreglo");
                break;
            }
            else {
                IO.println("El número no se encunetra en el vector intentalo de nuevo, tienes " + i + " intentos");
                if (i == 0){
                    IO.println("se te acabaron los intentos");
                    break;
                }
            }

        }

    }


}
