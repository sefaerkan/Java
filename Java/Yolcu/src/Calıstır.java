public class Calıstır {
public static void main(String[] args) {
   Yolcu o = new Yolcu("Ali Kahraman", "MÜLKİYE");
   Yolcu o2= new Yolcu("Mehtap Yurt", "KIZILAY");
   Yolcu o3= new Yolcu("Ceyda Güneş", "KÖPRÜ");
   Yolcu o4= new Yolcu("Necati Kaya", "ÇEŞME");
   o.cikti();
   o2.cikti();
   o3.cikti();
   o4.cikti();
    System.out.println("Otobüsteki yolcu sayısı: "+Yolcu.getYolcu_sayisi());
}
}
