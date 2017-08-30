package lesson_03;

class Inheritance { // if not defined public class or private , which modificator class gets by default?
    public void m() {
        System.out.println("Inheritance.m() called"); }
    public static void n() {
        System.out.println("Inheritance.n() called"); }
}
class B extends Inheritance {
    public void m() {
        System.out.println("B.m() called"); }
    public static void n() {
        System.out.println("B.n() called"); }
    }
class C {
    public static void main(String[] args) {
        Inheritance a = new Inheritance();
        B b = new B();
        Inheritance c = new B();


        a.m();// Inheritance m() called
        b.m();//B.m() called
        c.m();//B.m() called
        System.out.println("-----");
        a.n();//Inheritance.n() called
        b.n();//B.n() called
        c.n(); //Inheritance.n called
    }

}

