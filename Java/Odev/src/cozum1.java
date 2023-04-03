public class cozum1 {
public static void ciftleri_bul(int[] dizi){
    int i, j,toplam,kucToplam,cift1,cift2;
    if(dizi == null || dizi.length < 2)
      return;
  cift1 = dizi[0];
  cift2 = dizi[1];
  kucToplam = cift1 + cift2;
  
  for(i = 0; i < dizi.length-1; i++) 
  {
    for(j = i+1; j < dizi.length; j++) 
	{
      toplam = dizi[i] + dizi[j];
      if(Math.abs(toplam) < Math.abs(kucToplam)) 
	  {
        kucToplam = toplam;
        cift1 = dizi[i];
        cift2 = dizi[j];
      }
    }
  }
    System.out.println("Toplamı 0 a en yakın çiftten birincisi:"+cift1);
    System.out.println("Toplamı 0 a en yakın çiftten ikincisi :"+cift2);
    
}
public static void main(String[] args) {
int[] dizi= {38, 44, 63,-51, -35, 19, 84,-69, 4,-46};
    System.out.println("Dizimiz");
    for (int i = 0; i < dizi.length; i++) {
        System.out.println(dizi[i]);
    }
    ciftleri_bul(dizi);
}
}
