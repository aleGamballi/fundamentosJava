package Operadores;

public class OperadoresTest {
    static void main(String[] args) {
        int a = 6 * (3+2);
        int b = 3 * 2;
        int a2 = (int) Math.pow(a, 2);
        int abfinal = a2 / b;
        int c = (1 - 5) * (2-7);
        int d = 2;
        int cd = c / d;
        int cdfinal = (int) Math.pow(cd, 2);
        int powfinal = (int) Math.pow(abfinal - cdfinal, 3);
        int divfinal = (int) Math.pow(10, 3);
        int finalfinal = (powfinal/ divfinal);
        System.out.println(finalfinal);
    }
}
