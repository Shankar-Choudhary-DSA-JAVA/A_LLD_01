package Day_08_Prototype_DP_02;

public class Crow extends Bird {

    private String sound = "kaw kaw";

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Crow(){

    }

    //using copy constructors :- correct approach
    public Crow(Crow old) { // this is copy constructors
        //this is parent class values
        super(old);
        this.sound=old.sound;
    }


    //M2 :-
    @Override
    public Crow clone(){

        return  new Crow(this);
    }




}
