/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public abstract class Kendaraan {
    protected String nama;
    protected int kecepatan;
    protected int bahanBakar;

    public Kendaraan(String nama) {
        this.nama = nama;
        this.kecepatan = 0;
        this.bahanBakar = 100; 
    }

    public abstract void bergerak();

    public void berhenti() {
        kecepatan = 0;
        System.out.println(nama + " berhenti!");
    }

    public void isiBahanBakar(int jumlah) {
        bahanBakar += jumlah;
        if (bahanBakar > 100) {
            bahanBakar = 100;
            System.out.println(nama + " bahan bakar penuh!");
        } else {
            System.out.println(nama + " bahan bakar terisi " + bahanBakar + ".");
        }
    }

    public String getNama() {
        return nama;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public int getBahanBakar() {
        return bahanBakar;
    }
}

