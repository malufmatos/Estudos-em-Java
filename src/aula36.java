public class aula36 {

    public static void main(String[] args) {

        for(int i = 0; i<200; i++){
            if (i % 2 ==0){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("FIM");
    }
}