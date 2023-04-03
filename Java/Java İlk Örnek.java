public class NewClass {
    public static void main(String args[]) {
       byte kopek = 2;
       short koyun = 4;
       int inek = 8;
       long sutSatisFiyati = 2;
       float gunlukSutMiktari = 170.6f;
       System.out.println("Kopek Sayisi="+kopek);
        System.out.println("Koyun Sayisi="+koyun);
        System.out.println("Inek Sayisi="+inek);
        double sutGeliri = gunlukSutMiktari * sutSatisFiyati;
        int toplamHayvan = kopek + koyun + inek;
        System.out.println("Toplam Hayvan Sayisi="+toplamHayvan);
        System.out.println("Gunluk Sut Geliri="+sutGeliri);
    }
    
}
