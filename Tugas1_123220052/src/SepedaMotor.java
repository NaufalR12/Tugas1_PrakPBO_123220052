/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class SepedaMotor extends Kendaraan implements BergerakDiDarat {

    public SepedaMotor(String nama) {
        super(nama);
    }

    @Override
    public void bergerak() {
        if (bahanBakar < 5) {
            System.out.println(nama + " kehabisan bahan bakar!");
        } else {
            gas();
            bahanBakar -= 3;
        }
    }

    @Override
    public void gas() {
        kecepatan += 10;
        System.out.println(nama + " melaju dengan kecepatan " + kecepatan + " km/jam!");
    }

    @Override
    public void rem() {
        kecepatan -= 3;
        if (kecepatan < 0) {
            kecepatan = 0;
            System.out.println(nama + " sudah berhenti total");
        } else {
            System.out.println(nama + " melakukan pengereman dengan kecepatan sekarang " + kecepatan + " km/jam!");
        }
    }
}

