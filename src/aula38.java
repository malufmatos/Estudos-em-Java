public class aula38 {

    public static void main(String[] args){

        int soma = 0;
        for (int i= 0; i<=100; i++){
            soma += i % 2 == 0 ? i : 0;
        }
        System.out.println(soma);
    }
}
