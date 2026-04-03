package Day_08_Prototype_Registry_DP_03;

public class Bird implements Cloneable<Bird> {
//Here we pass Bird in place of K
private String name;
private  String colour;
private int weight;

    public void setName(String name) {
        this.name = name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Bird(){}
public Bird(Bird old){
    this.name=old.name;
    this.weight=old.weight;
    this.colour=old.colour;
}

    //M2 :_ To create object copy
    @Override
    public Bird clone() {

    return new Bird(this);
    }
}
