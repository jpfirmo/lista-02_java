import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		System.out.println("digite um número: ");
		int number = entrada.nextInt();
		if(number % 2 == 0) {
			System.out.println(number + " é par");
		}else {
			System.out.println(number + " é impar");
		}
		
		
		
		
		
	}

}
