
import java.util.Arrays;

public class tekBoyutludizi {
public static void main(String[] args) {
   int [] a = new int [10];
   int [] d1;
   d1 = new int[4];
   d1[0] = 1;
   d1[1] = 4;
   d1[2] = 5;
   d1[3] = 6;
   
   int [] d2= {2,6,4,8};
    System.out.println("d2 dizisinin 0.indexi: "+d2[0]);
    
    int [] b= new int[6];
    System.out.println("b dizisinin boyu= "+b.length); //length uzunluk gösterir.
    System.out.println(" ");
    System.out.println(" ");
    
    int [] k1={6,2,4,7};
    String [] k2={"Gül","Mehmet","Sefa"};
    Arrays.sort(k1); //Sıralama
    Arrays.sort(k2); //Sıralama
    
    System.out.println("k1 dizisi 0.index= "+k1[0]);
    System.out.println("k1 dizisi 1.index= "+k1[1]);
    System.out.println("k1 dizisi 2.index= "+k1[2]);     
    System.out.println("k1 dizisi 3.index= "+k1[3]);
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("k2 dizisi 0.index= "+k2[0]);
    System.out.println("k2 dizisi 1.index= "+k2[1]);
    System.out.println("k2 dizisi 2.index= "+k2[2]);
    System.out.println(" ");
    System.out.println(" "); 
    
    int [] m1 ={1,2,45};
    int [] m2 ={1,2,43};
    if(Arrays.equals(m1,m2)){ //equals ile eşit mi diye baktık.
        System.out.println("Diziler Eşit");
    }
    else{
        System.out.println("Diziler Eşit Değil");
    }
    
}
}
