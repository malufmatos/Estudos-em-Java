public class aula30 {
    public static void main(String[] args) {
        int n;

        String dow = switch (n){
            case 1-> "Domingo";
            case 2-> "Segunda";
            case 3-> "Terça";
            case 4-> "Quarta";
            case 5-> "Quinta";
            case 6->"Sexta";
            case 7->"Sábado";
            default: System.out.println("Erro");
        };

        System.out.println(dow);
    }
}