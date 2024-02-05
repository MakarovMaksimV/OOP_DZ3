package drugstore;

public abstract class Component implements Comparable<Component> {
    private String title;
    private Double weight;
    private int power;

    public Component(String title, Double weight, int power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return String.format("Title = %s, power = %s, weigth = %s", title, power, weight);
    }

    @Override
    public int compareTo(Component o) {
        return this.power - o.power;
    }
}
