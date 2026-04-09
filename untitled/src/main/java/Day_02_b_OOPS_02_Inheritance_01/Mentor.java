package Day_02_b_OOPS_02_Inheritance_01;

import java.util.List;

public class Mentor extends A_User{
    private List<Student> mentees;
    private String description;

    public List<Student> getMentess(){
        return mentees;
    }
    public void setMentees(List<Student> mentees){
        this.mentees=mentees;
    }

    public  void setDescription(String description){
        this.description=description;
    }

    public String getDescription(){
        return description;
    }
}
