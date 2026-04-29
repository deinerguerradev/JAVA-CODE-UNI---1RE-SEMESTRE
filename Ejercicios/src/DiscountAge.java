import java.util.Scanner; 

public class DiscountAge {

    public static Scanner sc = new Scanner(System.in); 

    static void Calculation(){

        IO.println("========================"); 
        IO.println("== Calcular Descuento =="); 
        IO.println("========================\n"); 

        IO.print("El cliente tiene suscripción? (s/n): ");
        String option = sc.next().toLowerCase(); 

        IO.print("Ingrese la edad del cliente: ");
        int custumerAge = sc.nextInt(); 
        
        if (option.equals("s")){
            if (custumerAge > 60){
                IO.println("El cliente tiene descuento\n"); 
            }
            else {
                IO.println("El cliente no es seleccionable para el descuento especial!\n"); 
            }
        }
        else {
            IO.println("El cliente no tiene una suscripción, no es seleccionable para el descuento\n"); 
        }

    }

    
}
