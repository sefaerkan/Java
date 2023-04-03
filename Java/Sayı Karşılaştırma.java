
import java.util.Scanner;

public class Analiz {
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
    System.out.print("Birinci Sayiyi Girin:");
    int x = scanner.nextInt();
    System.out.print("İkinci Sayiyi Girin:");
    int y = scanner.nextInt();
    System.out.print("Ucuncu Sayiyi Girin:");
    int z = scanner.nextInt();
    
    System.out.println("Uc sayi arasinda en kücügü:"+Math.min(Math.min(x, y), Math.min(y, z)));
    System.out.println("Uc sayi arasinda en büyügü:"+Math.max(Math.max(x, y), Math.max(y, z)));
    
}
    
}
