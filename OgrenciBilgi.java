/*
 * Ad Soyad: ŞULE NUR BAYYĞUT
 * Ogrenci No: 250541029
 * Tarih: 05.11.2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz 
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        // Scanner objesi olusturun
        
        
        // Degisken tanimlamalari
        // String ad, soyad;
        // int ogrenciNo, yas;
        // double gpa;
        
        
        // Kullanicidan bilgileri alin
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();
        
        // Ad
        
        
        // Soyad
        
        
        // Ogrenci No
        
        
        // Yas
        
        
        // GPA
        
        
        // Bilgileri ekrana yazdirin
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        
        // /*
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        // Scanner objesi olusturun
        Scanner input = new Scanner(System.in);

        // Degisken tanimlamalari
        String ad = "Sule Nur";
        String soyad = "Baygut";
        int ogrenciNo = 250541029;
        int yas = 18;
        double gpa = 4.00;
        String durum = "Basarili Ogrenci";

        // Bilgileri ekrana yazdirin
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.printf("Ad Soyad: %s %s%n", ad, soyad);
        System.out.printf("Ogrenci No: %d%n", ogrenciNo);
        System.out.printf("Yas: %d%n", yas);
        System.out.printf("GPA: %.2f%n", gpa);
        System.out.printf("Durum: %s%n", durum);

        // Scanner'i kapatin
        input.close();
    }
}

        
        

