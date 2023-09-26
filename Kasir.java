package Modul_1;
import java.util.Scanner;

public class praktek {
    public static void main(String[] args) {
        Scanner inputuser = new Scanner(System.in);
        
        System.out.println("======= Selamat Datang di alfaindo =====");
        System.out.print("Banyak Pembelian Barang: ");
                
        int jumlahbarang = inputuser.nextInt();
        System.out.println("=========================================");

        if (jumlahbarang < 0) {
            System.out.println("ERROR - Inputan harus lebih dari 0");
        } else {
            int cashback = 0, tambahanbarang = 0;

            if (jumlahbarang >= 3) {
                tambahanbarang = jumlahbarang / 3;
            }if (jumlahbarang >= 7) {
                cashback = 5500 * (jumlahbarang / 7);
            }

            int total_barang = jumlahbarang + tambahanbarang;

            System.out.println("Cashback: " + (cashback > 0 ? "Rp" + cashback : "-"));
            System.out.println("Tambahan Barang: " + tambahanbarang);
            System.out.println("Jumlah Barang: " + total_barang);
            System.out.println("====================================================");
        }
    }
    
}
