/* 
 * Nama File    : Universitas.java
 * Nama Pembuat : Mohamad Solkhan Nawawi
 * NIM Pembuat  : 24060123120020
 * Tanggal      : 28 Maret 2025
 * Deskripsi    : Universitas merupakan class yang mewadahi seluruh 
 *                fakultas dan civitas akademika.
 */

import java.util.ArrayList;
import java.util.List;

public class Universitas {
    private String nama;
    private List<Fakultas> listFakultas;
 
    public Universitas(String nama) {
        this.nama = nama;
        listFakultas = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public List<Fakultas> getListFakultas() {
        return listFakultas;
    }

    public void setListFakultas(ArrayList<Fakultas> listFakultas) {
        this.listFakultas = listFakultas;
    }
 
    public void tambahFakultas(Fakultas fakultas) {
        this.listFakultas.add(fakultas);
    }
 
    public void tampilkanInfo() {
        System.out.println("Nama Universitas " + nama);
        System.out.println("Daftar Fakultas:");
        for (Fakultas fakultas : listFakultas) {
            fakultas.tampilkanInfo();
        }
    }
}