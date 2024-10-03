import java.util.Scanner;

public class aula20 {

    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = Double.parseDouble(scanner.nextLine()) ;
        System.out.print("Digite a segunda nota: ");
        double nota2 = Double.parseDouble(scanner.nextLine()) ;
        System.out.print("Digite a terceira nota: ");
        double nota3 = Double.parseDouble(scanner.nextLine()) ;

        double mediaFinal = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média final é: " + mediaFinal);
    }
}
