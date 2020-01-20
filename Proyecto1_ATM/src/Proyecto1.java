import java.text.DecimalFormat;
import java.util.Scanner;

public class Proyecto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat decfor = new DecimalFormat ("0.00");
		
		int Clave [] = {1234, 5867, 9991, 5894, 4310, 8901};
		String [] Nombre = {"Pedro P.","Marta P.","Carlos S.","Luis C.", "Susana H.", "Pedro K."};
		double [] Saldo = {250.00, 594.65, 10.50, 895.75, 1249.90, 77.50};
		int opcion, clave1, p=-1;
		float retiro;
		int a=0;
		
		do {
		System.out.println("Banco XXX");
		System.out.println("Menu Principal");
		System.out.println("1. Consulta");
		System.out.println("2. Deposito");
		System.out.println("3. Retiro");
		System.out.println("4. Salida");
		System.out.print(" Opcion: "); 
		
		opcion = teclado.nextInt();
		switch (opcion)
		{
		case 1: {System.out.println("Banco XXX");
				System.out.print("Ingrese su Clave: _ _ _ _");
				clave1 = teclado.nextInt();
				for(int i=0;i<6;i++)
				{
					if(clave1==Clave[i])
					{p=i;}}
				if(p==-1)
				{System.out.println("Usuario no Existe, Verifique!");}
				else
				{System.out.println("Gracias por Preferirnos!");
				System.out.println("Sr.(a) "+Nombre[p]+" Su Saldo es-> "+decfor.format(Saldo[p]));
				} break;}
		case 2: {System.out.println("Banco XXX");
		System.out.print("Ingrese su Clave: _ _ _ _");
		clave1=teclado.nextInt();
		for(int i=0;i<6;i++)
		{
			if(clave1==Clave[i])
			{p=i;}}
		if(p==-1)
		{System.out.println("Usuario No Existe, Verifique!");}
		else
		{System.out.println("\n");
		System.out.println("Gracias por Preferirnos!");}
		System.out.println("\n");
		System.out.println("Sr.(a) "+Nombre[p]+" Su Saldo es-> $"+decfor.format(Saldo[p]));
		System.out.print("¿Cuanto Desea Depositar?: $");
		float deposito = teclado.nextFloat();
		Saldo[p]=Saldo[p]+deposito;
		System.out.println("Su nuevo Saldo es: $"+decfor.format(Saldo[p]));
		} break;
		case 3: {System.out.println("Banco XXX");
		System.out.print("Ingrese su Clave: _ _ _ _");
		clave1=teclado.nextInt();
		for(int i=0;i<6;i++)
		{
			if(clave1==Clave[i])
			{p=i;}}
		if(p==-1)
		{System.out.println("Usuario No Existe, Verifique!");}
		else
		{System.out.println("\n");
		System.out.println("Gracias por Preferirnos!");}
		System.out.println("\n");
		System.out.println("Sr.(a) "+Nombre[p]+" Su Saldo es-> $"+decfor.format(Saldo[p]));
		do
		{
		System.out.print("¿Cuanto desea Retirar?: $");
		retiro = teclado.nextFloat();
		if(retiro>Saldo[p])
		{System.out.println("No cuenta con fondos suficientes, vuelva ha intentarlo!");}
		}while(retiro>Saldo[p]);
		
		Saldo[p]=Saldo[p]-retiro;
		System.out.println("Retiro por: $"+decfor.format(retiro));
		System.out.println("Saldo disponible: $"+decfor.format(Saldo[p]));}break;
		case 4: {System.out.println("Usted ha seleccionado Salir del Sistema");
		System.out.println("\n");
		System.out.println("		**GRACIAS POR PREFERIRNOS**		");
		System.out.println("		**Att. JUAN M. DURAN V.**		");}break;
		default: {System.out.println("Opcion No Valida, Vuelva a Intentarlo");}break;
		}
		}while(opcion !=4);
		}
	}


	
		
	
	

	
		
		
		
		
	

	
