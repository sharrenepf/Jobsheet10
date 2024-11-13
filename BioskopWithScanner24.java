import java.util.Scanner;

public class BioskopWithScanner24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // deklarasi variabel
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];
        int pilihan;

        while (true) {

            System.out.println("=== Menu Bioskop Mini ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.println("Pilih Menu :");
            System.out.print("");
            pilihan = input.nextInt();
            input.nextLine();  

            if (pilihan == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = input.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = input.nextInt();
                        if (baris < 1 || baris > 4) {
                            System.out.println("Baris tidak tersedia! Masukkan baris antara 1-4.");
                            continue;  
                        }

                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = input.nextInt();
                        if (kolom < 1 || kolom > 2) {
                            System.out.println("Kolom tidak tersedia! Masukkan kolom antara 1-2.");
                            continue;  
                        }

                        // menambahkan fungsi untuk nomer 4
                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi yang Anda pilih sudah terisi. Silakan pilih kursi lain.");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            break;  
                        }
                    }
                    input.nextLine();  

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = input.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;  
                    }
                }
            } else if (pilihan == 2) {

                System.out.println("========== Daftar Penonton ==========");
                System.out.println("Kolom 1          Kolom 2"); 
                System.out.println("====================================");
                System.out.println("                Layar               ");
                System.out.println("====================================");
                System.out.println("");

                for (int i = 0; i < 4; i++) {
                    String kursi1 = (penonton[i][0] != null) ? penonton[i][0] : "***";
                    String kursi2 = (penonton[i][1] != null) ? penonton[i][1] : "***";
                    System.out.println(" " + kursi1 + "            " + kursi2);
                }
                System.out.println("====================================");
            } else if (pilihan == 3) {

                System.out.println("Keluar dari program...");
                input.close();
                break;
            } else {

                System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
    }
}
