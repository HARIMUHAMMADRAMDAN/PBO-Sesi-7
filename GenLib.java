public class GenLib {

    public static <T extends Number, X extends Number> void add(T a, X b) {
        System.out.println(a.doubleValue() + b.doubleValue());
    }

    public static <A, B> void printAlamat(A a, B b) {
        System.out.println(a + " " + b);
    }
}
