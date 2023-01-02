package exercuse2;

public class Storage {
    private final StorageType type;
    private final int memorySize;
    private final double weight;

    public Storage(StorageType type, int memorySize, double weight) {
        this.type = type;
        this.memorySize = memorySize;
        this.weight = weight;
    }

    public StorageType getType() {
        return type;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        String string = "";
        string = "Накопитель информации:" + "\n" +
                "Тип: " + type + "\n" +
                "Объем памяти: " + memorySize + "Гб" + "\n" +
                "Вес: " + weight + " Кг" + "\n";
        return string;
    }
}
