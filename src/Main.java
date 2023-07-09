import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*int n,k;
        Scanner scan = new Scanner(System.in);
        System.out.println("üssü alınacak sayı: ");
        n = scan.nextInt();
        System.out.println("üs olacak sayı: ");
        k= scan.nextInt();
        int total=0;
        int i=1;
        while (i <=k){
            total*=n;
            i++;
        }
        System.out.println("cevap: "+total);
        */

        int n,k;
        Scanner scan = new Scanner(System.in);
        System.out.println("üssü alınacak sayı: ");
        n = scan.nextInt();
        System.out.println("üs olacak sayı: ");
        k= scan.nextInt();
        int total=1;
        for (int i=1; i<=k;i++){
            total*=n;

        }
        System.out.println("cevap: "+total);

    }
}