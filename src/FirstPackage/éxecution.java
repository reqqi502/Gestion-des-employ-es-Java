package FirstPackage;
// akram reqqi
public class éxecution  {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
     Scanner s = new Scanner(System.in);
     System.out.println("***************** bojouuur //////////////////");
     Personne p1 = new Personne("akram",400);
     System.out.println("heeey u  thats truuuue "  + p1.salaireMensuelle );
     System.out.println(p1.toString());
     
     EmployeeComission p2 = new EmployeeComission("akram" ,200,56,7000);
     System.out.println("akram" + p2.salaireMensuelle *(p2.vent * p2.commisionF*0.1));
     
     EmployeeHoraire p3 = new EmployeeHoraire(200,56,7000);
     System.out.println("akram" + p3.salaireMensuelle );
     s.close();
     */
     System.out.println("***************** bojouuur //////////////////");
     EmloyeeFix p1 = new EmloyeeFix("akram",700);
     System.out.println("votre salaire fix c'est : "  + p1.salaireMensuelle );
     
     EmployeeComission p2 = new EmployeeComission("akram" , 700,10,100);
     System.out.println("le salair vc votre commision c'est :" + p2.salaireMensuelle *(p2.vent * p2.commisionF*0.1));
     
     EmployeeHoraire p3 = new EmployeeHoraire("akram",200,56,700);
     System.out.println("votre salaire et votre taux horaire c'est :" + p3.tauxHauraire * p3.heuresPrestés);
       
	}
}
