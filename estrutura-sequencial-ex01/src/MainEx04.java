import java.util.Locale;
import java.util.Scanner;

public class MainEx04 {

	public static void main(String[] args) {

			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			// Entrada dos dados do funcionário
			int numero, horas;
			double valorHora, salario;
			
			numero = sc.nextInt();
			horas = sc.nextInt();
			valorHora = sc.nextDouble();
			
			// Calcula o salário
			salario = valorHora * horas;
			
	        // Exibe o número do funcionário e o salário com duas casas decimais
			System.out.println("Number = " + numero);
			System.out.printf("Salary = U$ %.2f%n", salario);
			
			sc.close();

	}

}
