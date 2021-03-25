package Ejercicios41aFin;
/**
 * 
 * @author Jan Vidal
 *
 */
import java.util.Scanner;
public class Ejercicio45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int decimal;
		String binario="";
		int resto;
		
		System.out.println("Introduce un numero decimal menor que 255:");
		
		Scanner inputValue=new Scanner (System.in);
		decimal=inputValue.nextInt();
		
		if (decimal<255) {
			while (decimal>0) {
				if (decimal%2==0) {
					binario="0"+binario;
				}else {
					binario="1"+binario;
				}
				decimal=decimal/2;
			}
			
			System.out.println("El numero decimal es " +binario +" en binario.");
			
		}else System.out.println("Numero incorrecto");
		
		
		
		inputValue.close();
	}

}
