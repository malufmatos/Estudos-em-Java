public class aula21 {

    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahr = Double.parseDouble(scanner.nextLine());

        double convCelsius = ((fahr - 32) / 9) * 5;

        System.out.println("A temperatura em Celsius é: " + convCelsius);
    }
}
