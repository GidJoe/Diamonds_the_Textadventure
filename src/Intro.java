import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Intro {
	

	public void Begrüßung() throws InterruptedException, IOException {

		ConsoleFlush.flush();
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Willkommen bei Diamantsuche, einem Spiel voller Spaß und Spannung!");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Auf meinem letzten Abenteuer habe ich einen wertvollen Diamanten gefunden und musste ihn vor");		
		TimeUnit.SECONDS.sleep(2);
		System.out.println("den Bösewichten in Sicherheit bringen. Ich habe den Diamanten in unserer Wohnung versteckt, damit");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("die Bösewichte ihn nicht finden können. Jetzt ist es an dir, diesen Diamanten zu finden!");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Du musst schnell sein, sonst finden die Bösewichte den Diamanten und verhökern ihn auf dem Schwarzmarkt.");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Irgendwo hier in unser Wohnung habe ich den Diamanten versteckt, aber sei auf der Hut junger Abenteurer,");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("denn so ein wertvoller Diamant zieht Unrat und Bösewichte magisch an!");
		Scanner s = new Scanner(System.in);
		s.nextLine();
		Wohnzimmer.WZ();		
	}

}
