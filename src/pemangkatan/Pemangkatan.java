/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemangkatan;

/**
 *
 * @author AdiRahmad
 */
public class Pemangkatan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pemangkatan pangkat = new Pemangkatan();
        System.out.println("Hasil Pangkatnya " +pangkat.Pangkat(3, -3));
    }

    public double Pangkat(int bilanganDasar, int bilanganPangkatnya) {
        double hasil = 1;
        if (bilanganPangkatnya < 0) {
            for (int i = 0; i > bilanganPangkatnya; i--) {
                hasil = hasil / bilanganDasar;
            }
        }

        for (int i = 1; i <= bilanganPangkatnya; i++) {
            hasil = hasil * bilanganDasar;
        }

        return hasil;
    }
}
