// Nama file    : LambdaMap.java
// Nama Pembuat : Mohamad Solkhan Nawawi - 24060123120020
// Tanggal      : 28/05/2025
// Deskripsi    : Program main yang digunakan untuk menampilkan key dan value dari sebuah Map
//                menggunakan ekspresi lambda.

// Buatlah sebuah program yang digunakan untuk menampilkan key dan value dari sebuah Map,
// dimana key merupakan NIM dan value merupakan nama mahasiswa, menggunakan ekspresi
// lambda ! Gunakan kode pada latihan 3.2 sebagai referensi.
public class LambdaMap {
    public static void main(String[] args) {
        // Membuat Map untuk menyimpan NIM dan nama mahasiswa
        java.util.Map<String, String> mahasiswaMap = new java.util.HashMap<>();
        mahasiswaMap.put("24060123120001", "Adi");
        mahasiswaMap.put("24060123120002", "Bambang");
        mahasiswaMap.put("24060123120003", "Cici");
        mahasiswaMap.put("24060123120004", "Didi");

        // Menggunakan lambda untuk menampilkan key dan value dari Map
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
