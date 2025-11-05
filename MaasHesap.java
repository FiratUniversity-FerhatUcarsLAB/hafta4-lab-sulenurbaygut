ad-soyad:ŞULE NUR BAYĞUT
  ogrenci no:250541029
  tarih:05.11.2025
  aciklama: görev 4- maas hesaplama sistemi
  
  /*
 * Dosya: MaasHesap.java
 * Açıklama: Bir çalışanın maaş bilgilerini hesaplar ve profesyonel bir bordro çıktısı verir.
 * Verilen sabit girdiyle (ad soyad: necat kırtay, brut maas: 50000, haftalık çalışma saati: 30,
 * mesai saati: 11, tarih: 5 Kasım 2025, mesai ücreti/saat = 111 TL) hesaplamaları yapar.
 */

public class MaasHesap {
    public static void main(String[] args) {
        // Sabit veriler / parametreler
        final double SGK_RATE = 0.14;        // %14
        final double INCOME_TAX_RATE = 0.15; // %15
        final double STAMP_TAX_RATE = 0.00759; // %0.759

        // Verilen çalışan bilgileri (istek üzerine sabit atandı)
        String calisanAdiSoyadi = "necat kirtay";
        double brutMaas = 50000.00; // TL
        int haftalikCalismaSaati = 30; // saat
        int mesaiSaati = 11; // saat
        String tarih = "5 Kasım 2025";
        final double MESAI_UCRETI_PER_SAAT = 111.0; // kullanıcı belirtti

        // Hesaplamalar
        double mesaiUcreti = MESAI_UCRETI_PER_SAAT * mesaiSaati;
        double toplamGelir = brutMaas + mesaiUcreti;

        double sgkKesinti = toplamGelir * SGK_RATE;
        double gelirVergisi = toplamGelir * INCOME_TAX_RATE;
        double damgaVergisi = toplamGelir * STAMP_TAX_RATE;
        double toplamKesinti = sgkKesinti + gelirVergisi + damgaVergisi;

        double netMaas = toplamGelir - toplamKesinti;

        // İstatistikler
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100.0; // yüzde
        // Aylık çalışma saati tahmini = haftalık saat * (52 hafta / 12 ay)
        double aylikCalismaSaati = haftalikCalismaSaati * (52.0 / 12.0);
        double saatlikNetKazanc = netMaas / aylikCalismaSaati;
        double gunlukNetKazanc = netMaas / 22.0; // 22 iş günü varsayımı

        // Bordro çıktısı
        System.out.println("====================================");
        System.out.println("         MAAS BORDROSU");
        System.out.println("====================================");
        System.out.printf("Calisan: %s%n", calisanAdiSoyadi);
        System.out.printf("Tarih  : %s%n%n", tarih);

        System.out.println("GELIRLER:");
        System.out.printf("  Brut Maas               : %10.2f TL%n", brutMaas);
        System.out.printf("  Mesai Ucreti (%d saat)  : %10.2f TL%n", mesaiSaati, mesaiUcreti);
        System.out.println("  ------------------------");
        System.out.printf("  TOPLAM GELIR            : %10.2f TL%n%n", toplamGelir);

        System.out.println("KESINTILER:");
        System.out.printf("  SGK Kesintisi (%.1f%%)   : %10.2f TL%n", SGK_RATE * 100.0, sgkKesinti);
        System.out.printf("  Gelir Vergisi (%.1f%%)   : %10.2f TL%n", INCOME_TAX_RATE * 100.0, gelirVergisi);
        System.out.printf("  Damga Vergisi (%.1f%%)   : %10.2f TL%n", STAMP_TAX_RATE * 100.0, damgaVergisi);
        System.out.println("  ------------------------");
        System.out.printf("  TOPLAM KESINTI          : %10.2f TL%n%n", toplamKesinti);

        System.out.printf("NET MAAS                  : %10.2f TL%n%n", netMaas);

        System.out.println("ISTATISTIKLER:");
        System.out.printf("  Kesinti Orani           : %5.1f%%%n", kesintiOrani);
        System.out.printf("  Saatlik Net Kazanc      : %7.2f TL/saat%n", saatlikNetKazanc);
        System.out.printf("  Gunluk Net Kazanc       : %7.2f TL/gun%n", gunlukNetKazanc);
        System.out.println("====================================");
    }
}

