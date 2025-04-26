/* 
 * Nama File    : Main.java
 * Nama Pembuat : Mohamad Solkhan Nawawi
 * NIM Pembuat  : 24060123120020
 * Tanggal      : 28 Maret 2025
 * Deskripsi    : Main merupakan class yang berguna untuk mendemonstrasikan
 *                penggunaan class-class yang ada di package TugasResponsi.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("================== Tugas Responsi PBO ======================");
        System.out.println("================ Mohamad Solkhan Nawawi ====================");
        System.out.println("==================== 24060123120020 ========================");

        System.out.println("============= Membuat objek untuk Universitas ==============");
        // Membuat objek untuk Universitas
        Universitas UNDIP = new Universitas("Universitas Diponegoro");
        // Membuat objek untuk Fakultas
        Fakultas FSM = new Fakultas("Fakultas Sains dan Matematika", 5000000, 6000000);
        // Menambahkan fakultas ke dalam universitas
        UNDIP.tambahFakultas(FSM);
        // Menampilkan informasi universitas
        UNDIP.tampilkanInfo();
        System.out.println("=========== Membuat objek untuk CivitasAkademik ============");
        // Membuat objek untuk CivitasAkademika
        // Mahasiswa
        Mahasiswa M1 = new Mahasiswa("Solkhan", "solkhan@gmail.com", "24060123120020", 4, FSM);
        // Dosen
        Dosen D1 = new Dosen("Budi", "budi@gmail.com", "19780209001", 20, FSM);
        // Tendik
        Tendik T1 = new Tendik("Andi", "andi@gmail.com", "1987002002", 20);
        // Menampilkan informasi civitas akademika
        System.out.println("================== Informasi Mahasiswa ======================");
        M1.tampilkanInformasi();
        System.out.println("==================== Informasi Dosen ========================");
        D1.tampilkanInformasi();
        System.out.println("==================== Informasi Tendik =======================");
        T1.tampilkanInformasi();
        System.out.println("=============================================================");
        // Menampilkan jumlah civitas akademika
        CivitasAkademika.printCounterCivitasAkademika();
        // Menampilkan jumlah Mahasiswa
        Mahasiswa.printCounterMahasiswa();
        // Menampilkan jumlah dosen
        Dosen.printCounterDosen();
        // Menampilkan jumlah Tendik
        Tendik.printCounterTendik();
    }   
}
