import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. BujurSangkar");
        System.out.println("2. Persegi Panjang");
        System.out.println("Isikan Pilihan");
        int pilihan = sc.nextInt();
        
        if(pilihan == 1) {
            BujurSangkar bs = new BujurSangkar(4);
            System.out.println(bs);
        }
        if(pilihan == 2) {
            PersegiPanjang bs = new PersegiPanjang(3, 4);
            System.out.println(bs);
        }
        
    }
}
