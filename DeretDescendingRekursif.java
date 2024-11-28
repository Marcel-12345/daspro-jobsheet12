import java.util.Scanner;
public class DeretDescendingRekursif {
    static void angka(int x) {
        if (x < 0) {
            return;
        } else {
            System.out.print(x + " ");
            angka(x - 1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan: ");
        int bilangan = sc.nextInt();
        angka(bilangan);
    }
}