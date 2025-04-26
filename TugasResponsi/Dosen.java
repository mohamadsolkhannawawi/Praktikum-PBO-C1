/* 
 * Nama File    : Dosen.java
 * Nama Pembuat : Mohamad Solkhan Nawawi
 * NIM Pembuat  : 24060123120020
 * Tanggal      : 28 Maret 2025
 * Deskripsi    : Dosen merupakan subclass dari Karyawan.
 *                Dosen memiliki atribut fakultas.
 */

 public class Dosen extends Karyawan {
    // Atribut
    private Fakultas fakultas;
    private static int counterDosen = 0;

    // Konstruktor
    public Dosen(String nama, String email, String nip, int masaKerja, Fakultas fakultas) {
        super(nama, email, nip, masaKerja);
        this.fakultas = fakultas;
        counterDosen++;
    }

    // Getter dan Setter
    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public static void printCounterDosen() {
        System.out.println("Jumlah dosen: " + counterDosen);
    }

    // Method
    @Override
    public double hitungGaji() {
        return fakultas.getGajiPokok() + (masaKerja * 0.01 * fakultas.getGajiPokok());
    }

    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Fakultas: " + fakultas.getNama());
    }
}
