package sec2.exam1;

class A {}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        
        A a1 = b;	// B -> A
        A a2 = c;	// C -> A
        A a3 = d;	// D -> A
        A a4 = e;	// E -> A
        
        B b1 = d;	// D -> B
        C c1 = e;	// E -> C
        
        //B b3 = e;	// E -> B (X)
        //C c2 = d;	// D -> C (X)
    }
}