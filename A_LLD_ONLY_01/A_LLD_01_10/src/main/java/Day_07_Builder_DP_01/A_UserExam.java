package Day_07_Builder_DP_01;

import Day_03_d_OOPS_PolyMorphism_04.User;

import java.security.InvalidParameterException;

public class A_UserExam {
    private int englishMarks;
    private int mathsMarks;
    private int scienceMarks;
    private String name;

  public A_UserExam(UserExamParameters userExamParameters){

      if(userExamParameters.englishMarks > 100
      || userExamParameters.mathsMarks > 100
      || userExamParameters.scienceMarks > 100){
          throw  new InvalidParameterException("Marks > 100");
      }
if(userExamParameters.name.startsWith("0")){
    throw new InvalidParameterException("Name cant start with Digits");
}

if((userExamParameters.englishMarks + userExamParameters.scienceMarks) > 200){
    throw new InvalidParameterException("Marks > 100");
}

this.englishMarks= userExamParameters.englishMarks;
this.name= userExamParameters.name;
this.mathsMarks=userExamParameters.mathsMarks;
this.scienceMarks=userExamParameters.scienceMarks;
  }
}
