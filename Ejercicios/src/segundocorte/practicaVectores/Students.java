package segundocorte.practicaVectores;

import java.util.Scanner;

public class Students {

    private static String[] nombre = new String[5];
    private static String[] codigo = new String[5];
    private static double[] notas = new double[5];
    private static String[] estado = new String[5];

    private static String[] opciones = {"1. mostrar estudiante", "2. Agregar estudiante", "3. Buscar estudiante", "4. Eliminar estudiante", "0. salir"};

    private static Scanner sc = new Scanner(System.in);

    public static void started(){

        int opcion = 1;

        while(opcion != 0) {

            desplegarOpciones();

            IO.println("Ingrese una de las opciones antoriores");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion != 0)
                procesarAccion(opcion);

        }
    }

    private static void desplegarOpciones() {

        IO.println("=============================");
        for(String opcion: opciones){
            IO.println(opcion);
        }
        IO.println("=============================\n");

    }

    private static void procesarAccion(int opcion){

        switch(opcion){
            case 1:
                desplegarEstudiantes();
                break;
            case 2:
                verificarSiHayEspaciosDisponibles();
                break;
            case 3:
                buscarEstudiante();
                break;
            case 4:
                eliminarEstudiante();
                break;
            default:
                IO.println("Ingrese un valor dentro del rango (1-3)");
                break;
        }

    }

    private static boolean verificarSiHayEstuiantesActivos(){

        int i = 0;

        while(i<estado.length){

            if("activo".equalsIgnoreCase(estado[i])){
                return true;
            }

            i++;

        }

        return false;

    }

    private static void desplegarEstudiantes(){

        if(verificarSiHayEstuiantesActivos()){

            for(int i = 0; i<estado.length; i++){

                if("activo".equalsIgnoreCase(estado[i])){
                    IO.println("[" + i + "] " + " | código: " + codigo[i] + " |nombre: " + nombre[i] + " | promedio: "
                    + notas[i] + " | Estado: " + estado[i]);
                }

            }

        }
        else {
            IO.println("No hay esudiantes activos!");
        }

    }

    private static void verificarSiHayEspaciosDisponibles(){

        int i = 0;
        int cantidadActivos = 0;

        while(i<estado.length){

            if("activo".equalsIgnoreCase(estado[i])){
                cantidadActivos++;
            }

            i++;

        }

        int estudiantesParaAgregar = estado.length - cantidadActivos;

        if(estudiantesParaAgregar != 0){
            IO.println("puedes agregar: " + estudiantesParaAgregar + " estudiantes");
            agregarEstudiante(estudiantesParaAgregar);
        }
        else{
            IO.println("No puedes agregar más estudiantes");
        }


    }

    private static void agregarEstudiante(int estudianesPosibles){

        int i = 0;

        while (i < estudianesPosibles){

            if("inactivo".equalsIgnoreCase(estado[i]) || estado[i] == null){

                IO.print("Agrege el coódigo del estudiante: ");
                sc.nextLine();
                String codigoEstudiante = sc.nextLine();
                codigo[i] = codigoEstudiante;

                IO.print("Agrege el nombre del estudiante: ");
                String nombreEstudiante = sc.nextLine();
                nombre[i] = nombreEstudiante;

                IO.print("Agrege el promedio del estudiante: ");
                double promedioEstudiante = sc.nextDouble();
                notas[i] = promedioEstudiante;

                estado[i] = "activo";

                IO.print("Agregaras a otro estudiante(s/n): ");
                sc.nextLine();
                String opcion = sc.nextLine().toLowerCase();
                IO.println();

                if(opcion.equals("n")){
                    break;
                }

            }


            i++;

        }



    }

    private static void buscarEstudiante() {

        if(verificarSiHayEstuiantesActivos()){

            int index = buscarIndex();

            if(index != 0){
                imprimirDatosEstudiante(index);
            }
            else{
                IO.println("No se encontro al estudiante, por favor digite otra vez el codigo");
            }

        }
        else{
            IO.println("no hay estudiantews activos");
        }

    }

    private static void imprimirDatosEstudiante(int index){

        IO.println("\n============================================");
        IO.println("Nombre del estudiante: " + nombre[index]);
        IO.println("Promedio del destudiante: " + notas[index]);
        IO.println("Estado: " + estado[index]);
        IO.println("============================================\n");

    }

    private static void eliminarEstudiante(){

        if(verificarSiHayEstuiantesActivos()){

            int index = buscarIndex();

            estado[index] = "inactivo";

            IO.println("se borro estudiante");

        }
        else{
            IO.println("No hay estudiantes activos");
        }

    }

    private static int buscarIndex(){

        IO.print("Ingrese el codigo del estudiante: ");
        sc.nextLine();
        String codigoEstudiante = sc.nextLine();

        for(int i = 0; i<codigo.length; i++){

            if(codigo[i] != null && codigo[i].equals(codigoEstudiante) && "activo".equalsIgnoreCase(estado[i])){
                return i;
            }

        }

        return -1;
    }

}