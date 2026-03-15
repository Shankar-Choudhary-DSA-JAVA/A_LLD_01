package e_Interfaces_01;

public class Human extends A_Mammals implements Omnivore, PlantEaters{
    @Override
    public void eatPlants() {
        System.out.println("Human eats plants");
    }

    @Override
    public void eatAnimals() {
        System.out.println("Human eats animals");

    }


}
