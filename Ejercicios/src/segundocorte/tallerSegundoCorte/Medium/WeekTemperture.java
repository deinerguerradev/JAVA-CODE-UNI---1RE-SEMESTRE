package segundocorte.tallerSegundoCorte.Medium;

import java.util.*;

public class WeekTemperture {

    private static Scanner sc = new Scanner(System.in);

    private static String[] days = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
    private static float[] temperatureDays = new float[7];

    static void started (){

        IO.println("==========================");
        IO.println(" TEMPERATURA DE LA SEMANA ");
        IO.println("==========================");

        getAngSaveTemperature();

    }

    private static void getAngSaveTemperature(){

        int iteration = 0;

        while (iteration < 7){

            IO.print("Ingrese la temperatura del día correspondiente a " + (iteration+1) + ": ");
            float temperature = sc.nextFloat();
            temperatureDays[iteration] = temperature;

            iteration++;

        }

        getMaxAndMinTemperature();

    }

    private static void getMaxAndMinTemperature() {

        int iteration = 0;

        float maxTemperature = temperatureDays[0];
        float minTemperature = temperatureDays[0];

        int maxIndex = 0;
        int minIndex = 0;

        while (iteration < 7){

            if(temperatureDays[iteration] > maxTemperature){
                maxTemperature = temperatureDays[iteration];
                maxIndex = iteration;
            }

            if(temperatureDays[iteration] < minTemperature){
                minTemperature = temperatureDays[iteration];
                minIndex = iteration;
            }

            iteration++;

        }

        IO.println("El día de mayor temperatura es el " + days[maxIndex] + " con una temperatura de " + temperatureDays[maxIndex] + "Cº.");
        IO.println("El día de mayor temperatura es el " + days[minIndex] + " con una temperatura de " + temperatureDays[minIndex] + "Cº.\n");

        getTemperatureAverage();

    }

    private static void getTemperatureAverage() {

        int iteration = 0;
        float accumulateTemperature = 0;
        int majorThanAverage = 0;

        while(iteration < 7){

            accumulateTemperature = accumulateTemperature + temperatureDays[iteration];

            iteration++;

        }

        float average = accumulateTemperature/7;

        iteration = 0;

        while (iteration < 7){

            if(temperatureDays[iteration] > average){
                majorThanAverage++;
            }

            iteration++;

        }

        IO.println("El promedio de temperatura para esta semana fue de: " + average + "Cº.");
        IO.println("Hubo " + majorThanAverage + " días por encima del promedio\n");
    }

}
