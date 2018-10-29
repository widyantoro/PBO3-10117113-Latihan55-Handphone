/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan55.handphone;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program untuk menampilkan sebuah spesifikas beberapa handphone,
 *            yang berisi pembuat, os, model, harga, dan pin.
 */
public class PBO310117113Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Android android = new Android("Samsung", "Android", "Grand", 3000000);
        android.displayProduct();
        android.setKeyStore("234ibfd3840fo");
        System.out.println("Andriod Key Store : " + android.getKeyStore()+"\n");

        BlackBerry bb = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        bb.displayProduct();
        bb.setPinBB("BHS249");
        System.out.println("PIN : " + bb.getPinBB()+"\n");

        WindowsPhone wp = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        wp.displayProduct();
        wp.setWpKeyStore("UUUQIJWORJ");
        System.out.println("WP Key Store : " + wp.getWpKeyStore());
    }
}
