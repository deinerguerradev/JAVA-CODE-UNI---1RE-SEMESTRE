package segundocorte;

public class ejemplo {
    public static void ejempli()
    {
        for (int i = 1; i <= 100; i++){

            if ( i % 3 == 0){
                IO.println("buzz");
            }
            else if (i % 5 == 0){
                IO.println("root");
            }
            else {
                IO.println(i);
            }
        }
    }
}
