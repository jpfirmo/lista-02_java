import java.util.Scanner;

public class exercicio_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		System.out.println("informe o peso da pesca em kg: ");
		double pesca = entrada.nextDouble();
		double pesoexcedente = pesca * 4;
		if(pesca > 50) {
			System.out.println("sujeito a multa");
			System.out.println("valor da multa: " + pesoexcedente + "R$");
		}else if(pesca <= 50) {
			System.out.println("tudo ok ");
		}
		
		
		
		
		
		
		
		
	}

}
