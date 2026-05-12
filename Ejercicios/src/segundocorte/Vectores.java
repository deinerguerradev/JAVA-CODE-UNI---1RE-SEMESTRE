package segundocorte;
import java.util.*;

public class Vectores {
    // los vectores trabajan varios espacios de memoria

    public static void started(){

        // declarar un vector con tamaño y vacios:
        int[] notas = new int[5];

        //declarar un vector con valores:
        notas[0] = 1;
        notas[1] = 2;
        notas[2] = 3;
        notas[3] = 4;
        notas[4] = 5;

        //definir e inicializar un vector con valores:
        double[] precios = {123.34, 123.45, 1234.78};

        // crear un vector con valores y sumar todos estos valores:
        int[] edades = {12, 24, 23, 45, 70};

        int edadesAcumuladas = 0;

        for(int i = 0; i < edades.length; i++){
            edadesAcumuladas = edadesAcumuladas + edades[i];
        }

        IO.println(edadesAcumuladas);

    }


}
