package lesson_05;

public class lesson_5_1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A someObject;

        someObject = a;
        someObject.showMe();

        someObject = b;
        someObject.showMe();

        someObject = c;
        someObject.showMe();
    }
}
