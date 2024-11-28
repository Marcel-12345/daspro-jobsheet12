import java.util.Scanner;
public class PenjumlahanRekursif{
    static int penjumlahan(int n){
        if (n == 0) {
            return (0);
        } else {
            return (n + penjumlahan(n - 1));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan: ");
        int bilangan = sc.nextInt();
        System.out.println(penjumlahan(bilangan));
    }
}