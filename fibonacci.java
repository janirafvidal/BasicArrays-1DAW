package Ejercicios36a40;

public class Ejercicio40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=1;
		int num2=1;
		int suma;
		
		System.out.printf("1, 1");
		
		for (int i=3; i<40; i+=1) {
			suma=num1+num2;
			System.out.printf(", " +suma);
			num1=num2;
			num2=suma;
		}
		
	}

}
