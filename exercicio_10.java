import java.util.Scanner;

public class exercicio_10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("informe um número: ");
		int number = entrada.nextInt();
		if(number > 100) {
			if(number < 200) {
				System.out.println("está entre 100 e 200");
			}
		}else {
			System.out.println("não está entre 100 e 200");
		}
		
		
		
		
		
		
		
		
		
		
	}
}
