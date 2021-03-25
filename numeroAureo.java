package Ejercicios41aFin;

public class Ejercicio41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1=1;
		double num2=1;
		double suma;
		
		System.out.printf("1, 1");
		
		for (int i=3; i<40; i+=1) {
			suma=num1+num2;
			System.out.printf(", " +suma/num2);
			num1=num2;
			num2=suma;
		}
		

	}

}
