package Ejercicios41aFin;

import java.util.Scanner;
public class Ejercicio43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dividendo;
		int divisor;
		
		Scanner inputValue=new Scanner (System.in);
		
		System.out.println("Introduce dividendo: ");
		dividendo=inputValue.nextInt();
		
		System.out.println("Introduce divisor: ");
		divisor=inputValue.nextInt();
		
		while (dividendo >= divisor) {
			dividendo= dividendo - divisor;
			
		} System.out.println("El resto de la division es " +dividendo);
		
		inputValue.close();
		
	}

}
