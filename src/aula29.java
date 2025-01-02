public class aula29 {
    public static void main(String[] args) {
        int vel_perm = 80;
        int vel_considerada;
        int vel_veiculo = 100;


        if(vel_perm < 100){
            vel_considerada = vel_veiculo+ 7;
        } else{
            vel_considerada = vel_veiculo + (int) (0.1*vel_veiculo);
        }

        int multa = (vel_considerada - vel_perm) * 10;
        System.out.println("Multa: " + multa);
    }
}
