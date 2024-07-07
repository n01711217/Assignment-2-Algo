// PCSetup.java
import java.util.ArrayList;
import java.util.List;

public class PCSetup {
    private List<PCComponent> components;
    private String caseSize;
    private boolean rgbLighting;
    private boolean liquidCooling;

    // Constructor to initialize the PC setup with case size, RGB lighting, and liquid cooling options
    public PCSetup(String caseSize, boolean rgbLighting, boolean liquidCooling) {
        this.components = new ArrayList<>();
        this.caseSize = caseSize;
        this.rgbLighting = rgbLighting;
        this.liquidCooling = liquidCooling;
    }

    // Method to add a component to the PC setup
    public void addComponent(PCComponent component) {
        components.add(component);
    }

    // Method to calculate the total cost of the PC setup
    public double calculateTotalCost() {
        double totalCost = 0;

        // Add the price of each component to the total cost
        for (PCComponent component : components) {
            totalCost += component.getPrice();
        }

        // Add cost based on case size
        switch (caseSize.toLowerCase()) {
            case "small":
                totalCost += 50;
                break;
            case "medium":
                totalCost += 75;
                break;
            case "large":
                totalCost += 100;
                break;
        }

        // Add cost for RGB lighting
        if (rgbLighting) {
            totalCost += 50;
        }

        // Add cost for liquid cooling
        if (liquidCooling) {
            totalCost += 150;
        }

        return totalCost;
    }

    // Method to display the PC setup details and total cost
    public void displaySetup() {
        System.out.println("PC Setup:");
        for (PCComponent component : components) {
            System.out.println("- " + component.getName() + ": $" + component.getPrice());
        }
        System.out.println("Case Size: " + caseSize);
        System.out.println("RGB Lighting: " + (rgbLighting ? "Yes" : "No"));
        System.out.println("Liquid Cooling: " + (liquidCooling ? "Yes" : "No"));
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}
