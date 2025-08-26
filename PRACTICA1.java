package PRACTICA1;
import java.util.*;
public class PRACTICA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = new int[15];
		int num, contador_neg = 0;
		
		Scanner captura = new Scanner(System.in);
		
		for(int x = 0; x < numeros.length; x++) {
			System.out.println("Dame el valor: " + x);
			num = captura.nextInt();
			numeros[x] = num;
		}
		
		for(int i = 0; i < numeros.length; i ++) {
			//String n = numeros[i] %2 == 0 ? "hola" : "no";
			
			if(numeros[i] %2 == 0 && numeros[i] > 0) {
				double raiz;
				raiz = Math.sqrt(numeros[i]);
				System.out.println("La raiz cuadrada de " + numeros[i]+ " " +raiz);
			}
			
			if(numeros[i] < 0) {
				contador_neg += 1;
		}0.
	}
	}

}
