import java.util.Scanner; 
import java.util.HashMap; 

public class StudentScholarishp {

    public static Scanner sc = new Scanner(System.in); 
    private static HashMap<Integer, String[]> dataBaseStudent = new HashMap<>() {{

        put(1119394928, new String[] {"DEINER GUERRA", "true", "4.6f" }); 
        put(1119394935, new String[] {"YEIDER PERALTA", "false", "4.5f"}); 
        put(1119394592, new String[] {"DAIR GOMEZ", "true", "3.2f"}); 

    }}; 

    public static void overview () {

        IO.println("================================");
        IO.println("PROCESO DE BECAS PARA ESTUDIANTE");
        IO.println("================================"); 

        IO.print("\nIngrese su documento de identidad: "); 
        int id = sc.nextInt(); 

        if(dataBaseStudent.containsKey(id)){

            IO.println("Inicio de sesión exitoso...\n"); 
            hasScholarish(id);

        }
        else {
            IO.println("Ingresa una tarjeta de identidad valida!\n"); 
        }

    }

    private static void hasScholarish (int id) {

        boolean isActive = Boolean.valueOf(dataBaseStudent.get(id)[1]); 
        float scoreStudent = Float.valueOf(dataBaseStudent.get(id)[2]); 

        if (isActive && scoreStudent >= 4.5) {

            IO.println("El estudiante " + dataBaseStudent.get(id)[0] + " Tiene una beca!\n"); 

        }

        else {

            IO.println("El estudiante " + dataBaseStudent.get(id)[0] + "no tiene una beca!\n"); 
       
        }

    }

}
