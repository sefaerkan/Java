
import java.util.Scanner;

public class HesapM {
public static class toplama{
    void toplama_yap(int a, int b, int c){
        int sonuc =a+b+c;
        System.out.println("a+b+c isleminin sonucu: "+sonuc);
}
}
public static class cıkarma{
    void cıkarma_yap(int a, int b, int c){
     int sonuc =a-b-c;
     System.out.println("a-b-c isleminin sonucu: "+sonuc);
}
}
public static class carpma{
   void carpma_yap(int a, int b, int c){
   int sonuc =a*b*c;
   System.out.println("a*b*c isleminin sonucu: "+sonuc);    
}
}
public static class bolme{
    void bolme_yap(double a, double b){
    double sonuc=a/b;
    System.out.println("a/b isleminin sonucu: "+sonuc);
}
}
public static void main(String[] args) {
   String giris="Toplama islemi yapmak icin 1'e\n"
           +"Cıkarma islemi yapmak icin 2'e\n"
           +"Carpma islemi yapmak icin 3'e\n"
           +"Bolme islemi yapmak icin 4'e\n"
           +"cıkıs icin e'ye basınız.";
    while (true) {
        System.out.println(giris);
        Scanner scanner = new Scanner(System.in);
        String cevap = scanner.nextLine();
        if(cevap.equals("1")){
            System.out.println("Toplamak istediginiz sayıları giriniz");
            System.out.print("1.sayı: ");
            int s1=scanner.nextInt();
            System.out.print("2.sayı: ");
            int s2= scanner.nextInt();
            System.out.print("3.sayı:");
            int s3= scanner.nextInt();
            HesapM.toplama t1= new HesapM.toplama();
            t1.toplama_yap(s1, s2, s3);
            }
        else if(cevap.equals("2")){
            System.out.println("Cıkarmak istediginiz sayıları giriniz");
            System.out.print("1.sayı: ");
            int s1=scanner.nextInt();
            System.out.print("2.sayı: ");
            int s2= scanner.nextInt();
            System.out.print("3.sayı: ");
            int s3= scanner.nextInt();
            HesapM.cıkarma c1= new HesapM.cıkarma();
            c1.cıkarma_yap(s1, s2, s3);
            }
        else if(cevap.equals("3")){
            System.out.println("Carpmak istediginiz sayıları giriniz");
            System.out.print("1.sayı: ");
            int s1=scanner.nextInt();
            System.out.print("2.sayı: ");
            int s2= scanner.nextInt();
            System.out.print("3.sayı: ");
            int s3= scanner.nextInt();
            HesapM.carpma g1= new HesapM.carpma();
            g1.carpma_yap(s1, s2, s3);
            }
        else if(cevap.equals("1")){
            System.out.println("Toplamak istediginiz sayıları giriniz");
            System.out.print("1.sayı:");
            int s1=scanner.nextInt();
            System.out.print("2.sayı:");
            int s2= scanner.nextInt();
            HesapM.bolme b1= new HesapM.bolme();
            b1.bolme_yap(s1, s2);
            }
        else if(cevap.equals("e")){
            System.out.println("Hoscakalın");
            return;
        }
        else{
            System.out.println("Hatalı tuşlama yaptınız");
            break;
        }
        
}
}
}
