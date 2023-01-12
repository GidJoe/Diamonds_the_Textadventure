import java.io.IOException;
import java.util.Scanner;

// Random 1,2,3
public class Wohnzimmer {

	public static void WZ() throws InterruptedException, IOException {

		ConsoleFlush.flush();
		System.out.println("");
		System.out.println("Du bist im Wohnzimmer");
		System.out.println("");
		System.out.println(
				"_____________________________Navigation_____________________________________________________");
		System.out.println(" [1] In die Küche gehen  " + "[2] In den Flur gehen  " + "[3] In den Partyraum gehen");
		System.out.println(
				"____________________________________________________________________________________________ ");
		System.out.println(" ");
		System.out.println(" [4] In den Schrank gucken ");
		System.out.println(" [5] Unter das Sofa gucken ");
		System.out.println(" [6] Hinter den Fernsehr gucken");
		System.out.println("");
		;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Was möchtest du tun? ");
		String input1 = scanner.nextLine();
		double auswahl = Double.parseDouble(input1);

		if (auswahl == 1) {
			Küche.KücheR();
		} else if (auswahl == 2) {
			Flur.FlurR();
		} else if (auswahl == 3) {
			Partyraum.PartyraumR();
		} else if (auswahl == 4) {
			if (Dia.zufall == 1) {
				DiaGefunden.DG();
			} else {
				System.out.println(
						"Du findest Geschirr, verschiedene Becher und große Schüsseln aber leider kein Diamant.");
				System.out.println("...");
				Scanner s = new Scanner(System.in);
				s.nextLine();
				Wohnzimmer.WZ();
			}
		} else if (auswahl == 5) {
			if (Dia.zufall == 2) {
				DiaGefunden.DG();
			} else {
				System.out.println(
						"Du schaust unter das Sofa. Du findest altes Katzenspielzeug und Staub aber leider keinen Diamanten!");
				System.out.println("...");
				Scanner s = new Scanner(System.in);
				s.nextLine();
				Wohnzimmer.WZ();
			}
		} else if (auswahl == 6) {
			if (Dia.zufall == 3) {
				DiaGefunden.DG();
			} else {
				System.out.println("Du schaust hinter den Fernsehr aber du findest keinen Diamanten");
				System.out.println("...");
				Scanner s = new Scanner(System.in);
				s.nextLine();
				Wohnzimmer.WZ();
			}
		}

	}
}
