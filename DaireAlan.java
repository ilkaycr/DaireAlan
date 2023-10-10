package TemelKavramlar;

import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //pi yi tanımlıyoruz
        double pi = 3.14 , alan, cevre ,merkez;
        int r,a;

        //Kullanıcıdan dairenin yarıçapını alalım
        System.out.print("Dairenin yarıçapını giriniz : ");
        r = input.nextInt();

        // Kullanıcıdan merkez açı ölçüsünü alalım
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz : ");
        a = input.nextInt();

        //Formüller

        alan   = pi*r*r;
        cevre  = 2*pi*r;
        merkez = (pi * (r*r) * a) / 360;

        System.out.println("Alan : " + alan);
        System.out.println("Çevre : " + cevre);
        System.out.println("Merkez açısının ölçüsü : " + merkez);

    }
}
