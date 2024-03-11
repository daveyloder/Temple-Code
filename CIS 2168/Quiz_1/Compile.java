package Quiz_1;

public class Compile {
    class A {
    }

    class B extends A {
    }

    class C extends B {
    }

    class D<C> {
        A a1 = new A();
    }
}
