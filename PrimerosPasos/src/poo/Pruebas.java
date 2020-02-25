package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Antonio");
		Empleados trabajador4 = new Empleados("Maria");
		
		trabajador1.cambiaSeccion("RRHH");
		trabajador2.cambiaSeccion("Logística");
		
		/*trabajador1.cambiaNombre("María");*/
		
		System.out.println(trabajador1.devuelvoDatos());
		
		
		System.out.println(trabajador2.devuelvoDatos());
		
		
		System.out.println(trabajador3.devuelvoDatos());
		
		System.out.println(trabajador4.devuelvoDatos());

	}

}


class Empleados{
	
	public Empleados(String nom) { //CONSTRUCTOR
		
		nombre=nom;
		
		seccion="administración";
		
		Id=IdSiguiente;
		
		IdSiguiente++;
		
	}
	
	public void cambiaSeccion(String seccion) { //SETTER
		
		this.seccion=seccion;
		
		
	}
	
	/*public void cambiaNombre(String nombre) {
		
		this.nombre=nombre;
		
	}*/
	
	public String devuelvoDatos() { //GETTER
		
		return "El nombre es: " + nombre + " y la sección es " + seccion + " y el Id= " +Id;
		
		
	}
	
	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente=1;

}
