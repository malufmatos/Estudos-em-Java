public class aula23 {

    public static void main(String[] args) {

        int a = 2;
        int b = 3 + a++;
        System.out.println(b); // 5

        int c = 3 + ++a;
        System.out.println(c); //6
    }
}
