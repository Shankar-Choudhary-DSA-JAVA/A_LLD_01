package Day_10_Structural_Decorator_DP_05;
// Decorator DP
public class Main {
    public static void main(String[] args) {

        // Step 1: Start with Cone
        IceCreamCone iceCream = new RedCone();//10



        // Step 2: Add scoops (decorate)
 //       iceCream = new VanillaScoop(iceCream);
//        iceCream = new ChocolateScoop(iceCream);
//        iceCream = new ButterscotchScoop(iceCream);


        //or
        IceCreamCone iceCream1 = new VanillaScoop(iceCream);


        // Final Output
//        System.out.println("Constituents: " + iceCream.getConstituents());
//        System.out.println("Total Cost: " + iceCream.getCost());//10
        System.out.println("Constituents: " + iceCream1.getConstituents());
        System.out.println("Total Cost: " + iceCream1.getCost());//10+20

    }
}