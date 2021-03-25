package Ejercicios36a40;

import java.util.Scanner;
public class Ejercicio36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = new int [10];
		int mayor=Integer.MIN_VALUE;
		
		Scanner inputValue=new Scanner (System.in);
		System.out.println("Introduce numero: ");
		
		for (int actual : num) {
		actual = inputValue.nextInt();
		if (actual>mayor) {
			mayor=actual;
		}
		}
		
		System.out.println("El mayor de los numeros anteriores es " +mayor);
		inputValue.close();
	}

}
