package Day_08_Prototype_DP_01;

public class Bird implements Cloneable<Bird>{
//Here we pass Bird in place of K
private String name;
private  String colour;
private int weight;

public Bird(){}
public Bird(Bird old){
    this.name=old.name;
    this.weight=old.weight;
    this.colour=old.colour;
}

//M1 :_ To create object copy
// But this is having problem as i have to copy parent classes attributes as well
//This solution only works when the class which i am cloning should be the only parent class
    //and it does not extending any class
//    @Override
//    public Bird clone() {
//    Bird copy = new Bird();
//        copy.name=this.name;
//        copy.weight=this.weight;
//        copy.colour=this.colour;
//
//        return copy;
//    }


    //M2 :_ To create object copy

    @Override
    public Bird clone() {
       return new Bird(this);
    }
}
