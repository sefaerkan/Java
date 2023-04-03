public class Futbol {
    private String takiminAdi;
    private int galibiyet_sayisi;
    private int maglubiyet_sayisi;
    
    public Futbol(String takiminAdi, int galibiyet_sayisi, int maglubiyet_sayisi ) {
        this.takiminAdi = takiminAdi;
        this.galibiyet_sayisi = galibiyet_sayisi;
        this.maglubiyet_sayisi = maglubiyet_sayisi;
    }

    public Futbol(String takiminAdi) {
        this(takiminAdi, 0, 0);
    }
    
    public void setTakiminAdi(String takiminAdi) {
        this.takiminAdi = takiminAdi;
    }

    public void setGalibiyet_sayisi(int galibiyet_sayisi) {
        this.galibiyet_sayisi = galibiyet_sayisi;
    }

    public void setMaglubiyet_sayisi(int maglubiyet_sayisi) {
        this.maglubiyet_sayisi = maglubiyet_sayisi;
    }

    public String getTakiminAdi() {
        return takiminAdi;
    }

    public int getGalibiyet_sayisi() {
        return galibiyet_sayisi;
    }

    public int getMaglubiyet_sayisi() {
        return maglubiyet_sayisi;
    }

    public int mac_kazanma(){
        galibiyet_sayisi++;
        return galibiyet_sayisi;
    }
    public int mac_kaybetme(){
        maglubiyet_sayisi++;
        return maglubiyet_sayisi;
    }    
    public void sicil(){
    if(galibiyet_sayisi>=maglubiyet_sayisi){
            System.out.println("TakÄ±m iyi bir sicile sahip");
    }
    else{
            System.out.println("TakÄ±m kÃ¶tÃ¼ bir sicile sahip");
    }
    } 
    
public static void main(String[] args) {
    Futbol takim = new Futbol("Harran", 3, 5);
    takim.sicil();
    takim.mac_kazanma();
    takim.mac_kazanma();
    takim.mac_kazanma();
    takim.sicil();
}
}
