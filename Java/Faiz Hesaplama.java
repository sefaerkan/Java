
import java.util.Scanner;

public class yatırımhesaplama {
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   double faiz_orani = 24;
    System.out.print("Yatirim yapmak istediginiz miktar:");
    double anapara = scanner.nextDouble();
    System.out.print("Vade suresi girin(yıl olarak):");
    int vade_suresi = scanner.nextInt();
    
    double faiz_getirisi =(anapara)*(faiz_orani/100)*vade_suresi;
    double toplam_getiri =anapara+faiz_getirisi;
    
    System.out.println("Faiz Getirisi:"+faiz_getirisi+" TL dir.");
    System.out.println("Toplam Gelir:"+toplam_getiri+" TL dir.");
}
   
}
