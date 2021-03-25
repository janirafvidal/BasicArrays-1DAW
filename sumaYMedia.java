package Ejercicios31a35;


public class Ejercicio35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] notas = {6,8,2,4,10,6,7,9,2};
		
		int media;
		int sumaNotas=0;
		boolean hayDiez = false;
		
		for (int nota : notas) {
			sumaNotas += nota;
			if (nota==10) {
				hayDiez = true;
				
			}
		}
		System.out.println("El total de las notas es a :" +sumaNotas);
		
		media = sumaNotas / notas.length;
		System.out.println("La media de las notas es :" +media);
		
		
		if (hayDiez==true) {
			System.out.println("Hay un diez!!");
		}else
		System.out.println("NO hay un diez!!");
		
	}
	//for (int variabledentrofor==anArray[i] : array);

}
