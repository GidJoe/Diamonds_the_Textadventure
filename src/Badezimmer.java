import java.io.IOException;
import java.util.Scanner;
// Random 10 und 11
public class Badezimmer {

	static void BadezimmerR() throws InterruptedException, IOException {
		ConsoleFlush.flush();
		System.out.println("");
		System.out.println("Du bist im Badezimmer");
		System.out.println("");
		System.out.println(
				"_____________________________Navigation_____________________________________________________");
		System.out.println(" [1] in den Flur gehen  ");
		System.out.println(
				"____________________________________________________________________________________________ ");
		System.out.println(" ");
		System.out.println(" [2] In die große Wäschetruhe gucken");
		System.out.println(" [3] in den Trockner gucken");
		System.out.println("");
		System.out.println("");
		;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Was möchtest du tun? ");
		String input1 = scanner.nextLine();
		double auswahl = Double.parseDouble(input1);

			
		if (auswahl == 1) {
			Flur.FlurR();
		} else if (auswahl == 2) {
			if (Dia.zufall == 10) {
				DiaGefunden.DG();
			} else {
				System.out.println("Du schaust in die Wäschetruhe und findest nur dreckige Wäsche");
				System.out.println("...");
				Scanner s = new Scanner(System.in);
				s.nextLine();
				Badezimmer.BadezimmerR();
			}
		} else if (auswahl == 3) {
			if (Dia.zufall == 11) {
				DiaGefunden.DG();
			} else {
				System.out.println("Du öffnest den Trockner und schaust rein. Du findest keinen Diamanten!");
				System.out.println("...");
				Scanner s = new Scanner(System.in);
				s.nextLine();
				Badezimmer.BadezimmerR();
			}
		}
	}
}
