
import java.util.Scanner;

public class Muhasebe {
  private String ad;

    public Muhasebe(String ad) {
        this.ad = ad;
    }
     public void degerlendirme(Sekreter s) throws InterruptedException{
         while (true) {
    Scanner scanner = new Scanner(System.in);
       int fatura_numarasi;
       String a="Merhaba ben bu kursun muhasebesinden sorumluyum\n"
               +"Lüften kayıt işlemini tamamlamak için fatura numarasını giriniz";
             System.out.println(a);
             fatura_numarasi=scanner.nextInt();
             if(fatura_numarasi==s.getFatura_no()){
                 System.out.println("");
                 System.out.println("Fatura numarası kontrol edliliyor...");
                 Thread.sleep(3000);
                 String message="Kursun muhasebe biriminden sorumlu "+ad+" tarafundan fatura numarası\n"
                         +"kontrol edildi ve doğru olduğu saptandı\n"
                         +"Kursumuza Hoşgeldiniz";
                 System.out.println(message);
                 return;
                 }
             else{
                 System.out.println("");
                 System.out.println("Fatura numarası kontrol edliyor...");
                 Thread.sleep(3000);
                 String message="Kursun muhasebe biriminden sorumlu"+ ad+"tarafından fatura numarası\n"
                         +"kontrol edildi ve yanlış olduğu saptandı\n"
                         +"Lütfen fatura numarasını doğru giriniz";
                 System.out.println(message);
             }
             
             
         }
     }
    
}
