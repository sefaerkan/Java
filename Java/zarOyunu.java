
import java.util.Scanner;

public class zarOyunu {
public static void main(String[] args) {
   char t='t';
   int z1=0;
   int z2=0;
   int o1=0;
   int o2=0;
   int s=0;
   int fark=0;
   Scanner scanner=new Scanner(System.in);
    System.out.println("Birinci oyuncunun parası:");
    o1=scanner.nextInt();
    System.out.println("İkinci oyuncunun parası:");
    o2=scanner.nextInt();
    while(o1>0 && o2>0 && t=='t'){
        s++;
        System.out.println("Oyunun "+s+".turundasınız.");
        z1=((int)(Math.random()*6+1));
        z2=((int)(Math.random()*6+1));
        if(z1<z2){
            System.out.println("Birinci Oyuncu zar Değeri: "+z1);
            System.out.println("İkinci Oyuncu zar Değeri: "+z2);
            fark=z1-z2;
            o2=o2-fark;
            o1+=fark;
            System.out.println("o2 oyuncusunun kalan parası:"+o2);
            
            }
        else if (z2<z1) {
          System.out.println("Birinci Oyuncu zar Değeri: "+z1);
          System.out.println("İkinci Oyuncu zar Değeri: "+z2);  
          fark=z1-z2;  
          o1=o1-fark;
          o2+=fark;
          System.out.println("o1 oyuncusunun kalan parası:"+o1);
          
        }
        
        else{
            System.out.println("Tekrar Zar Atınız\n");
            
        }
        if(o1<=0 && o2<=0){
            break;
        }
        else{
            System.out.println("Tekrar Zar atmak için t ye basın.");
            t=scanner.next().charAt(0);
        }
        }
    if(o1<=0){
        System.out.println("İkinci oyuncu "+s+". turda kazandı.");
    }
    else{
      System.out.println("Birinci oyuncu "+s+". turda kazandı.");  
    }
}
    
}
