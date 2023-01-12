import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DiaGefunden {

	static void DG() throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Glückwunsch! Du hast den Diamant gefunden");
		System.out.println("aber...was ist das? Achtung !!!");
		System.out.println("Eine große, dreiköpfige Spinne attackiert dich");
		Scanner s = new Scanner(System.in);
		s.nextLine();
		Kampf.KampfSpinne();
	}

}
