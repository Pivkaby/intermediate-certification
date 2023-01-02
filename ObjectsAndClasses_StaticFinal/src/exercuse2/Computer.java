package exercuse2;

public class Computer {
    public Cpu cpu;
    public Ram ram;
    public Storage storage;
    public Screen screen;
    public Keyboard keyboard;
    private final String vendor;
    private final String name;
    public double weightComputer;
    String string = "";

    public Computer(Cpu cpu, Ram ram, Storage storage, Screen screen, Keyboard keyboard, String vendor, String name) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void getWeightComputer () {
        weightComputer = weightComputer +
                cpu.getWeight() +
                ram.getWeight() +
                storage.getWeight() +
                screen.getWeight() +
                keyboard.getWeight();
        System.out.println("Вес всех комплектующих в " + vendor + " " + name + ": " + weightComputer + " Кг");
    }

    public void print() {
        string = "Параметры компьютера " + vendor + " " + name + "\n" +
                cpu.toString() + "\n" +
                ram.toString() + "\n" +
                storage.toString() + "\n" +
                screen.toString() + "\n" +
                keyboard.toString();
        System.out.println(string);
    }
}
