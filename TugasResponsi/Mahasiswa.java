/* 
 * Nama File    : Mahasiswa.java
 * Nama Pembuat : Mohamad Solkhan Nawawi
 * NIM Pembuat  : 24060123120020
 * Tanggal      : 28 Maret 2025
 * Deskripsi    : Mahasiswa merupakan subclass dari CivitasAkademika.
 *                Mahasiswa memiliki atribut nim, semester, fakultas.
 */

import java.text.NumberFormat;
import java.util.Locale;

public class Mahasiswa extends CivitasAkademika {
    // Atribut
    private String nim;
    private int semester;
    private Fakultas fakultas;
    private static int counterMahasiswa = 0;

    // Konstruktor
    public Mahasiswa(String nama, String email, String nim, int semester, Fakultas fakultas) {
        super(nama, email);
        this.nim = nim;
        this.semester = semester;
        this.fakultas = fakultas;
        counterMahasiswa++;
    }

    // Getter dan Setter
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public static void printCounterMahasiswa() {
        System.out.println("Jumlah mahasiswa: " + Mahasiswa.counterMahasiswa);
    }

    // Method
    public double hitungUKT() {
        return fakultas.getTarifUKT() * Math.pow(0.95, semester);
    }

    // Method untuk format gaji ke Rupiah
    public String formatGajiRupiah() {
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("id-ID"));
        return formatRupiah.format(hitungUKT()).replace(",00", ""); // Menghilangkan desimal
    }
    // Method
    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("NIM: " + nim);
        System.out.println("Semester: " + semester);
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("UKT: " + formatGajiRupiah());
    }
}
