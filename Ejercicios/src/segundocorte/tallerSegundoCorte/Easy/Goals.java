package segundocorte.tallerSegundoCorte.Easy;

public class Goals {

    private static String[] teams = {"Junior", "Nacional", "Bayern", "Manchester United", "Juventus", "River"};
    private static int[] teamsGoals = {6, 4, 24, 9, 17, 8};

    public static void started (){

        IO.println("\n====================");
        IO.println("  GOLES DE EQUIPOS  ");
        IO.println("====================\n");

        getMaxGoals();

    }

    private static void getMaxGoals (){

        int maxGoals = teamsGoals[0];
        int teamsGoalsProcessed = 0;
        int index = 0;

        while(teamsGoalsProcessed < 6){

            if(teamsGoals[teamsGoalsProcessed] > maxGoals){
                maxGoals = teamsGoals[teamsGoalsProcessed];
                index = teamsGoalsProcessed;
            }

            teamsGoalsProcessed++;

        }

        IO.println("El equipo con más goles fue " + teams[index] + " con " + maxGoals + "goles.");

        getMinGoals();

    }

    private static void getMinGoals() {

        int minGoals = teamsGoals[0];
        int teamsGoalsProcessed = 0;
        int index = 0;

        while(teamsGoalsProcessed < 6){

            if(teamsGoals[teamsGoalsProcessed] < minGoals){
                minGoals = teamsGoals[teamsGoalsProcessed];
                index = teamsGoalsProcessed;
            }

            teamsGoalsProcessed++;

        }

        IO.println("El equipo con menos goles fue " + teams[index] + " con " + minGoals + "goles.");

        getTotalGoals();

    }

    private static void getTotalGoals(){

        int totalGoals = 0;
        int teamsGoalsProcessed = 0;

        while(teamsGoalsProcessed < 6){
            totalGoals = totalGoals + teamsGoals[teamsGoalsProcessed];
            teamsGoalsProcessed++;

        }

        IO.println("se marcaron: " + totalGoals + " goles en el torneo especial.");

        get5goalsMin();

    }

    private static void get5goalsMin() {

        int teamsWithMoreThanFiveGoals = 0;
        int teamsGoalsProcessed = 0;

        while(teamsGoalsProcessed < 6){

            if(teamsGoals[teamsGoalsProcessed] > 5){
                teamsWithMoreThanFiveGoals++;
            }

            teamsGoalsProcessed++;

        }

        IO.println(teamsWithMoreThanFiveGoals + " equipos marcaron más de 5 goles en el torneo");

    }
}
