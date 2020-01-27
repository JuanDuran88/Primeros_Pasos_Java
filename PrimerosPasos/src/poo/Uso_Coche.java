package poo;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Coche Renault=new Coche(); //INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE
		
		//System.out.println(Renault.dime_largo());
		
		//System.out.println("Este Coche tiene " + Renault.ruedas + " ruedas.");
		
		Coche micoche=new Coche();
		
		micoche.establece_color("marrón");
		
		System.out.println(micoche.dime_datos_generales());
		
		System.out.println(micoche.dime_color());

	}

}
