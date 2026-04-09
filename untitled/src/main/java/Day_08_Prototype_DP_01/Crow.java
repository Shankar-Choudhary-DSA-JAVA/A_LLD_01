package Day_08_Prototype_DP_01;

public class Crow extends  Bird{

    private String sound = "kaw kaw";

    public Crow(){

    }

    //using copy constructors :- correct approach
    public Crow(Crow old) { // this is copy constructors
        //this is parent class values
        super(old);
        this.sound=old.sound;
    }
//    @Override
//    public Bird clone(){
//        return super.clone();
//    }

    //M2 :-
//here return type can be Crow as well as Crow
// is also a Bird
    @Override
    public Crow clone(){
        return  new Crow(this);
    }

    //M1 :- Wrong approach
    // As here I did not created clone of Crow
    // as parent attributes didn't copied
//    @Override
//    public Crow clone(){
//    Crow copy = new Crow();
//        copy.sound=this.sound;
//        return  copy;
//    }

    //M3 :- Wrong approach
//    @Override
//    public Crow clone(){
//        Bird parent =super.clone();
//        //Here how can we caste bird to a crow
//        //So this is also wrong
//        return  parent;
//    }


}
