package FirstPackage;

public class EmployeeHoraire  extends Personne{
	

	int heuresPrest�s ;
    int tauxHauraire ;
    
    public int getTauxHauraire() {
		return tauxHauraire;
	}

	public void setTauxHauraire(int tauxHauraire) {
		this.tauxHauraire = tauxHauraire;
	}

	public int getHeuresPrest�s() {
		return heuresPrest�s;
	}

	public void setHeuresPrest�s(int heuresPrest�s) {
		this.heuresPrest�s = heuresPrest�s;
	}

	
	public double EmployeeComissiont() {
		return this.salaireMensuelle = tauxHauraire * heuresPrest�s;
	}
	public EmployeeHoraire(String nom ,int heuresPrest�s ,int tauxHauraire,int salaireMensuelle2) {
		super();
		// TODO Auto-generated constructor stub
		this.nom = nom ;
		this.heuresPrest�s = heuresPrest�s;
		this.tauxHauraire = tauxHauraire ;
	}
	
	// TODO Auto-generated method stub

	@Override
	public String toString() {
		return "EmployeeHoraire [tauxHauraire=" + tauxHauraire + ", heuresPrest�s=" + heuresPrest�s +  "]";
	}
	



}
