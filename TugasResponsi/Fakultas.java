/* 
 * Nama File    : Fakultas.java
 * Nama Pembuat : Mohamad Solkhan Nawawi
 * NIM Pembuat  : 24060123120020
 * Tanggal      : 28 Maret 2025
 * Deskripsi    : Fakultas merupakan class yang mewakili
 *                fakultas-fakultas yang ada di universitas.
 *                Fakultas memiliki atribut nama, tarifUKT, dan gajiPokok.
 *                Fakultas memiliki method tampilkanInfo.
 */

public class Fakultas {
    // Atribut
    private String nama;
    private double tarifUKT;
    private double gajiPokok;
    private static int counterFakultas = 0;

    // Konstruktor
    public Fakultas(String nama, double tarifUKT, double gajiPokok) {
        this.nama = nama;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
        counterFakultas++;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getTarifUKT() {
        return tarifUKT;
    }

    public void setTarifUKT(double tarifUKT) {
        this.tarifUKT = tarifUKT;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public static int getCounterFakultas() {
        return counterFakultas;
    }

    public void tampilkanInfo() {
        System.out.println("Fakultas " + nama);
        System.out.println("Tarif UKT: " + tarifUKT);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
