package FirstPackage;

public class EmployeeHoraire  extends Personne{
	

	int heuresPrestÚs ;
    int tauxHauraire ;
    
    public int getTauxHauraire() {
		return tauxHauraire;
	}

	public void setTauxHauraire(int tauxHauraire) {
		this.tauxHauraire = tauxHauraire;
	}

	public int getHeuresPrestÚs() {
		return heuresPrestÚs;
	}

	public void setHeuresPrestÚs(int heuresPrestÚs) {
		this.heuresPrestÚs = heuresPrestÚs;
	}

	
	public double EmployeeComissiont() {
		return this.salaireMensuelle = tauxHauraire * heuresPrestÚs;
	}
	public EmployeeHoraire(String nom ,int heuresPrestÚs ,int tauxHauraire,int salaireMensuelle2) {
		super();
		// TODO Auto-generated constructor stub
		this.nom = nom ;
		this.heuresPrestÚs = heuresPrestÚs;
		this.tauxHauraire = tauxHauraire ;
	}
	
	// TODO Auto-generated method stub

	@Override
	public String toString() {
		return "EmployeeHoraire [tauxHauraire=" + tauxHauraire + ", heuresPrestÚs=" + heuresPrestÚs +  "]";
	}
	



}
