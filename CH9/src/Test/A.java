package Test;

public class A {
	static int field1 = 10;
	static int field2 = 10;
	B b = new B();
	C c = new C();
//	static B b1 = new B();
	static C c1 = new C();
	void method1() {
		B b = new B();
		C c = new C();
	}
	static void method2() {
		
//		C c = new C
	}
	
	class B {
		void method() {
			field1 = 30;
			method1();
			field2 = 40;
			method2();
		}
	}
	
	static class C {
		void method() {
//			field1 = 30;
//			method1();
			field2 = 40;
			method2();
		}
	}

}
