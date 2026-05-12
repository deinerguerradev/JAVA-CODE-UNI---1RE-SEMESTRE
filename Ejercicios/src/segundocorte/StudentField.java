package segundocorte;
import java.util.*;
public class StudentField {

    private static Integer[] professorId = {1234424, 1238431, 123124};
    private static String[] professorName = {"ADANUD MEZA", "PABLO ELIAS", "HILDA SMITH"};
    private static Integer[] studentCode = {182610032, 182610033, 182610034};
    private static String[] studentNames = {"DEINER GUERRA", "JORGE ORTIZ", "SAMUEL GOMEZ"};
    private static float[] studentScore = {4.5f, 4.5f, 4.5f};

    private static Scanner sc = new Scanner(System.in);

    public static void started() {

        String salir = "";

        while(!(salir.equals("s"))){



            IO.print("Quiere salir de la aplicación (s/n)?: ");
            sc.nextLine();
            salir = sc.nextLine();

        }

        IO.println("Ingrese su codigo: ");
        int code = sc.nextInt();

        int index = 0;

        if(Arrays.asList(professorId).contains(code)){
            index = processListOfCode(code, professorId);
            professorActions(index);
        }
        if(Arrays.asList(studentCode).contains(code)){
           index = processListOfCode(code, studentCode);
           professorActions(index);
        }


    }

    private static void printInfo(int index){
        IO.println("codigo del estudiante: " + studentCode[index]);
        IO.println("Nombre del estudiante: " + studentNames[index]);
        IO.println("nota del estudiante: " + studentScore[index]);

    }

    private static void professorActions(int index) {

        IO.println("Profesor puede realizar las siguientes opciones: \n");

        IO.println("1. revisar los datos de un estudiante");
        IO.println("2. revisar los datos de todos los estudiantes");
        IO.println("3. revisar el promedio de todos los estudiantes");
        IO.println("0. salir");

        IO.println("\nIngrese una de las opciones anteriores: ");
        int option = sc.nextInt();

        switch(option){
            case 1:
                getStudentInfo();
                break;
            case 2:
                displayAllStudents();
                break;
            case 3:
                calculateAverage();
                break;
            default:
                IO.println("ingrese una opcion valida (1-3)");
                break;
        }


    }

    private static void getStudentInfo(){

        IO.print("Ingrese el codigo del estudiante: ");
        int code = sc.nextInt();

        int index = processListOfCode(code, studentCode);

        printInfo(index);

    }

    private static int processListOfCode (int code, Integer[] lisOfCode) {
        int index = 0;

        for (int i = 0; i < lisOfCode.length; i++){
            if(code == lisOfCode[i]){
                index = lisOfCode[i];
                IO.println("inicio de sesion exitoso");
                break;
            }
        }

        return index;

    }

    private static void displayAllStudents(){
        for(int i = 0; i <studentNames.length; i++){
            printInfo(i);
        }
    }

    private static void calculateAverage() {

        float suma = 0;

        for (float n: studentScore){
            suma += n;
        }

        float average = suma / studentScore.length;

        IO.println("El promedio de sus estudiantes es: " + average);
    }



}
