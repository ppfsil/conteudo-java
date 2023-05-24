package aula1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
						
		float salario , abono , novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu salario: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("Seu novo salario é: %.2f" , novoSalario);
		
		
	}

}
