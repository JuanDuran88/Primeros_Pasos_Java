package poo;

public class Coche {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	public Coche() {
		
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
		
	}
	
	public String dime_datos_generales() { //GETTER
		
		return "La plataforma del vehículo tiene " + ruedas + " ruedas" +
		". Mide " + largo/1000 + " metros con un ancho de " + ancho +
		" cm y un peso de plataforma de " + peso_plataforma + " kg";
	}
	
	
	public void establece_color(String color_coche) { //SETTER
		
		//color="azul";
		
		color=color_coche;
		
	}
	
	public String dime_color() {
		
		return "El color de tu coche es " + color;
		
	}

}
