package Ejercicios41aFin;
/**
 * 
 * @author Jan Vidal
 *
 */
import java.util.Scanner;
public class Ejercicio44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String binario;
		int decimal=0;
		
		System.out.println("Introduce un numero binario: ");
		
		Scanner inputValue=new Scanner (System.in);
		binario=inputValue.next();
		
		
		for (int i=binario.length()-1; i>=0; i--) {
			if (binario.charAt(i)=='1') {
				
				decimal+=Math.pow(2,binario.length()-i-1);
			}
		}
	
	
		System.out.println("El numero binario " +binario +" es " +decimal +" en decimal.");
		inputValue.close();
	}

}
