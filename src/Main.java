import java.util.ArrayList;
import tools.Fichier;
import tools.Point;
import algo.AlgoDiviserPourRegner;

public class Main {
	public static void main(String[] args) {
		
		
		AlgoDiviserPourRegner algo = new AlgoDiviserPourRegner(args[0]);

		algo.afficherListe();
		

		int surface = algo.calculSurfaceRectangle(0,10,5);
		
		System.out.println(surface);

	}
}
