import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um número: ");
		int number1 = entrada.nextInt();
		System.out.println("digite um número: ");
		int number2 = entrada.nextInt();
		int soma = number1 + number2;
		if(soma > 20) {
			System.out.println("o resultado é: " + (soma + 8));
		}else {
			System.out.println("o resultado é: " + (soma - 5));
		}
	}

}
