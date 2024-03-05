/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Mobil extends Kendaraan implements BergerakDiDarat {

    public Mobil(String nama) {
        super(nama);
    }

    @Override
    public void bergerak() {
        if (bahanBakar < 10) {
            System.out.println(nama + " kehabisan bahan bakar!");
        } else {
            gas();
            bahanBakar -= 5;
        }
    }

    @Override
    public void gas() {
        kecepatan += 10;
        System.out.println(nama + " melaju dengan kecepatan " + kecepatan + " km/jam!");
    }

    @Override
    public void rem() {
        kecepatan -= 10;
        if (kecepatan < 0) {
            kecepatan = 0;
            System.out.println(nama + " sudah berhenti total");
        } else {
            System.out.println(nama + " melakukan pengereman dengan kecepatan sekarang " + kecepatan + " km/jam!");
        }
    }
}

