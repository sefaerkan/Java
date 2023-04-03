import java.util.Random;

public class Sekreter {
Random random = new Random();
private String ad;
private int ucret=3000;
private int fatura_no=random.nextInt(20);

    public void setRandom(Random random) {
        this.random = random;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    public void setFatura_no(int fatura_no) {
        this.fatura_no = fatura_no;
    }

    public Random getRandom() {
        return random;
    }

    public String getAd() {
        return ad;
    }

    public int getUcret() {
        return ucret;
    }

    public int getFatura_no() {
        return fatura_no;
    }

    public Sekreter(String ad) {
        this.ad = ad;
    }
    void islem_sonucu(){
        String s="Kurs Kayıt İşleminiz sekreterimiz "+ad+" taradından işleme alınmıştır\n"
                +"Lütfen ilgili fatura numarsını ilgili muhasebe birimine iletiniz\n"
                +"Fatura numaranız "+fatura_no;
        System.out.println(s);
        }
        }
