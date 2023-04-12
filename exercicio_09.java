import java.util.Scanner;

public class exercicio_09 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		System.out.println("informe seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("informe o sexo: ");
		String sexo = entrada.nextLine();
		System.out.println("digite sua altura: ");
		double altura = entrada.nextDouble();
		double pesoidealhomem = (72.7 * altura)- 58;
		double pesoidealmulher = (62.1 * altura)- 44.7;
		if(sexo.equalsIgnoreCase("masculino")) {
			System.out.println("seu peso deve ser: " + pesoidealhomem);
		}else if(sexo.equalsIgnoreCase("feminino")) {
			System.out.println("seu peso deve ser: " + pesoidealmulher);
		}
		entrada.close();
	}

}
