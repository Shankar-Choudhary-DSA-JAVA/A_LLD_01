package e_Interfaces_01;

import java.util.List;

public class Z_Main_01 {
    public static void main(String[] args) {


        List<Hervibore> hervibores = List.of(
                new Human(),
                new Dog()
        );

        for (Hervibore h : hervibores) {
           h.eatPlants();
        }
        Hervibore h = new Human();
        PlantEaters p = new Human();
    }
}
