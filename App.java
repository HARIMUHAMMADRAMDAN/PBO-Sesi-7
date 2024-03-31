public class App {

    public static void main(String[] args) throws Exception {
        LibMath<Integer, Integer> libMath = new LibMath<>(10, 20);
        libMath.add();
        
        LibMath<Double, Double> libMath2 = new LibMath<>(10.0, 10.0);
        libMath2.add();
        
        LibMath<Integer, Double> libMath3 = new LibMath<>(10, 20.0);
        libMath3.add();
        
        LibMath<Double, Integer> libMath4 = new LibMath<>(10.0, 10);
        libMath4.add();
        
        GenLib.printAlamat("Jalan Cibodas", "Nagrak");
        
        GenLib.printAlamat("Jalan Cibodas", 10);
    }
}
