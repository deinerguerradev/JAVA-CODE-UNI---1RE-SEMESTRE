import primercorte.*;
import primercorte.project.Project;
import segundocorte.*;
import segundocorte.practicaVectores.Central;
import segundocorte.tallerSegundoCorte.PrincipalMenu;

import java.util.Scanner;

public class Program {

    private static String[] algoritmos1reCorte = {

        "1. Concordancia de mes y dìa de la semana",
        "2. Determinar si un número es par o impar",
        "3. Determinar si un número es positivo o negativo",
        "4. Aplicabilidad para descuento en la base de datos a la edad", 
        "5. Aplicaibilidad del descuento en base a diferentes parametros",
        "6. Becas para estudiantes de ingenieria de sistemas",
        "7. Cafeteria de la universidad de la guajira",
        "8. Cinema Uniguajira",
        "9. Proyectos propuestos",
        "10. Parcial primer Corte",
        "0. Salir"
    };

    private static String[] algoritmos2doCorte = {
        "1. cine uniguajira",
        "2. promedio de un vector con 5 calificaciones",
        "3. Buscar valor dentro de arrays",
        "4. arrays para estudiantes",
        "5. taller de segundo corte",
        "6. ejercicios del segundo corte",
        "0. salir"
    };


    public static Scanner sc = new Scanner(System.in);  

    public static void main(String[] args) {
        
        Inicio(); 

    }

    public static void Inicio () {
 
        boolean isActive = true; 

        while (isActive){

            IO.println("\n================================================================"); 
            IO.println("=================== EJERCICIOS DESARROLLADOS ==================="); 
            IO.println("================================================================"); 

            IO.println("1. Ejercicios del primer corte");
            IO.println("2. Ejercicios del segundo corte");
            IO.println("3. Ejercicios del tercer corte");

            IO.println("================================================================\n"); 

            IO.print("Ingrese el corte a ejecutar: ");
            int option = sc.nextInt(); 
            sc.nextLine(); 

            if (option == 0){

                IO.println("Saliendo del programa..."); 
                isActive = false; 

            }

            inputProcess(option);

        }

    }

    private static void inputProcess (int option){

        int algorithm;

        switch (option){
            case 1:
                algorithm = promtUser(algoritmos1reCorte);
                inputProcess1(algorithm);
                break;
            case 2:
                algorithm = promtUser(algoritmos2doCorte);
                inputProcess2(algorithm);
                break;
            case 3:
                IO.println("Todavìa no hay algoritmos disponibles");
                break;
            default:
                IO.println("ingres un valor dentro del rango!");
                break;
        }

    }

    private static int promtUser (String[] corte){

        int option = 0;

        for (int i = 0; i < corte.length; i++){
            IO.println(corte[i]);
        }

        IO.println("Ingresa uno de los anteriores algoritmos: ");
        return option = sc.nextInt();

    }

    private static void inputProcess1 (int option) {

        switch (option){
            case 1: 
                ActionToDayAndMoth();  
                break; 
            case 2: 
                DeterminateNumbers.OddOrEvenNumber();
                break;
            case 3: 
                DeterminateNumbers.NegativeAndPositiveNumber();  
                break;
            case 4: 
                DiscountAge.Calculation();
                break;
            case 5: 
                CustomerDiscount.Calculation();
                break;
            case 6: 
                StudentScholarishp.started();
                break;
            case 7: 
                UniguajiraCafe.started();
                break;
            case 8: 
                UniguajiraCinema.stared();
                break;
            case 9: 
                Project.started();
                break;
            case 10: 
                IO.println(); 
                break;
        }
        
    }

    private static void inputProcess2 (int option){

        switch(option){
            case 1:
                IO.println("en codificación");
                break;
                //david fernandes peres
            case 2:
                PromedioVectores.calculateAverage();
                break;
            case 3:
                BuscarValor.started();
                break;
            case 4:
                StudentField.started();
                break;
            case 5:
                PrincipalMenu.started();
                break;
            case 6:
                Central.started();
            default:
                IO.println("Algoritmo no disponible");
                break;
        }

    }


    private static void ActionToDayAndMoth () {

        IO.println("====================="); 
        IO.println("1. dìas de la semana"); 
        IO.println("2. meses de la semana"); 
        IO.println("=====================\n"); 

        IO.print("Ingrese una de las opciones anteriores: "); 
        int option = sc.nextInt(); 
        sc.nextLine(); 

        if (option == 1){
            DaysAndMoth.Day();
        }

        if (option == 2){
            DaysAndMoth.Moth();
        }

    }

}
