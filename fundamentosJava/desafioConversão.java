package fundamentos;

import java.util.Scanner;

public class desafioConversão {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite seu sálario de Janeiro: ");
		String valor1 = entrada.next().replace(",", ".");
		System.out.print("Digite seu sálario de Fevereiro: ");
		String valor2 = entrada.next().replace(",", ".");
		System.out.print("Digite seu sálario de Março: ");
		String valor3 = entrada.next().replace(",", ".");

		double salarioJan = Double.parseDouble(valor1);
		double salarioFev = Double.parseDouble(valor2);
		double salarioMar = Double.parseDouble(valor3);
		double media = (salarioJan + salarioFev + salarioMar) / 3;

		System.out.print("Sua média sálarial nesse primeiro trimestre de 2025 foi de: R$" + media);

		entrada.close();

	}
}
