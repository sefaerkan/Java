
import java.util.Arrays;
import java.util.Random;

public class forEach {
 public static void main(String[] args) {
   
byte [] b={5,2,5,1,2,4};
for(byte k:b){
    System.out.println("Döngü değerleri: "+k);
}
System.out.println(" ");
String [] c={"dd","aa","kk","mm"};
Arrays.sort(c);
for(String dd:c){
    System.out.println("String Dizisindeki değerler: "+dd);
}
System.out.println(" ");

int [] f = new int[6];
for(int i=0; i<f.length;i++){
    Random random = new Random(); //random tanımladık
    Integer rand=random.nextInt(20); //20 ye kadar random sayıları rand a eşitledik
    f[i]=rand; //rand ı f in her bir i değerine eşitledik
}
for(Integer nn:f){ //for-each döngüsü ile yazdırıyoruz
    System.out.println("Sonuc: "+nn);
}

}
}
