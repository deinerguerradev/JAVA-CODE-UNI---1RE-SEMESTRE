import java.util.Scanner; 

public class DaysAndMoth {

    public static Scanner  sc = new Scanner (System.in); 

    static void Day() {

        IO.println("=============="); 
        IO.println("==== DÌAS ====");
        IO.println("==============");  

        IO.print("Ingrese un número: "); 
        int day = sc.nextInt(); 

        switch (day){

            case 1: 
                IO.println("Lunes");
                break; 
            case 2: 
                IO.println("Martes");
                break; 
            case 3: 
                IO.println("Miercoles");
                break; 
            case 4:  
                IO.println("Jueves");
                break; 
            case 5: 
                IO.println("Viernes"); 
                break; 
            case 6: 
                IO.println("Sabado");
                break; 
            case 7: 
                IO.println("Domingo");
                break; 
            default: 
                IO.println("Número fuera del rango"); 
                Program.ActionToDayAndMoth(); 
                break; 
                 
        }

    }

    static void Moth() {

        IO.println("==============="); 
        IO.println("==== MESES ====");
        IO.println("===============");  

        IO.print("Ingrese un número: "); 
        int moth = sc.nextInt(); 

        switch (moth){
            case 1: 
                IO.println("Enero\n"); 
                break; 
            case 2: 
                IO.println("Febrero\n"); 
                break; 
            case 3: 
                IO.println("Marzo\n"); 
                break; 
            case 4: 
                IO.println("Abril\n"); 
                break; 
            case 5: 
                IO.println("Mayo\n"); 
                break; 
            case 6: 
                IO.println("Junio\n"); 
                break; 
            case 7: 
                IO.println("Julio\n"); 
                break; 
            case 8: 
                IO.println("Agosoto\n"); 
                break; 
            case 9: 
                IO.println("Septiembre\n"); 
                break; 
            case 10: 
                IO.println("Octubre\n"); 
                break; 
            case 11: 
                IO.println("Noviembre\n"); 
                break; 
            case 12: 
                IO.println("Diciembre\n"); 
                break; 
            default: 
                IO.println("Ingrese un valor valido dentro del rango (1-12)\n"); 
                Program.ActionToDayAndMoth(); 
                break; 
        }
    }
}
