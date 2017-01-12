package algo;

import java.util.ArrayList;
import java.util.List;

import tools.Fichier;
import tools.Point;

public class AlgoDiviserPourRegner {

	private ArrayList<Point> listePoint;
	private int surfaceMax;
	
	public AlgoDiviserPourRegner(String file){
		Fichier fichier = new Fichier();
		fichier.getInformations(file);
		this.listePoint = fichier.getPoints(); 
		this.listePoint.add(0, new Point("0","0"));
		this.listePoint.add(new Point(fichier.getLongueur(),"0"));
		this.surfaceMax = 0;
	}
	
	public int getOrdonneeMin(int a, int b){
		Point pt = this.listePoint.get(a+1);
		for(int i = a+2; i<b; i++ ){
			Point point = this.listePoint.get(i);
			if(point.getOrdonnee() < pt.getOrdonnee()){
				pt = point;
			}
		}
		return this.listePoint.indexOf(pt);
	}
	
	public int calculSurfaceRectangle(int abscisse1, int abscisse2, int ordonnee){
		int surface;
		surface = (abscisse1>abscisse2)?(abscisse1-abscisse2)*ordonnee:(abscisse2-abscisse1)*ordonnee;
		return surface;
	}
	
	/*public diviser(int debut, int fin, int milieu){
		List<Point> liste1 = listePoint.subList(debut, milieu);
		liste1.afficherListe();
		List<Point> liste2 = listePoint.subList(milieu, fin);
	}*/
	
	public void afficherListe(){
		for(Point pt : this.listePoint){
			pt.printPoint();
		}
	}
	
}
