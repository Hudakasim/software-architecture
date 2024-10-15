public class Server extends Computer{
    private String Ram;
    private String CPU;

    public Server (String ram, String cpu){
        Ram = ram;
        CPU = cpu;
    }
    @Override
    public String getCPU(){
        return CPU;
    }

    @Override
    public String getRam(){
        return Ram;
    }
}
