
import java.util.Scanner;

public class rezervasyonUygulaması {
public static void main(String[] args) {
   String [] a=new String[12];
   a[9]="Sefa";
   a[2]="Erkan";
   a[3]="Mehmet";
   a[7]="Ayfer";
   a[5]="Ali";
   a[10]="Tuğba";
   Scanner scanner = new Scanner(System.in);
   String giris ="Pansiyona Hoşgeldiniz\n"
           +"Pansiyonda 12 ye kadar numaralı odalar vardır.";
   String bilgiler="Pansiyonda kalmak için\n"
           +"Adınızı,Soyadınızı\n"
           +"Kalmak istediğiniz numarayı girin.";
    System.out.println(giris+bilgiler);
    System.out.print("Adınız: ");
    String ad=scanner.nextLine();
    System.out.print("Soy adınız: ");
    String soyad=scanner.nextLine();
    while (true) {
        System.out.println("Hoşgeldiniz "+ad+" Bey/Hanım");
        System.out.println("Lütfen Kalmak istediğiniz Oda numarasını giriniz");
        int oda=scanner.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[oda]!=null){
                System.out.println("Uyarı--> "+(oda)+" numaralı odada "+a[oda]+" bulunuyor");
                System.out.println(" ");
                System.out.println(ad+" Bey/Hanım "+oda+" numaralı odamız doludur.Lütfen Başka bir oda seçiniz");
                break;
            }
            else{
             System.out.println(ad+" Bey/Hanım "+oda+" numaralı odamız boştur.Yerleşebilirsiniz");
             return;
            }
                
        }
        
    }
   
   
}
    
}
