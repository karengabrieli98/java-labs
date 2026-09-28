package curso_programaçao;

import java.util.Scanner;

public class estrutura_repetitiva02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int soma = 0; // para cada idade que digitar essa idade vai ser acumlado na soma
		int cont = 0;
		
		while ( idade >= 0) { 
			soma = soma + idade; // acumular a soma das idades 
			cont = cont +1; // contar a quantidade de idade que nao são somas negativas 
			idade = sc.nextInt();
		}
		
		if (cont > 0) {
		   double media = (double)soma / cont; // (double) garante que o resultado nao vai ser truncado 
		   System.out.printf("%.2f%n",  media); //%.2f → mostra o número com 2 casas decimais / %n → quebra de linha independente do sistema operacional.
		}
		
		else {
			System.out.println("Impossivel calcular");
		}
		sc.close();
	}
}
