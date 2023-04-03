class A {
    void Ogrenci(){
        System.out.println("Bu bir A classıdır");
}
}
class B extends A{

    @Override
    void Ogrenci() {
        System.out.println("Bu Bir B classıdır");
}
}
class C extends A{

    @Override
    void Ogrenci() {
        System.out.println("Bu bir C classıdır");
}
}
public class Calıstır {
public static void main(String[] args) {
    A a=new A();
    B b=new B();
    C c=new C();
    A r;
    r=a;
    r.Ogrenci();
    
    r=b;
    r.Ogrenci();
    
    r=c;
    r.Ogrenci();
}
}
