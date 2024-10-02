public class aula9 {

    public static void main(String[] args) {

        double d = 240.56;
        int i = (int)d;
        System.out.println(d); //240.56
        System.out.println(i); //240

        long l = 300000000000000000l;
        int i2 = (int)l;
        System.out.println(l); //300000000000000000
        System.out.println(i2); //413007872 (?)

        long l2 = 10l;
        int i3 = (int)l2;
        System.out.println(l2); //10
        System.out.println(i3); //10
    }
}
