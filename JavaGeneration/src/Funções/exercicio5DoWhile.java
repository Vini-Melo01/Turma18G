package Fun��es;

import java.util.Scanner;

public class exercicio5DoWhile {
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int numero;
	int soma= 0;
	do {
		System.out.println("Escreva um n�mero: ");
		numero = leia.nextInt();
		soma = soma + numero;
		System.out.println("Escreva um n�mero: ");
		numero = leia.nextInt();
		soma = soma + numero;
	}while(numero!=0);
	
	System.out.printf("A soma dos n�meros � %d",soma);
	
	
	
	}

}
