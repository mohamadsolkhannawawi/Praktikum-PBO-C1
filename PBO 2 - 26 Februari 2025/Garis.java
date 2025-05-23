/* Nama File   : Garis.java
 * Deskripsi   : Berisi atribut dan method dalam class Garis
 * Pembuat     : Mohamad Solkhan Nawawi / 24060123120020
 * Tanggal     : 26 Februari 2025
*/

// Membuat class Garis yang didalamnya terdapat atribut titikAwal dan titikAkhir
// Menambahkan atribut static counterGaris untuk menyimpan jumlah garis yang pernah dibuat
public class Garis {
    // Atribut
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris;

    // Method
    // Konstruktor untuk membuat garis dengan titik awal (0,0) dan titik akhir (1,1)
    public Garis() {
        titikAwal = new Titik();
        titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // Konstruktor dengan parameter masukan titik awal dan titik akhir
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Selektor
    // Mengembalikan nilai titik awal
    public Titik getTitikAwal() {
        return titikAwal;
    }

    // Mengembalikan nilai titik akhir
    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    // Mengembalikan jumlah garis yang telah dibuat
    public static int getCounterGaris() {
        return counterGaris;
    }

    // Mutator
    // Mengubah nilai titik awal 
    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    // Mengubah nilai titik akhir
    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    // Method
    // Mengembalikan panjang sebuah garis
    public double panjangGaris() {
        return Math.sqrt(((titikAkhir.getAbsis() - titikAwal.getAbsis()) * (titikAkhir.getAbsis() - titikAwal.getAbsis())) + ((titikAkhir.getOrdinat() - titikAwal.getOrdinat()) * (titikAkhir.getOrdinat() - titikAwal.getOrdinat())));
    }

    // Mengembalikan gradien dari sebuah garis
    // gradienGaris() bisa dipakai dalam perhitungan lain, 
    // jadi lebih baik melempar error ke pemanggilnya (MGaris.java) agar bisa ditangani sesuai kebutuhan.
    public double gradienGaris() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        if (dx == 0) {
            throw new ArithmeticException("Garis tegak lurus sumbu X (gradien tidak terdefinisi)"); // Menangani exception jika garis tegak lurus sumbu X
        }
        return dy / dx;
    }

    // Mengembalikan nilai titik tengah dari sebuah garis
    public Titik titikTengah() {
        double absis = (titikAkhir.getAbsis() + titikAwal.getAbsis()) / 2;
        double ordinat = (titikAkhir.getOrdinat() + titikAwal.getOrdinat()) / 2;
        return new Titik(absis, ordinat);
    }

    // Mengecek apakah dua garis sejajar
    public boolean sejajar(Garis garis) {
        return this.gradienGaris() == garis.gradienGaris();
    }

    // Mengecek apakah dua garis saling tegak lurus
    public boolean tegakLurus(Garis garis) {
        return this.gradienGaris() * garis.gradienGaris() == -1;
    }

    // Menampilkan titik awal dan titik akhir garis
    public void titikAwalAkhir() {
        System.out.println("Titik Awal: (" + titikAwal.getAbsis() + "," + titikAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + titikAkhir.getAbsis() + "," + titikAkhir.getOrdinat() + ")");
    }

    // Menampilkan persamaan garis dalam bentuk string y = mx + c
    // persamaanGaris() langsung menampilkan hasilnya ke layar, jadi lebih masuk akal jika error ditangani langsung di dalam method
    public void persamaanGaris() {
        try {
            double m = gradienGaris();
            double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
            System.out.println("Persamaan garis: y = " + m + "x + " + c);
        } catch (ArithmeticException e) {
            System.out.println("Garis vertikal, tidak memiliki persamaan dalam bentuk y = mx + c."); // Menangani exception jika garis vertikal
        }
    }

}