package tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import tools.Point;

public class Fichier {

	private int hauteur;
	private String longueur;
	private int nbrePoint;
	private ArrayList<Point> listePoint;
	
	public Fichier(){
		this.listePoint = new ArrayList<Point>();
	};
	
	public void getInformations(String file) {
		
		ArrayList<Point> listPoint = new ArrayList<Point>();
		
		File f = new File(file);
		FileReader freader;
			
		try {
			freader = new FileReader(f);
			BufferedReader buffer = new BufferedReader(freader);
			
			String hauteurLongueur = new String();
			hauteurLongueur = buffer.readLine();
			String[] tab = hauteurLongueur.split(" ");
			this.hauteur = Integer.parseInt(tab[1]);
			this.longueur = tab[0];
			
			String nbrePoints = new String();
			nbrePoints = buffer.readLine();
			this.nbrePoint = Integer.parseInt(nbrePoints);
			
			String tmp = new String();
			while ((tmp = buffer.readLine()) != null) {
				String[] tabTemp = tmp.split(" ");
				Point pts = new Point(tabTemp[0], tabTemp[1]);
				listPoint.add(pts);
			}
			buffer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		this.listePoint = listPoint;
	}
	
	public int getHauteur(){
		return this.hauteur;
	}
	
	public String getLongueur(){
		return this.longueur;
	}
	
	public int getNombrePoints(){
		return this.nbrePoint;
	}
	
	public ArrayList<Point> getPoints(){
		return this.listePoint;
	}
}
