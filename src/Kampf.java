import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Kampf {

	static void KampfSpinne() throws InterruptedException {
		// Variablen

		int HPBoss = 100;
		int HPSpieler = 100;
		int Schwert1h = 10;
		int Spinnenschlag = 5;
		String dmgBoss1 = "";
		String dmgBoss2 = "";
		// Zufall
		Random rn = new Random();

		while ((HPBoss >= 5) && (HPSpieler >= 5)) {
			// Konsolen Clear workaround
			for (int i = 0; i <= 50; i++) {
				System.out.println(" ");
			}

			System.out.println("Du kämpfst gegen die Spinne !");
			System.out.println("Boss HP: " + HPBoss + " / 100");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("" + dmgBoss1);
			System.out.println("" + dmgBoss2);
			System.out.println("");
			System.out.println("");
			System.out.println("Spieler HP: " + HPSpieler + " / 100");
			System.out.println("");
			System.out.println("[1] Angriff   [2] Flucht ");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			Scanner kampf = new Scanner(System.in);
			int a = kampf.nextInt();

			if (a == 1) {
				int würfela = rn.nextInt(100);
				int würfelb = rn.nextInt(100);

				if (würfelb <= 50) {
					HPSpieler = HPSpieler - Spinnenschlag;
					dmgBoss1 = ("Die Spinne trifft dich mit " + Spinnenschlag);

				} else {
					dmgBoss1 = "Die Spinne verfehlt!";
				}

				if (würfela <= 80) {
					HPBoss = HPBoss - Schwert1h;
					dmgBoss2 = ("Du triffst die Spinne mit " + Schwert1h);

				} else {
					dmgBoss2 = "Du hast verfehlt!";
				}

			} else {
				System.out.println("Keine Flucht möglich! :(");
				TimeUnit.SECONDS.sleep(1);
			}
		}

		if (HPSpieler < 5) {
			System.out.println("Die Spinne gewinnt!");
		}

		else if (HPBoss < 5) {
			Outro.Ende();
		}
	}
		 
		
}

