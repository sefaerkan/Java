public class Isgucu {
private String ad;
private String soyad;
private int kimlikNo;

    public Isgucu(String ad, String soyad, int kimlikNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.kimlikNo = kimlikNo;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setKimlikNo(int kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getKimlikNo() {
        return kimlikNo;
    }
    void yaka_kartı_oku(){
        System.out.println("Ad: "+ad);
        System.out.println("Soyad: "+soyad);
        System.out.println("Kimlik No: "+kimlikNo);
    }
}