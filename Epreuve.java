package examan_2020;


public class Epreuve {
	private String denomination;
	private Athlete[] Athletes;
	private  final int MAX_P=30;
	private  final int MAX_E=20;
	private boolean etat;
	private int nbr=0;
	private int taille;
	
	
	public Epreuve(String denomination,int max) {
		this.Athletes=new Athlete[max];
		this.denomination=denomination;
		taille=max;
	}
	
	public void ajout(Athlete a) {
        if (Athletes.length<taille) {
        	Athletes[nbr++] =a;
        }
    }
	 public void terminer() {
		 etat=true;
	 }
	 public boolean estTerminer() {
		 return etat;
	 }
	public int getRecordOlymique() {
		int max =((Athlete)Athletes[0]).getId();
		
		for(int i=1;i<taille;i++) {
			if(Athletes[i] instanceof Athlete) {
				if(((Athlete)Athletes[i]).getId()>max) {
				
			}
			}
		}
		return max;
	}
	public Resultat getResultat(int id) {
		Resultat test=null;
		for(int i=0;i<taille;i++) {
			if(Athletes[i] instanceof Athlete) {
				if(id==((Athlete)Athletes[i]).getId() && ((Athlete)Athletes[i]).getResultat()!=null ) {
					test=((Athlete)Athletes[i]).getResultat();
				}
			}
		}
		return test;
	}
}
