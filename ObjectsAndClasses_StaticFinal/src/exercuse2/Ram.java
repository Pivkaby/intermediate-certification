package exercuse2;

public class Ram {
    private final RamType type;
    private final int volume;
    private final double weight;

    public Ram(RamType typeOf, int volume, double weight) {
        this.type = typeOf;
        this.volume = volume;
        this.weight = weight;
    }

    public RamType getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        String string = "";
        string = "Оперативная память:" + "\n" +
                "Тип: " + type + "\n" +
                "Объем: " + volume + "Гб" + "\n" +
                "Вес: " + weight + " Кг" + "\n";
        return string;
    }
}
