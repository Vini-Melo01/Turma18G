package ExerciciosLa�osDecis�o;
import java.util.*;
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double num,numQuadrado,numRaiz;
		
		System.out.println("Digite um n�mero qualquer: ");
		num = ler.nextDouble();
		
		if(num %2 == 0) {
			numRaiz = Math.sqrt(num);
			System.out.printf("O numero � %f (par), sua raiz �: %f",num,numRaiz);
		}
		else {
		numQuadrado = Math.pow(num,2);
		System.out.printf("O numero � %f (�mpar), seu quadrado �: %f",num,numQuadrado);
		}
	}

}
