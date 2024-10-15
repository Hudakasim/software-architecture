public class Main {
    public static void main(String[] args) {

        Factory F1 = new ServerFactory("4GB", "13th Generation");
        Computer Server1 = F1.createComputer();
        System.out.println("Ram: " + Server1.getRam());
        System.out.println( "CPU: " + Server1.getCPU());
    }
}
