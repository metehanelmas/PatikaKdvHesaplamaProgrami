import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Metehan Elmas */

        double tutar, kdvOrani = 0.18 , kdvOrani2 = 0.08 ;
        Scanner input = new Scanner(System.in);

        System.out.print("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();

        double kdvTutari = tutar <= 0 ? 0 : (tutar > 0 && tutar <= 1000 ? kdvOrani: kdvOrani2  );
        System.out.println(tutar <= 0 ? "Tutar 0 dan küçük olamaz" : (tutar > 0 && tutar <= 1000 ? tutar + ( tutar * kdvOrani ): tutar+(tutar * kdvOrani2)  ));

        System.out.println("KDV'siz tutar ; " + tutar);
        System.out.print("KDV tutarı ; " + kdvTutari );





    }
}
