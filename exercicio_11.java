import java.util.Scanner;

public class exercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		System.out.println("digite um número: ");
		int number1 = entrada.nextInt();
		System.out.println("digite um número: ");
		int number2 = entrada.nextInt();
		if(number1 == number2) {
			System.out.println("são iguais");
		}else if(number1 != number2){
			if(number1 > number2) {
				System.out.println(number1 + " é maior que " + number2);
			}
		}else if(number1 < number2) {
				System.out.println(number2 + " é maior que " + number1);
			}
		
		
		
		
		
		
		
	}

}
