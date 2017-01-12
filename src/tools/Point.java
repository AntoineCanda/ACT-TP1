package tools;

public class Point {

	private int abscisse;
	private int ordonnee;
	
	public Point(String x, String y){
		this.abscisse = Integer.parseInt(x);
		this.ordonnee = Integer.parseInt(y);
	}
	
	public int getAbscisse(){
		return this.abscisse;
	}
	
	public int getOrdonnee(){
		return this.ordonnee;
	}
	
	public void printPoint(){
		System.out.println("Abscisse :"+getAbscisse()+" Ordonnée :"+getOrdonnee());
	}
	
	
}
