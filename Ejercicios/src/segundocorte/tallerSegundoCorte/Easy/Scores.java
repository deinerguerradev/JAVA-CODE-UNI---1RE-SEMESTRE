package segundocorte.tallerSegundoCorte.Easy;
import java.nio.channels.FileLock;
import java.util.*;

public class Scores {

    private static Scanner sc = new Scanner(System.in);
    private static float[] scores = new float[6];

    static void started() {

        IO.println("\n====================");
        IO.println("=  CALIFICACIONES  =");
        IO.println("====================\n");

        getScores();

    }

    private static void getScores(){

        int scoreCount = 0;

        while(scoreCount < 6){

            float score = 0;

            IO.print("Ingrese la nota del estudiante número " +  (scoreCount+1) + ": ");
            score = sc.nextFloat();

            scores[scoreCount] = score;

            scoreCount++;

        }

        displayScores(scores);

    }

    private static void displayScores (float[] scores) {

        int scoresPrinted = 0;

        IO.println("\n==================================");

        while(scoresPrinted < 6){

            IO.println("Nota de estudiante " + (scoresPrinted+1) + ": " + scores[scoresPrinted]);

            scoresPrinted++;

        }

        IO.println("==================================\n");

        groupAverage(scores);

    }

    private static void groupAverage(float[] scores){

        int scoresAccumulated = 0;
        float accumulatedScores = 0;

        while(scoresAccumulated < 6){

            accumulatedScores = accumulatedScores + scores[scoresAccumulated];
            scoresAccumulated++;

        }

        float totalAverage = accumulatedScores/6;

        IO.println("El promedio de este curso es: " + totalAverage + "\n");

        calculatePassedStudents(scores);

    }

    private static void calculatePassedStudents(float[] scores){

        int passStudents = 0;
        int failedStudents = 0;

        int processStudents = 0;

        IO.println("\n============================");

        while(processStudents < 6){

            if(scores[processStudents] >= 3.0f){
                IO.println("El estudiante " + (processStudents+1) + " aprobo el semestre.");
                passStudents++;
            }
            else {
                IO.println("El estudiante " + (processStudents+1) + " reprobo el semestre.");
                failedStudents++;
            }

            processStudents++;
        }

        IO.println(passStudents + " estudiantes pasaron el semestre.");
        IO.println(failedStudents + " estudiantes perdieron el semestre.");

        IO.println("============================\n");

    }
}
