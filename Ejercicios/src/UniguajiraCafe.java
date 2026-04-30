import java.util.Scanner; 
import java.util.HashMap; 

public class UniguajiraCafe {

    public static Scanner sc = new Scanner(System.in);
    
    public static HashMap<Integer, String[]> student = new HashMap<>() {{

        put(1119394928, new String[] {"sistemas", "deiner guerra", "true"});
        put(1119394927, new String[] {"diseño", "samuel gomez", "true"});
        put(1119394926, new String[] {"derecho", "efrenyel barros", "false"});
        put(1119394925, new String[] {"medicina", "cristian torres", "false"});
        put(1119394924, new String[] {"civil", "carlos escudero", "true"}); 
        put(1119394923, new String[] {"administración", "carlos escudero", "true"}); 

    }}; 

    public static float[] menuPrice = {12000f, 2300f, 45000f}; 

    public static void overview () {

        IO.println("======================");
        IO.println(" CAFETERIA UNIGUAJIRA ");
        IO.println("======================"); 

        IO.println("\nIngrese su documento: ");
        int id = sc.nextInt(); 
        
        boolean isActive = Boolean.valueOf(student.get(id)[2]); 

        if (student.containsKey(id) && isActive){
            makeOrder(id);
        }
        else {
            IO.println("Inicio de sesion fallido..."); 
        }
    }

    private static void makeOrder (int id) {

        IO.println("==============");
        IO.println(" MENÚ DEL DÍA ");  
        IO.println("==============");

        IO.println("\n1. Arroz de pollo.");
        IO.println("2. Bandeja Paisa"); 
        IO.println("3. Sopa de lentejas\n");
        
        IO.println("Ingrese una de las opciones anteriores: ");
        int option = sc.nextInt(); 
        
        switch (option) {
            case 1:
                processeOrder(1, id); 
                break;
            case 2: 
                processeOrder(2, id); 
                break;
            case 3: 
                processeOrder(3, id); 
                break; 
            default:
                break;
        }
    }

    private static void processeOrder (int menu, int id){

        String studentCareer = student.get(id)[0]; 
        float price = 0; 

        if (menu == 1){
            price = menuPrice[0]; 
            price = processSpecifOrder(studentCareer, price); 
        }
        else if (menu == 2){
            price = menuPrice[0]; 
            price = processSpecifOrder(studentCareer, price); 
        }
        else if (menu == 3){
            price = menuPrice[0]; 
            price = processSpecifOrder(studentCareer, price); 
        }

        IO.println("El estudiante tiene que pagar: $" + price + "COP"); 

    }

    private static float processSpecifOrder (String career, float menu){

        float discount = 0; 

        switch (career){
            case "sistemas": 
                discount = 0.25f; 
                break;  
            case "medicina": 
                discount = 0.30f;
                break; 
            case "diseño": 
                discount = 0.10f;
                break; 
            case "administración": 
                discount = 0.20f;
                break; 
            case "derecho": 
                discount = 0.15f;
                break; 
            default: 
                discount = 0; 
                break; 
        }

        float totalPay = menu - (menu * discount); 

        return totalPay; 
        

    }

}