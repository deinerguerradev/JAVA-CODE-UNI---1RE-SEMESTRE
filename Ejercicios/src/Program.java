import java.util.Scanner;

public class Program {

    public static String[] algoritmos1reCorte = {

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

            for (int i = 0; i < algoritmos1reCorte.length; i++){

                IO.println(algoritmos1reCorte[i]); 

            }

            IO.println("================================================================\n"); 

            IO.print("Ingrese el algoritmo a ejecutar: "); 
            int option = sc.nextInt(); 
            sc.nextLine(); 

            if (option == 0){

                IO.println("Saliendo del programa..."); 
                isActive = false; 

            }

            InputProcess(option);

        }

    }

    public static void InputProcess (int option) {

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
                StudentScholarishp.overview(); 
                break;
            case 7: 
                UniguajiraCafe.overview(); 
                break;
            case 8: 
                IO.println(); 
                break;
            case 9: 
                IO.println(); 
                break;
            case 10: 
                IO.println(); 
                break;
        }
        
    }

    public static void ActionToDayAndMoth () {

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
