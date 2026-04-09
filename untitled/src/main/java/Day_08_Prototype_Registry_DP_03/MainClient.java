package Day_08_Prototype_Registry_DP_03;

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

          if (parent instanceof Bird){
              children.add(new Bird(parent));
          }

            children.add(parent.clone());
        }

        for(Bird child : children){
            child.setName("it is a copy..");
        }
        System.out.println("Done..");

       //BirdRegistry
        Sparrow longLegSparrow = new Sparrow();
        longLegSparrow.setLegSize("100");

Crow sweetSoundCrow = new Crow();
sweetSoundCrow.setSound("Kookoo");

//Now store these special birds in to birds registry

        BirdRegistry birdRegistry = new BirdRegistry();
        birdRegistry.registerBird("Sweet Sound Bird", sweetSoundCrow);
        birdRegistry.registerBird("Long legged Sparrow ", longLegSparrow);

        List<String> getBirdList = List.of(
                "Sweet Sound Bird",
                "Long legged Sparrow ",
                "Sweet Sound Bird"
        );

List<Bird> requestedBirds = new ArrayList<>();

for(String type : getBirdList){
    requestedBirds.add(birdRegistry.getBird(type));
}
        System.out.println("Done1..");

    }
}
