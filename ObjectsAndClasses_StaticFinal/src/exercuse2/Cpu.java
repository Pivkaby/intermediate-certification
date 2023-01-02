package exercuse2;

public class Cpu {
    private final int frequency;
    private final int numberOfCores;
    private final String manufacturer;
    private final double weight;

    public Cpu(int frequency, int numberOfCores, String manufacturer, double weight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        String string = "";
        string = "Процессор:" + "\n" +
                "Частота: " + frequency + " ГГц" + "\n" +
                "Ядер: " + numberOfCores + "\n" +
                "Производитель: " + manufacturer + "\n" +
                "Вес: " + weight + " Кг" + "\n";
        return string;
    }
}
