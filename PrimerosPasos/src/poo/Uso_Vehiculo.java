package poo;

import javax.swing.*;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Coche Renault=new Coche(); //INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE
		
		//System.out.println(Renault.dime_largo());
		
		//System.out.println("Este Coche tiene " + Renault.ruedas + " ruedas.");
		
		/*Coche micoche=new Coche();
		
		micoche.establece_color(JOptionPane.showInputDialog("Introduce color"));
		
		System.out.println(micoche.dime_datos_generales());
		
		System.out.println(micoche.dime_color());
		
		micoche.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));

		System.out.println(micoche.dime_asientos());
		
		micoche.configura_climatizador(JOptionPane.showInputDialog("¿Cuenta con climatizador?"));
		
		System.out.println(micoche.dime_climatizador());
		
		System.out.println(micoche.dime_peso_coche());
		
		System.out.println("El precio final del coche es: "+ micoche.precio_coche());*/
		
		Coche micoche1=new Coche();
		
		micoche1.establece_color("Rojo");
		
		Furgoneta mifurgoneta1=new Furgoneta(7, 580);
		
		mifurgoneta1.establece_color("azul");
		
		mifurgoneta1.configura_asientos("Si");
		
		mifurgoneta1.configura_climatizador("Si");
		
		System.out.println(micoche1.dime_datos_generales() + ". " + micoche1.dime_color());
		
		System.out.println(mifurgoneta1.dime_datos_generales() + mifurgoneta1.dimeDatosFurgoneta());
		
	}

}
