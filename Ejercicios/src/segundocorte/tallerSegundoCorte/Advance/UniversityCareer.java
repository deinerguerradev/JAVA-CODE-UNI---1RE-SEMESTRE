package segundocorte.tallerSegundoCorte.Advance;

import java.util.*;

public class UniversityCareer {

    private static Scanner sc = new Scanner(System.in);

    private static String[] subjectName = {"matematicas", "fisica mecanica", "humanidadeas", "estadistica",
    "competenicas comunicativas", "Derpotes", "progamación II", "estructuras de datos I"};
    private static String[] subjetState = new String[8];
    private static int[] subjectCreditis = {3, 4, 2, 3, 3, 0, 5, 5};
    private static double[] subjectScores = {3.5, 4.5, 2.5, 1.3, 4.0, 5.0, 0, 5.0, 5.0};

    static void started (){

        String salir = "";

        while(!(salir.equals("s"))){

            IO.println("\n=======================");
            IO.println(" CARRERA UNIVERSITARIA ");
            IO.println("=======================\n");

            Allsubject();

            IO.print("¿Quieres termianr la ejecución? (s/n): ");
            sc.nextLine();
            salir = sc.nextLine();

        }

    }

    private static void Allsubject() {

        int iteration = 0;

        while(iteration < 8){

            if(subjectScores[iteration] > 3.0){
                subjetState[iteration] = "Ganada";
            }
            else {
                subjetState[iteration] = "Perdida";
            }

            IO.println("Asignatura: " + subjectName[iteration]);
            IO.println("\tCreditos: " + subjectCreditis[iteration]);
            IO.println("\tCalificación: " + subjectScores[iteration]);
            IO.println("\tEstado: " + subjetState[iteration]);
            IO.println();

            iteration++;

        }

        IO.println();

        calculateAverage();

    }

    private static void calculateAverage() {

        int iteration = 0;
        double accumulate = 0;

        while(iteration < 8){

            accumulate = accumulate + (subjectScores[iteration] * subjectCreditis[iteration]);

            iteration++;

        }

        double average = accumulate/ Arrays.stream(subjectCreditis).sum();

        IO.println("tu promedio es de :" + average + "\n");

        subjectFaliedAndWin(average);

    }

    private static void subjectFaliedAndWin(double average){

        int iteration = 0;

        int faliedSubjects = 0;
        int winSubject = 0;

        int creditsWin = 0;
        int creditsFailed = 0;

        while(iteration < 8){

            if(subjetState[iteration].equals("Ganada")){
                creditsWin = creditsWin + subjectCreditis[iteration];
                winSubject++;
            }
            if(subjetState[iteration].equals("Perdida")){
                creditsFailed = creditsFailed + subjectCreditis[iteration];
                faliedSubjects++;
            }
            iteration++;

        }

        IO.println("Perdiste " + faliedSubjects + " asignaturas y ganaste: " + winSubject + " asignaturas.");
        IO.println("peridiste " + creditsFailed + " credutos y ganaste: " + creditsWin + " creditos.\n");

        hasScholarishp(average, faliedSubjects);
        showMaxAndMinScore();

    }

    private static void showMaxAndMinScore() {

        int iteration = 0;

        double maxScore = subjectScores[0];
        double minScore = subjectScores[0];

        int maxIndex = 0;
        int minIndex = 0;

        while(iteration < 8){

            if(subjectScores[iteration] > maxScore){
                maxScore = subjectScores[iteration];
                maxIndex = iteration;
            }
            if(subjectScores[iteration] < minScore){
                minScore = subjectScores[iteration];
                minIndex = iteration;
            }

            iteration++;

        }

        IO.println("Tu mayor nota fue: " + subjectName[maxIndex] + " con una califcacion de: " + maxScore);
        IO.println("Tu menor nota fue: " + subjectName[minIndex] + " con una calficación de: " + minScore + "\n");

    }

    private static void hasScholarishp(double average, int failScores){

        if(average >= 4.0 && failScores == 0){
            IO.println("Te ganaste una beca!");
        }
        else{
            IO.println("No tienes acceso a la beca estudiantil");
        }

    }

}
