//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


class ConversorTemperatura {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius (°C): ");
        double celsius = scanner.nextDouble();

        // Calcula a temperatura em Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Calcula a temperatura em Kelvin
        double kelvin = celsius + 273.15;

        // Exibe os resultados formatados
        System.out.println("\nResultados:");
        System.out.printf("Temperatura em Celsius: %.2f °C\n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f °F\n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K\n", kelvin);

        // Fecha o scanner
        scanner.close();
    }
}
