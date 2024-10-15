public class PcFactory extends Factory{
    private String Ram;
    private String CPU;


    public PcFactory(String Ram, String CPU){
        this.Ram = Ram;
        this.CPU = CPU;
    }

    public Computer createComputer(){
        return new Pc(this.Ram, this.CPU);
    }
}
