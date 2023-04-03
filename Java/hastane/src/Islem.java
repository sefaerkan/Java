
import java.util.Scanner;

public class Islem {
    public static void main(String[] args) throws InterruptedException {
   Bashekim b=new Bashekim("Hakan", "Gül", 8677, "Profesör", "Ic Hastalıkları", 20);
   Kardiyoloji k=new Kardiyoloji("Gülhan", "Tan", 8876, "Docent");
   Noroloji n=new Noroloji("Ceyhun", "Gül", 8875, "Ankara Uni");
   Scanner scanner = new Scanner(System.in);
   String komut="Hastane Sistemeni Hoş Geldiniz...\n"
        + "Yapılabilecek İşlemler\n"
        + "Başhekim birimiyle ilgili işlemler için 1'e\n"
        + "Kardiyoloji birimiyle ilgili işlemler için 2'ye\n"
        + "Nöroloji birimiyle ilgili işlemler için 3'e \n"
        + "Sistemden çıkmak için 0'a basınız ";
    while (true) {
        System.out.println("/////////////////");
        System.out.println(komut);
        System.out.println("////////////////");
        System.out.println(" ");
        System.out.print("Lütfen Yapmak İstediğiniz işlemi giriniz: ");
        String secim=scanner.nextLine();
    while (true) {
        if(secim.equals("0")){
            System.out.println("Sistemden Cıkılıyor...");
            Thread.sleep(3000);
            return;
        }
        else if(secim.equals("1")){
            System.out.println("Bashekim birimine hosgeldiniz."
                    +"Bashekim bilgileri tanımlanıyor...");
            b.yaka_kartı_oku();
            b.calis();
            System.out.println("Bashekim calısmasını bitirdi.");
            break;
        }
        else if(secim.equals("2")){
            System.out.println("Kardiyoloji birimine hos geldiniz"
            +"Doktorun bilgileri tanımlanıyor...");
            k.yaka_kartı_oku();
            String s="Kalp krizi riski icin 1\n"
                    +"Ekg cektimek icin 2'ye basın";
            System.out.println(s);
            String secim2=scanner.nextLine();
            if(secim2.equals("1")){
             k.risk_hesapla();
             break;
            }
            else if(secim2.equals("2")){
             k.ekg_cek();
             break;
            }
            else{
                System.out.println("Hatalı bir secim yaptınız");
            
            }
            }
        else if(secim.equals("3")){
            System.out.println("Noroloji birimine hos geldiniz."
            +"Noroloji doktorunun bilgileri tanımlanıyor...");
            n.yaka_kartı_oku();
            String s="Bas agrısı icin 1\n"
                    + "Uyku tedavisi icin 2'e basınız.";
            System.out.println(s);
            String secim3=scanner.nextLine();
            if(secim3.equals("1")){
             n.bas_agrısı();
             break;
            }
            else if(secim3.equals("2")){
             n.uyku_bozuklugu();
             break;
            }
            else{
                System.out.println("Hatalı bir islem yaoptınız");
                break;
            }
            
        }
            
        }
            
            
        }
}
}
