import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

// Random 12,13,14
public class Spielzimmer {

	public static void SpielzimmerR() throws InterruptedException, IOException {
		ConsoleFlush.flush();
		System.out.println("");
		System.out.println("Du bist im Kinderzimmer");
		System.out.println("");
		System.out.println(
				"_____________________________Navigation_____________________________________________________");
		System.out.println(" [1] in den Flur gehen ");
		System.out.println(
				"____________________________________________________________________________________________ ");
		System.out.println(" ");
		System.out.println(" [2] in deinem Bett gucken ");
		System.out.println(" [3] in deinem Kleiderscharnk gucken");
		System.out.println(" [4] auf dem Dachboden gucken");
		System.out.println("");
		;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Was möchtest du tun? ");
		String input1 = scanner.nextLine();
		double auswahl = Double.parseDouble(input1);

		if (auswahl == 1) {
			Flur.FlurR();
			;
		} else if (auswahl == 2) {
			if (Dia.zufall == 12) {
				DiaGefunden.DG();
			} else {
				System.out.println("Du durchwühlst dein Bett, kannst aber kein Diamanten finden.");
				System.out.println("...");
				Scanner s = new Scanner(System.in);
				s.nextLine();
				Spielzimmer.SpielzimmerR();
			}
		} else if (auswahl == 3) {
			if (Dia.zufall == 13) {
				DiaGefunden.DG();
			} else {
				System.out.println(
						"Du öffnest den Kleiderschrank und suchst nach dem Diamanten. Leider kannst du hier keinen finden.");
				System.out.println("...");
				Scanner s = new Scanner(System.in);
				s.nextLine();
				Spielzimmer.SpielzimmerR();

			}
		} else if (auswahl == 4) {
			if (Dia.zufall == 14) {
				DiaGefunden.DG();
			} else {
				System.out.println("Du steigst auf den Dachboden und suchst in jedem Winkel nach dem Diamanten.");
				System.out.println("Leider kannst du den Diamanten nicht finden.");
				System.out.println("...");
				Scanner s = new Scanner(System.in);
				s.nextLine();
				Spielzimmer.SpielzimmerR();
			}
		}
	}
}
