/* 
 * Nama File    : Tendik.java
 * Nama Pembuat : Mohamad Solkhan Nawawi
 * NIM Pembuat  : 24060123120020
 * Tanggal      : 28 Maret 2025
 * Deskripsi    : Tendik merupakan subclass dari Karyawan.
 *                Tendik memiliki atribut static yaitu gajiPokok 4000000.
 */

public class Tendik extends Karyawan{
    // Atribut
    private static final double gajiPokok = 4000000;
    private static int counterTendik = 0;

    // Konstruktor
    public Tendik(String nama, String email, String nip, int masaKerja) {
        super(nama, email, nip, masaKerja);
        counterTendik++;
    }

    // Getter dan Setter
    public static void printCounterTendik() {
        System.out.println("Jumlah tendik: " + counterTendik);
    }

    public static double getGajiPokok() {
        return gajiPokok;
    }

    // Method
    @Override
    public double hitungGaji() {
        return gajiPokok + (masaKerja * 0.01 * gajiPokok);
    }

    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
    }
    
}
