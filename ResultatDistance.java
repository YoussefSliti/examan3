package examan_2020;

public class ResultatDistance implements Resultat{
	private double distance;
	public ResultatDistance(double distance) {
		this.distance=distance;
	}
	
	public void affiche() {
		System.out.println("la distance est : "+ distance);
	}
	public String toString() {
		return "distance is: "+distance;
	}
	public int compareTo(Resultat r) {
		int s=0;
		if(r instanceof ResultatDistance) {
			if(this.distance == ((ResultatDistance) r).distance){
				s= 0;
			}
			else if(this.distance > ((ResultatDistance) r).distance){
				s= 1;
			}
			else {
				s= -1;
			}
		}
		return s;
	}
}
