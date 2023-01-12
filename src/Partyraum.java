import java.io.IOException;
import java.util.Scanner;
//Random 7,8,9
public class Partyraum {

	public static void PartyraumR() throws InterruptedException, IOException {
		ConsoleFlush.flush();
		System.out.println("");
		System.out.println("Du bist im Partyraum");
		System.out.println("");
		System.out.println(
				"_____________________________Navigation_____________________________________________________");
		System.out.println(" [1] ins Wohnzimmer gehen  ");
		System.out.println(
				"____________________________________________________________________________________________ ");
		System.out.println(" ");
		System.out.println(" [2] In die Schubladen gucken ");
		System.out.println(" [3] in den Karton gucken");
		System.out.println(" [4] im Retro-Raum gucken");
		System.out.println("");
		;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Was möchtest du tun? ");
		String input1 = scanner.nextLine();
		double auswahl = Double.parseDouble(input1);

		if (auswahl == 1) {
			Wohnzimmer.WZ();
		} else if (auswahl == 2) {
			if (Dia.zufall == 7) {
				DiaGefunden.DG();
			} else {
				System.out.println(
						"Du findest Geschirr, verschiedene Becher und große Schüsseln aber leider kein Diamant.");
				System.out.println("...");
				Scanner s = new Scanner(System.in);
				s.nextLine();
				Partyraum.PartyraumR();
			}
		} else if (auswahl == 3) {
			if (Dia.zufall == 8) {
				DiaGefunden.DG();
			} else {
				System.out.println(
						"Du schaust unter das Sofa. Du findest altes Katzenspielzeug und Staub aber leider keinen Diamanten!");
				System.out.println("...");
				Scanner s = new Scanner(System.in);
				s.nextLine();
				Partyraum.PartyraumR();
			}
		} else if (auswahl == 4) {
			if (Dia.zufall == 9) {
				DiaGefunden.DG();
			} else {
				System.out.println("Du schaust hinter den Fernsehr aber du findest keinen Diamanten");
				System.out.println("...");
				Scanner s = new Scanner(System.in);
				s.nextLine();
				Partyraum.PartyraumR();
			}
		}
	}

}
