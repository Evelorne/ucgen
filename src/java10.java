import java.util.Scanner;

public class java10 {
    public static void main(String[] args) {
        double a,b;
        System.out.println("!!!!!Dik Üçgen Alan ve Hipotenüs Hesaplama Programına Hoşgeldiniz!!!!!");
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci dik kenarı giriniz (cm): ");
        a = input.nextDouble();
        Scanner inp = new Scanner(System.in);
        System.out.print("İkinci dik kenarı giriniz (cm): ");
        b = inp.nextDouble();
        double c = Math.sqrt((a*a)+(b*b));
        System.out.println("Üçgeninizin hipotenüsü "+c+" cm uzunluğundadır.");
        double u = (a+b+c)/2;
        double alan =Math.sqrt( u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgeninizin alanı "+alan+" cm² büyüklüğündedir.\nTeşekkürler");


    }
}
