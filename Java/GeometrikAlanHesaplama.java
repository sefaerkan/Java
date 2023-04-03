
import java.util.Scanner;


public class GeometrikAlanHesaplama {
 public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
     System.out.print("Altıgenin bir kenar uzunlugunu girin:");
     int kenar = scanner.nextInt();
     System.out.print("Dairenin yaricapini girin:");
     int yaricap = scanner.nextInt();
     System.out.println("Altıgenin Alani:"+6*((kenar*kenar*Math.sqrt(3))/4));
     System.out.println("Dairenin Alani:"+Math.PI*yaricap*yaricap);
           
           
}
   
}
