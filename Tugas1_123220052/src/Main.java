/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Main {

    public static void main(String[] args) {
        Mobil mobil = new Mobil("Avanza");
        mobil.bergerak();
        mobil.isiBahanBakar(20);
        mobil.bergerak();
        mobil.rem();
        mobil.rem();
        mobil.rem();
        System.out.println();

        SepedaMotor motor = new SepedaMotor("Beat");
        motor.bergerak();
        motor.isiBahanBakar(10);
        motor.bergerak();
        motor.gas();
        motor.gas();
        motor.rem();
        motor.berhenti();
        System.out.println();

        Kapal kapal = new Kapal("KM Pelni Jaya Kusuma");
        kapal.bahanBakar -= 50; 
        kapal.isiBahanBakar(30);
        kapal.bergerak();
        kapal.isiBahanBakar(30);
        kapal.bergerak();
        kapal.berlabuh();
        System.out.println();

        Pesawat pesawat = new Pesawat("Garuda Indonesia");
        pesawat.isiBahanBakar(10);
        pesawat.bergerak();
        pesawat.terbang();
        pesawat.mendarat();
        pesawat.kecepatan = 0;
        pesawat.mendarat();
        pesawat.isiBahanBakar(10);
        pesawat.bergerak();
        pesawat.bahanBakar -= 26; 
        pesawat.bergerak();
        
        
    }
}
