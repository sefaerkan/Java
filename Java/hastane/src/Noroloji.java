public class Noroloji extends Isgucu{
    private String diploma_kurumu;

    public Noroloji(String ad, String soyad, int kimlikNo,String diploma_kurumu) {
        super(ad, soyad, kimlikNo);
        this.diploma_kurumu=diploma_kurumu;
    }
    void uyku_bozuklugu() throws InterruptedException{
        System.out.println("Doktor "+getAd()+" tarafından uyku sorununa yönelik tedavi uygulanıyor..");
        Thread.sleep(3000);
        System.out.println("Tedavi Basarıyla gerceklesti.");
   }
   void bas_agrısı() throws InterruptedException{
    System.out.println("Doktor "+getAd()+" tarafından bas agrısına yönelik tedavi uygulanıyor..");   
    Thread.sleep(3000);
    System.out.println("Tedavi Basarıyla gerceklesti.");
    }

    @Override
    void yaka_kartı_oku() {
        super.yaka_kartı_oku();
        System.out.println("Diploma Aldıgı Kurum: "+diploma_kurumu);
    }
   
    
    
}
