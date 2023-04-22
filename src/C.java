public class C {
    void plus() {
        int a = 10;
        long b = 123456;
        long c = a + b;
        if (100000 < b | c == 123) {
            System.out.println(c);
        } else {
            System.out.println(b);
        }
    }
}

class D extends C {
    void minus() {
        double a = 2546.2858;
        double b = 254685.2544;
        double c = b - a;
        if (c > 500000 | c < b) {
            System.out.println(c);
        } else if (c > 500000 && c == 252138.9686) {
            System.out.println(c + " Calling Else If");
        } else {
            System.out.println(c + " Calling Else");
        }
    }
    public static void main(String[] args) {
        C c = new C();
        c.plus();
        D d = new D();
        d.minus();

        for (int a = 1; a <= 10; a++) {
            System.out.println(a + " Dhana");
        }
    }
}
