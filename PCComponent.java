// PCComponent.java
public abstract class PCComponent {
    private String name;
    private double price;

    // Constructor to initialize the component's name and price
    public PCComponent(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter for the component's name
    public String getName() {
        return name;
    }

    // Getter for the component's price
    public double getPrice() {
        return price;
    }
}
