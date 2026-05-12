package segundocorte;
import java.util.*;

public class PromedioVectores {

    public static Scanner sc = new Scanner(System.in);
    private static float[] score = {4.0f, 4.0f, 4.0f, 4.0f, 4.0f};

    public static void calculateAverage(){

        String salir = "";

        while(!(salir.equals("s"))){

            float totalScores = 0;

            for (int i = 0; i <score.length; i++){
                totalScores = totalScores + score[i];
            }

            float average = totalScores / score.length;

            IO.println("El promedio es: " + average);

            IO.print("Quiere salir de la aplicación (s/n)?: ");
            salir = sc.nextLine();

        }

    }

}
