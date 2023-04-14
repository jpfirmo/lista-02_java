import java.util.Scanner;

public class exercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("informe seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("informe a nota: ");
		double nota1 = entrada.nextDouble();
		System.out.println("informe a nota: ");
		double nota2 = entrada.nextDouble();
		System.out.println("informe a nota: ");
		double nota3 = entrada.nextDouble();
		double media = (nota1 + nota2 + nota3) / 3;
		if(media >= 7) {
			System.out.println(nome + "passou");
		}else if(media >= 5) {
			System.out.println(nome + "reprovado");
		}else if(media > 5.1) {
			if(media < 6.9) {
				System.out.println(nome + " recuperação");
			}
			
		}
		
	}

}
