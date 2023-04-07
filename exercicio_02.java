import java.util.Scanner;

public class exercicio_02 {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("digite um número: ");
	int number1 = entrada.nextInt();
	System.out.println("digite um número: ");
	int number2 = entrada.nextInt();
	if(number1 > number2) {
		System.out.println(number1 + " é maior que " + number2);
	}else if(number2 > number1) {
		System.out.println(number2 + " é maior que " + number1);
	}else {
		System.out.println(number1 + " é igual a " + number2);
	}
	
	
	
}
}
