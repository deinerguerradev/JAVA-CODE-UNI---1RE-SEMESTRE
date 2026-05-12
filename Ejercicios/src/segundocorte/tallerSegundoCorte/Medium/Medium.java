package segundocorte.tallerSegundoCorte.Medium;

public class Medium {

    public static void identifyAlgorithm (int algorithm){

        switch(algorithm){
            case 1:
                WeekTemperture.started();
                break;
            case 2:
                Stockroom.started();
                break;
            case 3:
                PatientTracking.started();
                break;
            case 4:
                PowerUsage.started();
                break;
        }

    }

}
