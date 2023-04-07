import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("digite seu sálario bruto: ");
		double salariobruto = entrada.nextDouble();
		double valorprestacao = salariobruto * 0.30;
		System.out.println("insira o valor da prestação: ");
		double prestacao = entrada.nextDouble();
		if(prestacao >= valorprestacao) {
			System.out.println("emprestimo negado");
		}else if(prestacao < valorprestacao) {
			System.out.println("emprestimo concedido");
		}
	}

}
