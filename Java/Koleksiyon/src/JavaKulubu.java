
import java.util.ArrayList;
import java.util.List;

public class JavaKulubu {
/* a bir değişken adı 
a.add("..."); listeye eleman ekler
a.clear();    eklenen elemanı siler
a.remove(Object o); o olarak tanımlanan şeyi siler
a.size(); eleman sayısını verir
a.get(int index); belirtilen indexteki elemanı tanımlar   
*/    
    public static void main(String[] args) {
        List<String>a1= new ArrayList(); //Ekleme Sırasına göre yazılır
        ArrayList<String> a2=new ArrayList<String>();
            a1.add("Ali Kahraman");
            a1.add("Kazım Tanyürek");
            a1.add("Merve Karakum");
            a1.add("Burak Kuş");
            System.out.println(a1);
        System.out.println("");
        for(String s:a1){ // for-each
            System.out.println("Üye- "+s);
        }
        a1.remove(3); //3.indexi sildik
        System.out.println("");
        for(int i=0;i<a1.size();i++){
            System.out.println("Üye- "+a1.get(i));
        }
}
}
