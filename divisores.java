package Ejercicios36a40;

import java.util.Scanner;
public class Ejercicio39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		System.out.println("Introduce numero :");
		
		Scanner inputValue=new Scanner (System.in);
		num=inputValue.nextInt();
		
		for (int i=1; i<=num; i++) {
			if (num%i==0) {
				System.out.println(i +" es divisor de " +num);
			}
		inputValue.close();
		}
		
	}

}
