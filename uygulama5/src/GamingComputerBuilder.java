public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder() {
        computer = new Computer();
    }
    public void buildCPU(){
        computer.setCPU("CPU1");
    }
    public void buildRAM(){
        computer.setRAM("RAM1");
    }
    public void buildStorage(){
        computer.setStorage("Storage1");
    }
    public void buildGraphicsCard(){
        computer.setGraphicsCard("GraphicsCard1");
    }
    public Computer getComputer() {
        return computer;
    }
}
