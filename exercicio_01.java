import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("digite sua idade: ");
		int idade = entrada.nextInt();
		
		if(idade >= 18) {
			System.out.println(nome + " vc é maior de idade");
		}else {
			System.out.println(nome + " vc é menor de idade");
		}
		
		
		
		
		
		
	}

}
