public class main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println();
        A a = new A();
        C[] elements = {new A(), new B(), new C(), new D()};

        for (int c = 0; c < elements.length; c++) {
            System.out.println(a);
            elements[c].method1();
            System.out.println();
            elements[c].method2();
            System.out.println();
            System.out.println();
        }
        A ab =new A(4);
        System.out.println(ab.printB());
    }
}
