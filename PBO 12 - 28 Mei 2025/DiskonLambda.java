// Nama file    : DiskonLambda.java
// Nama Pembuat : Mohamad Solkhan Nawawi - 24060123120020
// Tanggal      : 28/05/2025
// Deskripsi    : Program main yang digunakan untuk menghitung diskon 
//                menggunakan ekspresi lambda.

interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        // Tanpa Lambda
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };

        // Dengan Lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        // Dengan Lambda dengan blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        // Menampilkan hasil diskon
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
    }
}

// Output:
// Membedakan antara bagamana diskonLebaran dan diskonBiasa diimplementasikan
// DiskonLebaran: 27000.0
// DiskonBiasa: 40500.0

// Perbedaan:
// 1. DiskonLebaran menggunakan ekspresi lambda sederhana tanpa blok statement,
//    sedangkan diskonBiasa menggunakan blok statement yang memungkinkan lebih dari satu pernyataan.
// 2. DiskonLebaran memberikan diskon 40%, sedangkan diskonBiasa memberikan diskon 10%, sehingga hasilnya berbeda.
// 3. DiskonLebaran lebih ringkas dan mudah dibaca, sedangkan diskonBiasa lebih eksplisit dengan blok statement.
// 4. DiskonLebaran langsung mengembalikan hasil perhitungan, sedangkan diskonBiasa menggunakan return dalam blok statement.
// 5. DiskonLebaran lebih cocok untuk operasi sederhana, sedangkan diskonBiasa dapat digunakan untuk operasi yang lebih kompleks jika diperlukan.


