import java.util.Scanner;

public class diskon {

    public static void main(String[] args) {
        

        double bukuTulis, pensil, penghapus, penggaris;
        bukuTulis=2500;
        pensil=1000;
        penghapus=1500;
        penggaris=1000;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah beli buku tulis: ");
        double jumlahBuku= input.nextDouble();
        double total= jumlahBuku*bukuTulis;
        System.out.println("Masukkan jumlah beli pensil: ");
        double jumlahPensil= input.nextDouble();
        System.out.println("Masukkan jumlah beli penghapus: ");
        double jumlahPenghapus= input.nextDouble();
        System.out.println("Masukkan jumlah beli penggaris: ");
        double jumlahPenggarisi= input.nextDouble();
        System.out.println("Masukkan Pembayaran: ");
        double bayar=input.nextDouble();
        double diskon=0.05*total;
        double kembali=bayar-(total-diskon);
        System.out.println("Total diskon: "+ diskon);
        System.out.println("Total kembalian: "+ kembali);
    }
    
}