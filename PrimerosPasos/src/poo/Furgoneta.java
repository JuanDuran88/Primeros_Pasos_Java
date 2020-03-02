package poo;

public class Furgoneta extends Coche { //clase Coche la superClase y la clase furgoneta la subclase, HERENCIA la ventaja de la herencia es la reutilización de código.
	
	private int capacidad_carga;
	private int plazas_extra;
	
	public Furgoneta(int plazas_extra, int capacidad_carga) {
		
		super(); //llamar al constructor de la clase padre (Coche)
		
		this.capacidad_carga=capacidad_carga;
		this.plazas_extra=plazas_extra;
	}
	
	public String dimeDatosFurgoneta() { //getter
		
		return " La capacidad de carga es: " + capacidad_carga + " y las plazas son: " + plazas_extra;
		
	}
	
}
