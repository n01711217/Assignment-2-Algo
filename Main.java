// Main.java
public class Main {
    public static void main(String[] args) {
        // Setup 1 configuration
        PCSetup setup1 = new PCSetup("medium", true, false);
        setup1.addComponent(new CPU("Intel Core i7", 300));
        setup1.addComponent(new GPU("NVIDIA RTX 3080", 700));
        setup1.addComponent(new RAM("16GB DDR4", 100));
        setup1.addComponent(new Storage("1TB SSD", 150));
        
        // Display setup 1 details
        System.out.println("Setup 1:");
        setup1.displaySetup();
        
        System.out.println();

        // Setup 2 configuration
        PCSetup setup2 = new PCSetup("large", true, true);
        setup2.addComponent(new CPU("AMD Ryzen 9", 400));
        setup2.addComponent(new GPU("NVIDIA RTX 3090", 1500));
        setup2.addComponent(new RAM("32GB DDR4", 200));
        setup2.addComponent(new Storage("2TB SSD", 300));
        
        // Display setup 2 details
        System.out.println("Setup 2:");
        setup2.displaySetup();
    }
}
