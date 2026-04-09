package Day_08_Prototype_DP_01;

import java.util.ArrayList;
import java.util.List;

public class MainClient {

    public static void main(String[] args) {

        List<Bird> birds = List.of(
                new Crow(),
                new Sparrow(),
                 new Crow(),
                new Bird()
        );

        List<Bird> children = new ArrayList<>();

        for(Bird parent : birds){
            children.add(parent.clone());
        }
        System.out.println("Done..");
    }
}
