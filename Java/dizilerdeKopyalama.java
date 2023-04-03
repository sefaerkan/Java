public class dizilerdeKopyalama {
public static void main(String[] args) {
   byte [] a;
   byte [] b;
   a = new byte[] {4,5,7};
   b=a; //Atama yolu ile kopyalama
   diziyi_bastir(b);
}
static void diziyi_bastir(byte [] b){ //yazdırma fonksiyonu
    for(byte i:b){
        System.out.println("Dizideki değerler"+i);
    }
}   
}
