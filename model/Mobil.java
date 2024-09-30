/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author ACER
 */
public class Mobil {
    private String merk;
    private String model;
    private double harga;

    public Mobil(String merk, String model, double harga) {
        this.merk = merk;
        this.model = model;
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    public double getHarga() {
        return harga;
    }

    public void tampilkanDetailMobil() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        System.out.println("Merk: " + merk + ", Model: " + model + ", Harga: " + formatter.format(harga));
    }
}
