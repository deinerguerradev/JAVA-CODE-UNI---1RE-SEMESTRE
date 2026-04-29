import java.util.Scanner;
import java.util.HashMap;
import java.util.Map; 

public class TiendaDeVideojuegos {

    public static Scanner sc = new Scanner(System.in);
    
    public static HashMap<Integer, String[]> videoGames = new HashMap<>(){{

        put(1, new String[] {"Acción", "God of War", "Devil may Cry 5", "Sekiro", });
        put(2, new String[] {"Aventura", "The Legend of Zelda", "Red Dead Redemption 2", "Uncharted"});
        put(3, new String[] {"Deportes", "FIFA 25", "NBA 2K25", "F1 24"}); 
        put(4, new String[] {"RPG", "Elden Ring", "Final Fantasy", "Cyberpunk"}); 
        put(5, new String[] {"Terror", "Resident Evil", "Silent Hil 2", "Alan Wake 2"}); 

    }}; 

    private static boolean _isConnet = true; 

    private static int _numberBuy; 
    private static float _totalPay = 0;
    private static boolean _hasDiscount = false; 
    private static int numberGames = 0; 

    
    private static float _totalSales = 0; 
    private static float _totalDiscountSesion = 0; 

    private static HashMap<Integer, String[]> _saleRegistration = new HashMap<>(); 

    public static HashMap<Integer, Float[]> _gamePrice = new HashMap<>(){{

        put(1, new Float[] {150000f, 120000f, 130000f}); 
        put(2, new Float[] {160000f, 150000f, 110000f}); 
        put(3, new Float[] {90000f, 100000f, 100000f}); 
        put(4, new Float[] {180000f, 170000f, 150000f}); 
        put(5, new Float[] {130000f, 120000f, 130000f}); 

    }}; 

    public static void main(String[] args) {
        PrincipalMenu();
    }

    public static void PrincipalMenu () {

        while (_isConnet){

            _totalPay = 0; 

            IO.println("\n==============================="); 
            IO.println("==== TIENDA DE VIDEOJUEGOS ===="); 
            IO.println("===============================\n"); 

            IO.print("Cuantos videojeugos va a comprar el cliente?: "); 
            numberGames = sc.nextInt(); 

            for (int i = 0; i < numberGames; i++){

                SelectVideoGames();

            }

            PayProcesses(_totalPay);

            IO.println("\n=======OPCIONES: ======="); 
            IO.println("1. Desplegar las ventas de la sesión (opcion no disponible)");
            IO.println("2. Salir");
            IO.println("3. seguir la sesion"); 
            
            int option = sc.nextInt();
            
            if (option == 1) {
                DisplaySesionSales();
            }

            if(option == 2){
                _isConnet = false; 
                DisplaySesionNumbers();
            }

            
        }

    }

    public static void showVideoGamesTematic () {

        IO.println("\n========================================"); 
        IO.println("==== TIPOS DE VIDEOJEUGOS DISPONIBLES ===="); 
        IO.println("==========================================\n"); 

        for(int i = 1; i <= videoGames.size(); i++){

            IO.println(i + ". " +videoGames.get(i)[0]+ "."); 

        }

    }

    public static void showVideoGamesToSpecifcTematic(int videoGameTematic) {


        IO.println("\n============================================="); 
        IO.println("==== VIDEOJUEGOS DE " + videoGames.get(videoGameTematic)[0].toUpperCase() +" ===="); 
        IO.println("===============================================\n"); 

        for (int i = 1; i <= 3; i++){

            IO.println("\t" + i + " ." + videoGames.get(videoGameTematic)[i] + ".");

        }

        IO.println();

    }

    public static void SelectVideoGames() {

        showVideoGamesTematic();

        IO.print("Ingrese un genero de videojuego (1-5): "); 
        int generGame = sc.nextInt(); 

        showVideoGamesToSpecifcTematic(generGame);

        IO.print("Ingrese una de las opciones del genero anterior (1-3): ");
        int specificGenerGame = sc.nextInt(); 

        SelectionProcesses(generGame, specificGenerGame);
        
        IO.println("Se agrego al carrito"); 
        IO.println("===========================================================\n"); 

    }

    public static void SelectionProcesses (int gameIndex, int specificGame){
    
        float gamePrice = _gamePrice.get(gameIndex)[specificGame-1]; 
        _totalPay = _totalPay + gamePrice; 
       
    }

    public static void PayProcesses (float pay) {

        if (pay > 500000f){

            float discount = 0.10f * _totalPay; 

            _totalPay = pay - discount; 

            IO.println("el cliente tiene un descuento del 10%!"); 
            IO.println("El cliente tiene que pagar: $" + _totalPay); 
            
            _totalSales = _totalSales + _totalPay; 
            _numberBuy++; 
            _totalDiscountSesion = _totalDiscountSesion + discount; 
            _hasDiscount = true; 

            RegisterSale(_totalPay, numberGames, _hasDiscount);

        }
        else {

            IO.println("el cliente tiene que pagar: $" + pay); 
            RegisterSale(pay, numberGames, _hasDiscount);
            _numberBuy++; 
            _hasDiscount= false; 
            _totalSales = _totalSales + pay; 
        }

    }

    public static void RegisterSale (float totalPay, int totalGamesBuys, boolean discount){

        String gamesBuys = String.valueOf(totalGamesBuys); 
        String pay = String.valueOf(totalPay);
        String hasDiscount = String.valueOf(discount);  
        
        _saleRegistration.put(_numberBuy, new String[] {gamesBuys, pay, hasDiscount}); 

    }

    private static void DisplaySesionNumbers () {

        if (_saleRegistration.size() == 0){
            IO.println("No se realizado ninguna venta en esta sesión"); 
        }
        else {

            float totalSales = _totalSales - _totalDiscountSesion; 
            IO.println("1. Se realizaron: " + _numberBuy + " compras.");
            IO.println("2. Se hizo una venta total de $" + totalSales + " COP."); 
        }

    }

    private static void DisplaySesionSales () {

        if(_saleRegistration.size() > 0){

            //lo del bucle for de primer nive, el parenteis, no lo hice, me toco buscar como se hacia

            for (Map.Entry<Integer, String[]> value: _saleRegistration.entrySet()){

                Integer numberSale = value.getKey(); 
                String[] info = value.getValue(); 

                IO.println("Número de venta: " + numberSale); 

                for (int i = 0; i < info.length; i++){

                    if (i == 0) {
                        IO.println("\tVenta tota: " + info[i]); 
                    }
                    else if (i == 1){
                        IO.println("\tJuegos Comprados: " + info[i]); 
                    }
                    else if (i == 2){
                        IO.println("\tAplico Descuento: " + info[i]); 
                    }

                }

            }
        
        }

        else {
            IO.println("No ha realizado ninguna venta!");
        }

    }
}
