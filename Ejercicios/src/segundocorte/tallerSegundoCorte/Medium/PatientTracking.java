package segundocorte.tallerSegundoCorte.Medium;

public class PatientTracking {

    private static String[] patientName = {"ana", "luisa", "cristobal", "andres", "adriana", "geordanovic"};
    private static int[] patientAge = {23, 43, 56, 24, 19, 20};
    private static float[] patientweight ={62.4f, 59.0f, 96.0f, 49.5f, 46.4f, 74.23f};

    static void started (){

        IO.println("\n==========================");
        IO.println("== CONTROL DE PACIENTES ==");
        IO.println("==========================\n");

        showAllPatient();

    }

    private static void showAllPatient() {

        int iteration = 0;

        while(iteration < 6){

            IO.println("Nombre del paciente: " + patientName[iteration]);
            IO.println("\tEdad del paciente: " + patientAge[iteration]);
            IO.println("\tPeso del paciente: " + patientweight[iteration] + "KG.");

            iteration++;

        }

        IO.println();

        showMaxAndMinWeight();

    }

    private static void showMaxAndMinWeight() {

        int iteration = 0;

        float maxWeight = patientweight[0];
        float minWeight = patientweight[0];

        int maxIndex = 0;
        int minIndex = 0;

        while(iteration < 6){

            if(patientweight[iteration] > maxWeight){
                maxWeight = patientweight[iteration];
                maxIndex = iteration;
            }
            if(patientweight[iteration] < minWeight){
                minWeight = patientweight[iteration];
                minIndex = iteration;
            }

            iteration++;

        }

        IO.println(patientName[maxIndex] + " tiene el mayor peso de la lista de pacientes con " + patientweight[maxIndex]);
        IO.println(patientName[minIndex] + " tiene el menor peso de la lista de pacientes con " + patientweight[minIndex]);
        IO.println();

        calculateAverageWeight();

    }

    private static void calculateAverageWeight(){

        int iteration = 0;
        float accumulateWeight = 0;

        while(iteration < 6){

            accumulateWeight = accumulateWeight + patientweight[iteration];

            iteration++;

        }

        float average = accumulateWeight/6;

        IO.println("El promedio entre todos los pesos de los pacientes es de: " + average + "KG.\n");

        categoryWeight();

    }

    private static void categoryWeight() {

        int iteration = 0;

        while(iteration < 6){

            if(patientweight[iteration] < 50.0f){
                IO.println("El paciente " + patientName[iteration] + " tiene un peso bajo, con " + patientweight[iteration] + "KG.");
            }
            else if(patientweight[iteration] >= 50.f && patientweight[iteration] <= 90.0f){
                IO.println("El paciente " + patientName[iteration] + " tiene un peso normal, con " + patientweight[iteration] + "KG.");
            }
            else if(patientweight[iteration] > 90.0f){
                IO.println("El paciente " + patientName[iteration] + " tiene un peso Alto, con " + patientweight[iteration] + "KG.");
            }

            iteration++;

        }

        IO.println();

    }
}
