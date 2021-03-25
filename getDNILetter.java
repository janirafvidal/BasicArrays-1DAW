package Ejercicios31a35;

import java.util.Scanner;
public class Ejercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char [] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
				'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 
				'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
		int dni;
		int resto;
		
		Scanner inputValue=new Scanner (System.in);
		
		System.out.println("Introduce tu DNI sin la letra :");
		dni = inputValue.nextInt();
		
		resto = dni%23;
		
		System.out.println("La letra de tu DNI es : " +letras[resto]);
		
		inputValue.close();
	}

}
