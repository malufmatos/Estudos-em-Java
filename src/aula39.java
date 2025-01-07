import java.util.Scanner;

public class aula39 {

    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);
        int n =1;
        double sum = 0.0;

        while(true) {
            System.out.print("Digite a " + n + "° nota: ");

            String line = scanner.nextLine();

            if(line.equals("")){
                break;
            }

            sum += Double.parseDouble(line);
            n++;
        }

        double avg = sum/(n-1);
        System.out.println("Sua média foi: " + avg);
    }
}
