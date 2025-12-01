package lab4.task4;

public class Main {
    public static void main(String[] args) {

        Processor cpu = new Processor("Ryzen 7 7800X3d", 4.8, 12);
        Memory ram = new Memory(32, "DDR5");
        Monitor display = new Monitor(27, "2560x1440");

        Computer pc = new Computer(ComputerBrand.ASUS, cpu, ram, display);

        System.out.println(pc);
    }
}
