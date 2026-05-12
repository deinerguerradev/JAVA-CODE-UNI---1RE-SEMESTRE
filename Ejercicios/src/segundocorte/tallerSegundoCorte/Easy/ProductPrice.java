package segundocorte.tallerSegundoCorte.Easy;

public class ProductPrice {

    private static final String[] productNames = {"papa", "yuca", "tomate", "cebolla", "platano"};
    private static final float[] productPrices = {400.0f, 700.0f, 500.0f, 300.0f, 1000.0f};

    public static void started (){

        IO.println("\n===============================");
        IO.println("==== PRECIOS DE PRODUCTOS =====");
        IO.println("===============================\n");

        getCheapProduct();
        getExpensiveProduct();

    }

    private static void getExpensiveProduct(){

        int products = 0;
        float maxPrice = productPrices[0];
        int index = 0;

        while(products < 5){

            if(productPrices[products] > maxPrice){
                maxPrice = productPrices[products];
                index = products;
            }

            products++;

        }

        IO.println("el producto " + productNames[index] + " es el de mayor valor con $" + maxPrice + "COP.\n");

    }

    private static void getCheapProduct() {

        int products = 0;

        float minPrice = productPrices[0];
        int index = 0;

        while(products < 5){

            if(productPrices[products] < minPrice){
                minPrice = productPrices[products];
                index = products;
            }

            products++;

        }

        IO.println("el producto " + productNames[index] + " es el de menor valor con $" + minPrice + "COP.\n");


    }

}
