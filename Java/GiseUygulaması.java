
import java.util.Scanner;

public class GiseUygulaması {
    public static int toplam_maliyet(int gecirilenDakika){
        int girisUcreti=50;
        int dakikaMaliyeti=2;
        return (gecirilenDakika*dakikaMaliyeti+girisUcreti);
    }
    public static int toplam_maliyet(int gecirilenDakika,int otoparkaGecenSure){
        int girisUcreti=50;
        int dakikaMaliyeti=2;
        int otoparkUcreti=3;
        return (otoparkaGecenSure*otoparkUcreti+gecirilenDakika*dakikaMaliyeti+girisUcreti);
    }
    public static void main(String[] args) throws InterruptedException {
   Scanner scanner = new Scanner(System.in);
   String message = "Havaalanına hoşgeldiniz\n"
           +"Araçsız girişler A kapısından\n"
           +"Araçlı girişler B kapısından.\n"
           +"Geçirdiğiniz her dakika için ücret ödeyeceksiniz.";
        System.out.println(message);
        System.out.println(" ");
        System.out.print("Lütfen Girdiğiniz Kapıyı Seçiniz:");
        String kapıSecimi= scanner.nextLine();
        while (true) {            
            if (kapıSecimi.equals("A")) {
                String c1="Havaalanında Kaç dakika geçirdiniz?";
                System.out.println(c1);
                int gecirilenDakika=scanner.nextInt();
                System.out.println("Toplam Ödeme Miktarı:"+toplam_maliyet(gecirilenDakika));
                System.out.println("Ödeme işlemi gerçekleştiriliyor..");
                Thread.sleep(2000);
                System.out.println("Ödeme Gerçekleştirildi.");
                return;
            }
            else if (kapıSecimi.equals("B")) {
             String c2="Havaalanında Kaç dakika geçirdiniz?";
                System.out.println(c2);
                int gecirilenDakika=scanner.nextInt();
                System.out.println("Otoparka Kaldığınız Süre?");
                int otoparkaGecenSure=scanner.nextInt();
                System.out.println("Toplam Ödeme Miktarı:"+toplam_maliyet(gecirilenDakika, otoparkaGecenSure));
                System.out.println("Ödeme işlemi gerçekleştiriliyor..");
                Thread.sleep(2000);
                System.out.println("Ödeme Gerçekleştirildi.");
                return;
            }
            else{
                System.out.println("Geçersiz İşlem.");
                break;
            }
            
        }
        
        
        
        
        
        
        
}
    
}
