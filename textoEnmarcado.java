package Ejercicios41aFin;

import java.util.Scanner;
public class Ejercicio47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] cadenas = new String [5];
		int max=0;
		
		System.out.println("Introduce 5 cadenas de texto :");
		Scanner inputValue=new Scanner (System.in);
		
		for (int i=0; i<cadenas.length; i++) {
			cadenas[i]=inputValue.nextLine();
			
			if (cadenas[i].length()>max) {
				max=cadenas[i].length();
			}
			}
		
		
		for (int i=0; i<(max+4); i++) {
			System.out.print("*");
		}
		
		
		System.out.println();
		
		
		for (String actual:cadenas) {
			while (actual.length()<max) {
				actual = actual + " ";
				
			}
			
			System.out.println("* " +actual +" *");
		}
		
		
		
		for (int i=0; i<(max+4); i++) {
			System.out.print("*");
		}
		
		
		
		inputValue.close();
	}

}
