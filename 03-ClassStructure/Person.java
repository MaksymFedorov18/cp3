public class Person {
    private String name;
    private Double weight;
    private Double height;

    // Constructor with only name
    public Person(String name) {
        this.name = name;
        this.weight = null;
        this.height = null;
    }

    // Constructor with name, weight, and height
    public Person(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getHeight() {
        return height;
    }

    public String toString() {
        return "Person{name='" + name + "', weight=" + weight + ", height=" + height + "}";
    }
}
