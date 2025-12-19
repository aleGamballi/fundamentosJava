package fundamentos;

import java.util.Scanner;

public class console {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite seu nome:");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome:");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua nacionalidade:");
		String nacionalidade = entrada.nextLine();
		
		System.out.print("Digite sua profissao :");
		String profissao = entrada.nextLine();
		
		System.out.print("Digite seu idade:");
		int idade = entrada.nextInt();
		
		System.out.printf("\n%s %s é %s, trabalha como %s e tem %d anos",
				nome, sobrenome, nacionalidade, profissao, idade);
		
		entrada.close();		
	}
}
