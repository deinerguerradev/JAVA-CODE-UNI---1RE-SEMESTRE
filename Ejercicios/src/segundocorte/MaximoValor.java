package segundocorte;
import java.util.*;

public class MaximoValor {

    private static Scanner sc = new Scanner(System.in);

    public static void started() {

        IO.print("¿Cuantos números vas a ingresar?: ");
        int numbers = sc.nextInt();

        int[] values = new int[numbers];

        for (int i = 0; i < numbers; i++){

            IO.print("\nIngrese un número: ");
            int number = sc.nextInt();

            values[i] = number;
        }

        processArray(values);

    }

    private static void processArray(int[] values) {

        int maxValue = values[0];

        for(int i = 1; i <values.length; i++){

            if(maxValue < values[i]){
                maxValue = values[i];
            };

        }

        IO.println("El mayora valor de tu lista es: " + maxValue);
        IO.println("el numero mayor de tu lista es (por funcion de java): " + Arrays.stream(values).max());

    }



}
