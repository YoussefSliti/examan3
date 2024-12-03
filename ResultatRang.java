package examan_2020;

public class ResultatRang implements Resultat{
	private int rang;
	public ResultatRang(int rang) {
		this.rang=rang;
	}
	public void affiche() {
		System.out.println("la distance est : "+rang);
	}
	public String toString() {
		return "rang is: "+rang;
	}
	public int compareTo(Resultat r) {
		int s=0;
		if(r instanceof ResultatRang) {
			if(this.rang == ((ResultatRang) r).rang){
				s= 0;
			}
			else if(this.rang > ((ResultatRang) r).rang){
				s= 1;
			}
			else {
				s= -1;
			}
		}
		return s;
	}
	
	
	
}
