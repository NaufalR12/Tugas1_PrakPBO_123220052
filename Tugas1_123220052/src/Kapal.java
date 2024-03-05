/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Kapal extends Kendaraan implements BergerakDiAir {

    public Kapal(String nama) {
        super(nama);
    }

    @Override
    public void bergerak() {
        if (bahanBakar < 15) {
            System.out.println(nama + " kehabisan bahan bakar!");
        } else {
            berlayar();
            bahanBakar -= 40;
        }
    }

    @Override
    public void berlayar() {
        kecepatan += 20;
        System.out.println(nama + " berlayar dengan kecepatan " + kecepatan + " knot/jam!");
    }

    @Override
    public void berlabuh() {
        kecepatan = 0;
        System.out.println(nama + " berlabuh!");
    }
}
