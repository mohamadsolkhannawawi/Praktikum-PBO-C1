/* 
 * Nama File    : Karyawan.java
 * Nama Pembuat : Mohamad Solkhan Nawawi
 * NIM Pembuat  : 24060123120020
 * Tanggal      : 28 Maret 2025
 * Deskripsi    : Karyawan merupakan subclass dari CivitasAkademika.
 *                Karyawan merupakan superclass untuk class Dosen dan Tendik.
 *                Karyawan memiliki atribut nip dan masaKerja;
 */

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Karyawan extends CivitasAkademika{
    // Atribut
    private String nip;
    protected int masaKerja;
    private static int counterKaryawan = 0;

    // Konstruktor
    public Karyawan(String nama, String email, String nip, int masaKerja) {
        super(nama, email);
        this.nip = nip;
        this.masaKerja = masaKerja;
        counterKaryawan++;
    }

    //Getter dan Setter
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    public static void printCounterKaryawan() {
        System.out.println("Jumlah karyawan: " + Karyawan.counterKaryawan);
    }

    // Method
    public abstract double hitungGaji();

    // Method untuk format gaji ke Rupiah
    public String formatGajiRupiah() {
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("id-ID"));
        return formatRupiah.format(hitungGaji()).replace(",00", ""); // Menghilangkan desimal
    }

    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("NIP: " + nip);
        System.out.println("Masa Kerja: " + masaKerja);
        System.out.println("Gaji: " + formatGajiRupiah());
    }
}
