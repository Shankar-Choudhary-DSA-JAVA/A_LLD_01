package Day_10_Structural_Decorator_DP_04;
// Decorator DP

public class Main {
    public static void main(String[] args) {

        // Start with plain pizza
        Pizza pizza = new PlainPizza();

        // Add layers (decorate)
        pizza = new ThinCrust(pizza);
//        pizza = new Cheese(pizza);
//        pizza = new Tomato(pizza);
//        pizza = new Paneer(pizza);

        // Final result
        System.out.println("Description: " + pizza.getDescription());
        System.out.println("Total Cost: " + pizza.getCost());
    }
}