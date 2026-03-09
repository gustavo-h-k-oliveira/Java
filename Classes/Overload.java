/*
    Overloading Methods
*/

package Classes;

class OverloadDemo {
    
    void test() {
        System.out.println("No parameters");
    }

    void test(int i) {
        System.out.println("a: " + i);
    }

    void test(int i, int o) {
        System.out.println("a and b: " + i + " " + o);
    }

    double test(double d) {
        System.out.println("double d: " + d);
        return d * d;
    }
}

public class Overload {

    public static void main(String[] args) {
        
        OverloadDemo ob = new OverloadDemo();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Result of ob.test(123.25): " + result);
    }
}