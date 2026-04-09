package Day_07_Builder_DP_02;

import Day_07_Builder_DP_01.UserExamParameters;

import java.security.InvalidParameterException;

public class A_UserExam {
    private int englishMarks;
    private int mathsMarks;
    private int scienceMarks;
    private String name;

    public int getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }

    public int getMathsMarks() {
        if(mathsMarks > 100){
            throw  new InvalidParameterException("marks > 100");
        }
        return mathsMarks;
    }

    public void setMathsMarks(int mathsMarks) {
        this.mathsMarks = mathsMarks;
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public A_UserExam(UserExamParameters userExamParameters){

      if(userExamParameters.englishMarks > 100
      || userExamParameters.mathsMarks > 100
      || userExamParameters.scienceMarks > 100){
          throw  new InvalidParameterException("Marks > 100");
      }
if(userExamParameters.name.startsWith("0")){
    throw new InvalidParameterException("Name cant start with Digits");
}

this.englishMarks= userExamParameters.englishMarks;
this.name= userExamParameters.name;
this.mathsMarks=userExamParameters.mathsMarks;
this.scienceMarks=userExamParameters.scienceMarks;
  }
}
