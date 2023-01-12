import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
//Random 4,5,6
public class Küche {
	
	static void KücheR() throws InterruptedException, IOException { 
		ConsoleFlush.flush();
		System.out.println("");
		System.out.println("Du bist in der Küche ");
		System.out.println("");
		System.out.println(
				"_____________________________Navigation_____________________________________________________");
		System.out.println(" [1] Ins Wohnzimmer gehen");
		System.out.println(
				"____________________________________________________________________________________________ ");
		System.out.println(" ");
		System.out.println(" [2] in den Herd gucken ");
		System.out.println(" [3] in den Abstellraum gucken ");
		System.out.println(" [4] in den Kühlschrank gucken");
		System.out.println("");
		;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Was möchtest du tun? ");
		String input1 = scanner.nextLine();
		double auswahl = Double.parseDouble(input1);

		if (auswahl == 1) {
			Wohnzimmer.WZ();
		} else if (auswahl == 2) {
			if (Dia.zufall == 4) {
				DiaGefunden.DG();
			} else {
				System.out.println("Du öffnest den Herd vorsichtig und schaust hinein. Hier ist der Diamant nicht.");
				System.out.println("...");
				Scanner s = new Scanner(System.in);
				s.nextLine();
				Küche.KücheR();
			}
		} else if (auswahl == 3) {
			if (Dia.zufall == 5) {
				DiaGefunden.DG();
			} else {
				System.out.println("Du durchsuchst den Abstellraum aber du findest keinen Diamanten");
				System.out.println("...");
				Scanner s = new Scanner(System.in);
				s.nextLine();
				Küche.KücheR();
			}} 
			else if (auswahl == 4) {
				if (Dia.zufall == 6) {
					DiaGefunden.DG();
				} else {
					System.out.println("Du findest einige Lebensmittel im Kühlschrank und auch eine Müllermilch mit Bananengeschmack");
					System.out.println("aber keinen Diamanten");
					System.out.println("...");
					Scanner s = new Scanner(System.in);
					s.nextLine();
					Küche.KücheR();
				}
			}
	}
}

