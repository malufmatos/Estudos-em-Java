public class aula25 {
    public static void main(String[] args) {
        int month = 5;
        int days = 0;

        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                days = 31;
                break;

            case 2:
                days = 28;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                System.out.println(1);
                break;

            default:
                System.out.println("Inválido");
        }

        System.out.println(days + " dias");
    }
}
