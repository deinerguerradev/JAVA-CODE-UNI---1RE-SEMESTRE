package segundocorte.practicaVectores;

import java.util.*;

public class Employees {

    private static String[] ids = {"10234567", "20345678", "30456789", "40567890", "50678901"};
    private static String[] names = {"Carlos", "Diana", "Andres", "Valientina", "Miguel"};
    private static double[] salary = {1300000, 2800000, 1160000, 3500000, 1050000};

    private static Scanner sc = new Scanner(System.in);

    static void started(){

        IO.print("Ingrese la cédula a buscar: ");
        String id = sc.nextLine();

        int employee = searchEmployee(id);

        boolean employeeFind = isEmployee(employee);

        if(employeeFind){
            printEmployeeInfo(employee);
        }
        else{
            IO.println("la cedula " + id + " no se encuntra en el sistema!");
        }

    }

    private static boolean isEmployee(int index){
        if(index == -1){
            return false;
        }
        else{
            return true;
        }
    }

    private static int searchEmployee(String id){

        int i = -1;
        int employee = 0;

        while(i < (ids.length-1)){

            i++;

            if(id.equals(ids[i])){
                employee = i;
                break;
            }

        }

        return employee;

    }

    static void printEmployeeInfo(int index){

        String salaryBenefic = analyseSalary(index);

        IO.println("Empleado Encontrado: ");
        IO.println("\tNombre: " + names[index]);
        IO.println("\tSalario: $" + salary[index] + " COP.");
        IO.println("\tSubsidio: " + salaryBenefic);

    }

    private static String analyseSalary(int index){

        if(salary[index] <= 2000000){
            return "El emepleado cuenta con el subsidio de transporte";
        }
        else {
            return "El empleado no cuenta con el subsidio de transporte";
        }

    }

}
