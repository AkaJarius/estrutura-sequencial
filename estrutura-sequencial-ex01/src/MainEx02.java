import java.util.Locale;
import java.util.Scanner;

public class MainEx02 {
    public static void main(String[] args) {
    	
    	Locale.setDefault(Locale.US);
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);
        
        // Define o valor de Pi
        final double PI = 3.14159;
        
        // Lê o valor do raio
        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();
        
        // Calcula a área do círculo
        double area = PI * Math.pow(raio, 2);
        
        // Exibe a área com 4 casas decimais
        System.out.printf("A área do círculo é: %.4f%n", area);
        
        // Fecha o objeto Scanner
        sc.close();
    }
}