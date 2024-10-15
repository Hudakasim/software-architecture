public class ServerFactory extends Factory{
    private String Ram;
    private String CPU;

    public ServerFactory(String Ram, String CPU){
        this.CPU = CPU;
        this.Ram = Ram;
    }
    @Override
    public Computer createComputer(){
        return new Server(this.Ram, this.CPU);
    }
}
