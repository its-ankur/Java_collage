
class Main {
    static int a = 1;
    static int b = 2;
    static {
        a += 1;
        b += 1;
    }
public class StaticQuestion {
        public static void main(String args[]) {
            a += 1;
            b += 2;
            System.out.println(a + b);
        }
    }
}
