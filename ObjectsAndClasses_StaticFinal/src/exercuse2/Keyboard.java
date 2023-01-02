package exercuse2;

public class Keyboard {
    private final KeyboardType type;
    private final boolean presenceIllumination;
    private final double weight;

    public Keyboard(KeyboardType type, boolean presenceIllumination, double weight) {
        this.type = type;
        this.presenceIllumination = presenceIllumination;
        this.weight = weight;
    }

    public KeyboardType getType() {
        return type;
    }

    public boolean isPresenceIllumination() {
        return presenceIllumination;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        String string = "";
        string = "Клавиатура:" + "\n" +
                "Тип: " + type + "\n" +
                "Подсветка: " + presenceIllumination + "\n" +
                "Вес: " + weight + " Кг" + "\n";
        return string;
    }
}
