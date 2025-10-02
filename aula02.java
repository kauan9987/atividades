import java.util.Scanner;

public class aula02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a temperatura em Celsius (°C): ");
        double celsius = scanner.nextDouble();

        // Conversões
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        // Saída formatada
        System.out.println("\n=== Conversão de Temperatura ===");
        System.out.println("Temperatura em Celsius: " + celsius);
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        System.out.println("Temperatura em Kelvin: " + kelvin );

        scanner.close();
    }
}
