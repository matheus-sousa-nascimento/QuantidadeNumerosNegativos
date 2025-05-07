/*
 * QNegativos.java
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class QNegativos {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		//Matheus de sousa do nascimento
		
		int num;
		int neg =0;
		
		for(int x = 1; x<=10; x++){
			System.out.print("Digite um numero: ");
			num = entrada.nextInt();
			
			if(num < 0){
				neg += 1;
			}
				
		}
		System.out.print("A quantidade de numero negativos e "+ neg);
	}
}

