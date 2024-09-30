/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posttest1pbo;

import model.Mobil;
import model.Mobil;
import model.Penjualan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class ManajemenPenjualan {
    private static ArrayList<Mobil> daftarMobil = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void tambahMobil() {
        System.out.println("Masukkan merk mobil:");
        String merk = scanner.nextLine();
        System.out.println("Masukkan model mobil:");
        String model = scanner.nextLine();
        System.out.println("Masukkan harga mobil:");
        double harga = scanner.nextDouble();
        scanner.nextLine(); // Buang sisa input

        Mobil mobil = new Mobil(merk, model, harga);
        daftarMobil.add(mobil);
        System.out.println("Mobil berhasil ditambahkan!");
    }

    public static void hapusMobil() {
        System.out.println("Masukkan nomor urut mobil yang ingin dihapus:");
        tampilkanDaftarMobil();
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // Buang sisa input

        if (index >= 0 && index < daftarMobil.size()) {
            daftarMobil.remove(index);
            System.out.println("Mobil berhasil dihapus!");
        } else {
            System.out.println("Nomor tidak valid!");
        }
    }

    public static void tampilkanDaftarMobil() {
        System.out.println("Daftar Mobil:");
        for (int i = 0; i < daftarMobil.size(); i++) {
            System.out.print((i + 1) + ". ");
            daftarMobil.get(i).tampilkanDetailMobil();
        }
    }

    public static void buatPenjualan() {
        System.out.println("Masukkan nama pembeli:");
        String namaPembeli = scanner.nextLine();

        Penjualan penjualan = new Penjualan(namaPembeli);

        boolean membeli = true;
        while (membeli) {
            tampilkanDaftarMobil();
            System.out.println("Masukkan nomor urut mobil yang ingin dibeli (0 untuk selesai):");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Buang sisa input

            if (pilihan == 0) {
                membeli = false;
            } else if (pilihan > 0 && pilihan <= daftarMobil.size()) {
                Mobil mobil = daftarMobil.get(pilihan - 1);
                penjualan.tambahkanMobil(mobil);
                System.out.println("Mobil berhasil ditambahkan ke pesanan.");
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        System.out.println("Penjualan berhasil dibuat!");
        penjualan.tampilkanPenjualan();
    }
}
