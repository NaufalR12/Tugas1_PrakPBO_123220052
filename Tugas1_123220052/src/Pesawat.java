/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Pesawat extends Kendaraan implements BergerakDiUdara {

    public Pesawat(String nama) {
        super(nama);
    }
    
    @Override
    public void bergerak() {
        if (bahanBakar < 30) {
            System.out.println(nama + " kehabisan bahan bakar!");
        } else {
            lepasLandas();
            bahanBakar -= 45;
        }
    }

    @Override
    public void lepasLandas() {
        kecepatan += 500;
        System.out.println(nama + " lepas landas!");
    }

    @Override
    public void mendarat() {
        kecepatan -= 20;
        if (kecepatan < 0) {
            kecepatan = 0;
            System.out.println(nama + " sudah mendarat!");
        } else {
            System.out.println(nama + " sedang mendarat!");
        }
    }

    @Override
    public void terbang() {
        System.out.println(nama + " sedang terbang dengan kecepatan " + kecepatan + " km/jam!");
    }
}

