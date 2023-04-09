import java.util.Scanner;

public class exercicio_07 {
public static void main(String[] args) {
	//considerando que o cliente vai encher o tanque todo.
	
	Scanner entrada = new Scanner (System.in);
	System.out.println("informe o tipo de combustivel: ");
	String fuel = entrada.nextLine();
	System.out.println("informe a capacidade do tanque: ");
	double tanque = entrada.nextDouble();
	double calculogasoline = 3.79 * tanque;
	double calculoalcohol = 2.90 * tanque;
	if(fuel.equalsIgnoreCase("gasolina")) {
		System.out.println("valor é: " + calculogasoline + "R$");
	}else if(fuel.equalsIgnoreCase("alcool")) {
		System.out.println("valor é: " + calculoalcohol + "R$");
	}
	
	entrada.close();
	
	
	
	
}
}
