//import javax.swing.*;
public class Uso_Arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] paises=new String[8];
		
		/*paises[0]="España";
		paises[1]="México";
		paises[2]="Colombia";
		paises[3]="Perú";
		paises[4]="Chile";
		paises[5]="Argentina";
		paises[6]="Panama";
		paises[7]="Venezuela";*/
		
		//String [] paises = {"España", "México", "Colombia", "Perú", "Chile", "Argentina", "Ecuador", "Venezuela"};
		
		/*for(int i=0; i<paises.length;i++) {
			
			System.out.println("País " + (i+1) + " " + paises[i]);
			
			
		}*/
		
		/*for(int i=0;i<8;i++) {
			
			paises[i]=JOptionPane.showInputDialog("Introduce país " + (i+1));
			
		}
		
		int i= 0;
		for(String elemento: paises) {
		
			System.out.println("País: " + (i += 1) + " " + elemento);
		}*/
		
		int[] matriz_aleatorios=new int[150];
		
		for (int i=0; i<matriz_aleatorios.length;i++) {
			
			matriz_aleatorios[i]=(int)Math.round(Math.random()*100);
			
			
		}
		
		for(int numeros: matriz_aleatorios) {
			
			System.out.print(numeros + " ");
			
		}

	}

}
