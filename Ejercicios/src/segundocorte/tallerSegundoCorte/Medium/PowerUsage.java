package segundocorte.tallerSegundoCorte.Medium;

public class PowerUsage {

    private static String[] headquarters =  {"sede norte", "sede sur", "sede centro", "sede oriente", "sede occidente"};
    private static double[] headquartersConsumptions = {1850.5, 3200.8, 2750.0, 980.3, 4100.6};

    static void started (){

        IO.println("\n==========================");
        IO.println("=== CONTROL DE ENERGIA ===");
        IO.println("==========================\n");

        showAllHeadquarters();

    }

    private static void showAllHeadquarters() {

        int iteration = 0;

        while(iteration < 5){

            IO.println("Nombre de la sede: " + headquarters[iteration]);
            IO.println("\tConsumo Anual de la sede: " + headquartersConsumptions[iteration] + "kWh.");

            iteration++;

        }

        IO.println();

        showMaxAndMinConsumation();

    }

    private static void showMaxAndMinConsumation() {

        int iteration = 0;

        double maxConsumation = headquartersConsumptions[0];
        double minConsumation = headquartersConsumptions[0];

        int maxIndex = 0;
        int minIndex = 0;

        while(iteration < 5){

            if(headquartersConsumptions[iteration] > maxConsumation){
                maxConsumation = headquartersConsumptions[iteration];
                maxIndex = iteration;
            }
            if(headquartersConsumptions[iteration] < minConsumation){
                minConsumation = headquartersConsumptions[iteration];
                minIndex = iteration;
            }

            iteration++;

        }

        IO.println("la sede de mayor consumo fue " + headquarters[maxIndex] + " con un consumo en pesos de $" + (headquartersConsumptions[maxIndex] * 650) + "COP.");
        IO.println("la sede de menor consumo fue " + headquarters[minIndex] + " con un consumo en pesos de $" + (headquartersConsumptions[minIndex] * 650) + "COP.");

        getAverageConsumationAndMaxThanAverage();

    }

    private static void getAverageConsumationAndMaxThanAverage() {

        int iteration = 0;
        double accumulatedConsumation = 0;

        while(iteration < 5){

            accumulatedConsumation = accumulatedConsumation + headquartersConsumptions[iteration];

            iteration++;

        }

        double average = accumulatedConsumation/5;

        IO.println("La empresa debe de pagar en total $" + (accumulatedConsumation * 650) + "COP.");
        IO.println("El promedio de consumo entre todas las sede es de: " + accumulatedConsumation);

        int maxThanAverageIndex = 0;
        double maxThanAverage = 0;
        int superateAverage= 0;

        iteration = 0;

        while(iteration < 5){


            if(headquartersConsumptions[iteration] > average){

                superateAverage++;

                if(headquartersConsumptions[iteration] > maxThanAverage){
                    maxThanAverage = headquartersConsumptions[iteration];
                    maxThanAverageIndex = iteration;
                }

            }

            iteration++;

        }

        IO.println("la sede con mayor gasto con respecto al promedio es " + headquarters[maxThanAverageIndex]  + " con un consumo total de " + maxThanAverage + "kWh.");
        IO.println(superateAverage + " superaron el promedio en consumo");


    }

}
