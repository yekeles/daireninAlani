import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi , r , alfa , alan ;
        pi = 3.14;
        System.out.print(" Dairenin yarıçapını cm cinsinden giriniz = ");
        r = input.nextDouble();
        System.out.print(" Daire diliniminin açısını derece giriniz = ");
        alfa = input.nextDouble();

        System.out.print( r);
        System.out.print( " yarıçaplı ve " + alfa + " derece açıya sahip daire diliminin alanı ");

        alan = (((pi * ( r * r)) * alfa)/360);
        System.out.println( alan + " cm^2" );

    }
}