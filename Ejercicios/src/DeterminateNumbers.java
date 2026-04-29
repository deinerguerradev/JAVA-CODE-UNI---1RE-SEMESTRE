import java.util.Scanner; 

public class DeterminateNumbers {

    public static Scanner sc = new Scanner(System.in); 
    
    static void OddOrEvenNumber (){

        IO.print("¿Cuantos numeros vas a evaluar?: ");
        int numberQuanity = sc.nextInt(); 
        
        for (int i = 0; i < numberQuanity; i++){

            if (numberQuanity > 0){

            IO.print("Ingresa un número: ");
            int number = sc.nextInt(); 

            if(number % 2 == 0){
                IO.println("El número ingresado es Par\n"); 
            }
            else{
                IO.println("El número ingresado es Impar\n"); 
            }
            }
            else {
                IO.println("Debe de ingresar números validos"); 
            }

        }
        
    }

    static void NegativeAndPositiveNumber () {

        IO.print("Cuantos numeros vas a evaluar: ");
        int numberQuanity = sc.nextInt();  
        
        for (int i = 0; i < numberQuanity; i++) {

            IO.print("Ingresa un número: "); 
            int number = sc.nextInt(); 

            if (number < 0){
                IO.println("El número es Negativo\n"); 
            }
            else if (number == 0){
                IO.println("El número es 0"); 
            }
            else {
                IO.println("El Número es Positivo\n"); 
            }

        }

    }

}
