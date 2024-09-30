/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Mobil;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Penjualan {
    private String namaPembeli;
    private ArrayList<Mobil> daftarMobil;
    private double totalPembayaran;

    public Penjualan(String namaPembeli) {
        this.namaPembeli = namaPembeli;
        this.daftarMobil = new ArrayList<>();
        this.totalPembayaran = 0;
    }

    public void tambahkanMobil(Mobil mobil) {
        daftarMobil.add(mobil);
        totalPembayaran += mobil.getHarga();
    }

    public void tampilkanPenjualan() {
        System.out.println("Nama Pembeli: " + namaPembeli);
        System.out.println("Mobil yang dibeli:");
        for (Mobil mobil : daftarMobil) {
            mobil.tampilkanDetailMobil();
        }
        System.out.println("Total Pembayaran: Rp" + totalPembayaran);
    }

    public double getTotalPembayaran() {
        return totalPembayaran;
    }
}
