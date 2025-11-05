AD SOYAD: ŞULE NUR BAYĞUT 
  ogrenci no: 250541029
  tarih:05.11.2025
 aciklama- gorev 2 : GEOMETRİK HESAPLAYICI
  
/*
 * Bu program bir dairenin yaricapini 4.3 cm olarak alir
 * ve daire ile kureye ait geometrik hesaplamalari yapar.
 */

public class GeometrikHesap {
    public static void main(String[] args) {
        // Sabit PI degeri
        final double PI = 3.14159;

        // Yarıçap
        double r = 4.3;

        // Hesaplamalar
        double daireAlani = PI * Math.pow(r, 2);
        double daireCevresi = 2 * PI * r;
        double daireCapi = 2 * r;
        double kureHacmi = (4.0 / 3.0) * PI * Math.pow(r, 3);
        double kureYuzeyAlani = 4 * PI * Math.pow(r, 2);

        // Sonuçları yazdır
        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        System.out.printf("Dairenin yaricapi : %.2f cm%n", r);
        System.out.println("\nSONUCLAR:");
        System.out.println("----------");
        System.out.printf("Daire Alani        : %.2f cm²%n", daireAlani);
        System.out.printf("Daire Cevresi      : %.2f cm%n", daireCevresi);
        System.out.printf("Daire Capi         : %.2f cm%n", daireCapi);
        System.out.printf("Kure Hacmi         : %.2f cm³%n", kureHacmi);
        System.out.printf("Kure Yuzey Alani   : %.2f cm²%n", kureYuzeyAlani);
    }
}
