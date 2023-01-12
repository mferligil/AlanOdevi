import java.util.Scanner;

public class Alan {
    public static void main(String[] args) {
        int r;
        double pi=3.14;
        Scanner inp=new Scanner(System.in);
        System.out.println("Dairenin yarı çapını girin :");
        r=inp.nextInt();

        double alan=pi*r*r;
        double cevre=2*pi*r;

        System.out.println("Dairenin alanı  :"+alan);
        System.out.println("Dairenin cevresi  :"+cevre);

        int merkez; //merkez açısının ölçüsü
        System.out.println("Merkez açı ölçüsünü giriniz  :");
        merkez=inp.nextInt();

        double dilimalani=(pi*(r*r)*merkez)/360;
        System.out.println("Daire diliminin alanı  :"+dilimalani);



    }
}
