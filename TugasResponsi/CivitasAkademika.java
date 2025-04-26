/* 
 * Nama File    : CivitasAkademika.java
 * Nama Pembuat : Mohamad Solkhan Nawawi
 * NIM Pembuat  : 24060123120020
 * Tanggal      : 28 Maret 2025
 * Deskripsi    : CivitasAkademika merupakan class bertipe abstract
 *                yang menjadi superclass dari Mahasiswa dan Karyawan. 
 *                Memiliki atribut umum yaitu nama dan email.
 */

public abstract class CivitasAkademika {
    // Atribut 
    protected String nama;
    protected String email;
    protected static int counterCivitasAkademika = 0;

    // Konstruktor
    public CivitasAkademika() {
        counterCivitasAkademika++;
    }

    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
        counterCivitasAkademika++;
    }

    // Method
    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void printCounterCivitasAkademika() {
        System.out.println("Jumlah civitas akademika: " + CivitasAkademika.counterCivitasAkademika);
    }

    // Method
    public void tampilkanInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("Email: " + email);
    }
}
