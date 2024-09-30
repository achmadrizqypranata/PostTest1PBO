/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1pbo;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Posttest1pbo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Sistem Manajemen Penjualan Mobil");
            System.out.println("1. Tambah Mobil");
            System.out.println("2. Hapus Mobil");
            System.out.println("3. Tampilkan Daftar Mobil");
            System.out.println("4. Buat Penjualan");
            System.out.println("5. Keluar");
            System.out.println("Pilih opsi:");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Buang sisa input

            switch (pilihan) {
                case 1:
                    ManajemenPenjualan.tambahMobil();
                    break;
                case 2:
                    ManajemenPenjualan.hapusMobil();
                    break;
                case 3:
                    ManajemenPenjualan.tampilkanDaftarMobil();
                    break;
                case 4:
                    ManajemenPenjualan.buatPenjualan();
                    break;
                case 5:
                    running = false;
                    System.out.println("Sampai Jumpa Lagi ^^.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        scanner.close();
    }
}
