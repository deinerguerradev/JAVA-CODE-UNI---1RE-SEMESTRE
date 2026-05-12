package segundocorte.tallerSegundoCorte.Easy;

public class Easy {

    public static void identifyAlgorithm (int algorithm){

        switch(algorithm){
            case 1:
                Scores.started();
                break;
            case 2:
                ProductPrice.started();
                break;
            case 3:
                GroupAge.started();
                break;
            case 4:
                Goals.started();
                break;
        }

    }

}
