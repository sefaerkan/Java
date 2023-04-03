public class Yukleme {
static double ortalma_hesapla(double sayi1,double sayi2){
    double sonuc = (sayi1+sayi2)/2;
    return sonuc;
}
static double ortalma_hesapla(double sayi1,double sayi2,double sayi3){
    double sonuc = (sayi1+sayi2+sayi3)/3;
    return sonuc;
}
public static void main(String[] args) {
    System.out.println("İki sayının Ortalaması:"+ortalma_hesapla(6, 8));
    System.out.println("Üç sayının Ortalaması:"+ortalma_hesapla(12, 14, 34));
    
}
}
