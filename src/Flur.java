import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Flur {

	static void FlurR() throws InterruptedException, IOException {
		ConsoleFlush.flush();
		System.out.println("");
		System.out.println("Du bist im Flur");
		System.out.println("");
		System.out.println(
				"_____________________________Navigation_____________________________________________________");
		System.out.println(" [1] ins Wohnzimmer gehen  " + "[2] Ins Badezimmer gehen  " + "[3] Is Kinderzimmer gehen");
		System.out.println(" [4] ins Spielzimmer gehen  " + "[5] Ins Schlafzimmer gehen");
		System.out.println(
				"____________________________________________________________________________________________");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Was möchtest du tun? ");
		String input1 = scanner.nextLine();
		double eingabe = Double.parseDouble(input1);

		if (eingabe == 1) {
			Wohnzimmer.WZ();
		} else if (eingabe == 2) {
			Badezimmer.BadezimmerR();
		} else if (eingabe == 3) {
			System.out.println("Verschlossen! Du brauchst einen Schlüssel");
			Scanner s = new Scanner(System.in);
			s.nextLine();
			Flur.FlurR();
		} else if (eingabe == 4) {
			Spielzimmer.SpielzimmerR();
		} else if (eingabe == 5) {
			System.out.println("Verschlossen! Du brauchst einen Schlüssel");
			Scanner s = new Scanner(System.in);
			s.nextLine();
			Flur.FlurR();
			;
		}

	}
}
