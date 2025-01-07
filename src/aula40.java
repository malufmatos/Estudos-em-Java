public class aula40 {

    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        System.out.print("Digite um numero entre 1 e 10: ");
        int numero = Integer.parseInt(scanner.nextLine());

        if(numero <1 || numero > 10){
            System.out.println("Não está dentro do intervalo permitido");
        } else{
            for (int i = 1; i<= 10; i++){
                System.out.println("1 x " + numero + " = " + (i * numero));
            }
        }
    }
}
