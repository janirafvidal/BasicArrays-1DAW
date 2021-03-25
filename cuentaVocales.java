package Ejercicios36a40;

import java.util.Scanner;
public class Ejercicio38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total=0;
		char[] vocales = {'a','e','i','o','u','A','E','I','O','U'};
		String frase;
		
		System.out.println("Introduce una frase: ");
		
		Scanner inputValue=new Scanner (System.in);
		frase = inputValue.nextLine();
		//frase.toLowerCase();
		
		for(int i=0; i<frase.length(); i++) {
			for(char vocal : vocales) {
			if (frase.charAt(i) == vocal) { 
				 total++;
			}
			  }
			}
		System.out.println("En total hay " +total +" vocales");
		inputValue.close();
	}

}
