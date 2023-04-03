public class Kardiyoloji extends Isgucu {
    private String unvan;

    public Kardiyoloji(String ad, String soyad, int kimlikNo,String unvan) {
        super(ad, soyad, kimlikNo);
        this.unvan=unvan;
    }
    void risk_hesapla() throws InterruptedException{
        System.out.println(unvan+" doktor "+getAd()+" tarafından kalp krizi riski hesaplanıyor..");
        Thread.sleep(3000);
        System.out.println("İnceleme basarıyla tamamlandı.");
    }
    void ekg_cek() throws InterruptedException{
        System.out.println(unvan+" doktor "+getAd()+" tarafından ekg cekimi yapılıyor..");
        Thread.sleep(3000);
        System.out.println("EKG basarıyla cekildi.");
        }

    @Override
    void yaka_kartı_oku() {
        super.yaka_kartı_oku();
        System.out.println("Unvan: "+unvan);
    }
    }
