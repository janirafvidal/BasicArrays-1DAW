package Ejercicios36a40;

import java.util.Scanner;
public class Ejercicio37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = new int [10];
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		Scanner inputValue=new Scanner (System.in);
		
		System.out.println("Introduce numeros: ");
		
		for (int actual : num) {
			actual = inputValue.nextInt();
			if (actual>mayor) {
				mayor=actual;
			}
			
			if (actual<menor) {
				menor=actual;				
			}
		}
		System.out.println("El mayor es " +mayor +" y el menor es "+menor);
		inputValue.close();	
	}

}
