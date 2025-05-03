// Nama file    : Datum.java
// Nama Pembuat : Mohamad Solkhan Nawawi - 24060123120020
// Tanggal      : 30/04/2025
// Deskripsi    : Datum merupakan class generik dengan atribut isi dengan tipe generik T

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generik;

/**
 *
 * @author Solkhan
 */
public class Datum<T> {
    //Atribut
    private T isi;
    
    //Konstruktor
    public Datum(T isi) {
        this.isi = isi;
    }
    
    
    //Method
    public T getIsi() {
        return isi;
    }
    
    public void setIsi(T isi) {
        this.isi = isi;
    }
}
