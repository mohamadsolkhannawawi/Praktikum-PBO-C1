// Nama file    : ContohMetodeGenerik.java
// Nama Pembuat : Mohamad Solkhan Nawawi - 24060123120020
// Tanggal      : 30/04/2025
// Deskripsi    : ContohMetodeGenerik merupakan class dengan implementasi generik pada methodnya,
//                yang dapat mengendalikan class Datum

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generik;

/**
 *
 * @author HP
 */
public class ContohMetodeGenerik {
    public static <T extends Anabul> void tampilkanPerilaku(Datum<T> data) {
        T hewan = data.getIsi();
        hewan.Suara();
        hewan.Gerak();
    }
}
