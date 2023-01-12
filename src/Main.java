import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;


public class Main {

    //RNG für den Diamanten für alle Klassen

    static Random random = ThreadLocalRandom.current();
    public static int zufall = 1 + random.nextInt(14);


    public static void main(String[] args) throws IOException, InterruptedException {



        // Variablen
        int a;

        // Titelbildschirm
        //
        System.out.println("#################################################");
        System.out.println("##                                              #");
        System.out.println("##             Diamantenssuche                  #");
        System.out.println("##                                              #");
        System.out.println("#################################################");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("");
        System.out.println("              (1) Neues Spiel");
        System.out.println("              (2) Laden");
        System.out.println("              (3) Beenden");
        System.out.println("");
        System.out.println("");

        @SuppressWarnings("resource")
        Scanner start = new Scanner(System.in);
        a = start.nextInt();

        if (a == 1) {
            Intro test = new Intro();
            test.Begrüßung();
        } else if (a == 2) {
            ConsoleFlush.flush();
            Dia.main(args);
        } else if (a == 3) {
            System.out.println("Spiel wird beendet");
        }
        else { }

    }
}
