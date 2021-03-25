package Ejercicios41aFin;

import java.util.Scanner;
public class Ejercicio42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		int mult;
		
		Scanner inputValue=new Scanner (System.in);
		
		System.out.println("Introduce el primer numero :");
		num1=inputValue.nextInt();
		
		System.out.println("Introduce el segundo numero :");
		num2=inputValue.nextInt();
		
		mult=num1;
		
		for (int i=1; i<num2; i+=1) {
			mult+=num1;
		}
		
		System.out.println("El resultado de la multiplicacion es " +mult);
		inputValue.close();
	}

}
