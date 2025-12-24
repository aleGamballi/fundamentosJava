package math.machine.math;

import java.util.Scanner;


public class machine {
    static void main(String[] args) {
        Scanner mathMachine = new Scanner(System.in);

        System.out.print("Digite o primeiro número da sua conta: ");
        double entrada1 = mathMachine.nextDouble();

        System.out.print("Digite o segundo número da sua conta: ");
        double entrada2 = mathMachine.nextDouble();

        System.out.print("Digite a operação que deseja realizar: + ; - ; * ; / ; % : ");
        String operation = mathMachine.next();

        double resultado = "+".equals(operation) ? entrada1 + entrada2 : 0; resultado = "-".equals(operation) ?
                entrada1 - entrada2 : resultado; resultado = "*".equals(operation) ? entrada1 * entrada2 : resultado;
                resultado = "/".equals(operation) ? entrada1 / entrada2 : resultado; resultado = "%".equals(operation)
                ? entrada1 % entrada2 : resultado;

        System.out.print("O resultado da sua operação é: " + resultado);



        mathMachine.close();
    }
}
