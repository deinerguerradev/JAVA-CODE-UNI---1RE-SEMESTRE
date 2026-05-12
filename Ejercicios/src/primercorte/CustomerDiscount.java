package primercorte;

import java.util.Scanner;
import java.util.HashMap;

public class CustomerDiscount {

    public static Scanner sc = new Scanner(System.in); 

    //Base de datos para los custumer: 
    private static final HashMap<String, String[]> customerDataBase = new HashMap<>(){{

        put("18261002", new String[] {"DEINER GUERRA", "23", "true"});
        put("18261003", new String[] {"SAMUEL GOMEZ", "40", "false"}); 
        put("18261004", new String[] {"CIRSTIAN TORRES", "70", "true"});

    }}; 

    public static void Calculation (){

        IO.println("============================"); 
        IO.println("== CALCULAR DESCUENTO - 2 =="); 
        IO.println("============================\n"); 

        IO.print("Ingrese su documento: "); 
        String document = sc.nextLine();  

        for (int i = 0; i < customerDataBase.size(); i++){

            if (customerDataBase.containsKey(document)){
                HasDiscount(document); 
                break; 
            }

        }
        
    }

    static void HasDiscount (String document) {

        String age = customerDataBase.get(document)[1]; 
        int customerAge = Integer.valueOf(age);

        String membershipState = customerDataBase.get(document)[2];
        boolean hasDiscount = Boolean.valueOf(membershipState);

        if (customerAge > 60 && hasDiscount){
            IO.println(customerDataBase.get(document)[0] + " Tiene descuento"); 
        }
        else {
            IO.println(customerDataBase.get(document)[0]+ " no tiene Descuento"); 
        }

    }

    
}
