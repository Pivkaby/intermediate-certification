package exercuse2;

public class Main {
    public static void main(String[] args) {
        Cpu cpuAsus = new Cpu(3,2, "AMD", 0.3);
        Ram ramAsus = new Ram(RamType.DDR3,8,0.1);
        Storage storageAsus = new Storage(StorageType.SSD,500,0.5);
        Screen screenAsus = new Screen(20, ScreenType.IPS,2);
        Keyboard keyboardAsus = new Keyboard(KeyboardType.MEMBRANOUS, false, 0.6);
        Computer computerAsus = new Computer(cpuAsus, ramAsus, storageAsus, screenAsus, keyboardAsus, "ASUS", "Ultima" );

        computerAsus.getWeightComputer();
        System.out.println();
        computerAsus.print();

        Cpu cpuLenovo = new Cpu(5,8, "AMD", 0.4);
        Ram ramLenovo = new Ram(RamType.DDR5,32,0.3);
        Storage storageLenovo = new Storage(StorageType.SSD,2000,0.7);
        Screen screenLenovo = new Screen(29, ScreenType.IPS,2.9);
        Keyboard keyboardLenovo = new Keyboard(KeyboardType.MEMBRANOUS, true, 0.7);
        Computer computerLenovo = new Computer(cpuLenovo, ramLenovo, storageLenovo, screenLenovo, keyboardLenovo, "Lenovo", "Gamer" );

        computerLenovo.getWeightComputer();
        System.out.println();
        computerLenovo.print();
    }
}