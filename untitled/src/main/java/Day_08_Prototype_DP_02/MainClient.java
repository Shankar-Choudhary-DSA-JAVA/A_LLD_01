package Day_08_Prototype_DP_02;
import java.util.ArrayList;
import java.util.List;

public class MainClient {

    public static void main(String[] args) {

        Bird bird1 = new Bird();
        bird1.setName("Naman");
        bird1.setColour("Pink");
         bird1.setWeight(2);

Sparrow sparrow1 = new Sparrow();
sparrow1.setColour("Black");
sparrow1.setLegSize("10");

Crow crow1 = new Crow();
crow1.setSound("Kaw kaw");
crow1.setWeight(2);

        List<Bird> birds = List.of(
               sparrow1,crow1,bird1
        );

        List<Bird> children = new ArrayList<>();

        for(Bird parent : birds){
            children.add(parent.clone());
        }
        System.out.println("Done..");
    }
}
