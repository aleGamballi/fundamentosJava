package fundamentos;

public class tipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal!".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toLowerCase());
		System.out.println(s.endsWith("tarde"));
		System.err.println(s.length());
		System.out.println(s.equalsIgnoreCase(s));
	}
}
