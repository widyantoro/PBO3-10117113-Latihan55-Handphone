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
public class WindowsPhone extends Handphone {
    private String wpKeyStore;

    public WindowsPhone(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }
 
    public String getWpKeyStore() {
        return wpKeyStore;
    }

    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
    }
    
}
