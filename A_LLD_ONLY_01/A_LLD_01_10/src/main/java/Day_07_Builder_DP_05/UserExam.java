package Day_07_Builder_DP_05;

import java.security.InvalidParameterException;

public class UserExam {
    private int englishMarks;
    private int mathsMarks;
    private int scienceMarks;
    private String name;

    private UserExam(){

    }

    public static UserExamBuilder getBuilder(){

        return new UserExamBuilder();
    }


    public static class UserExamBuilder {

        private int englishMarks=90;
        private int mathsMarks=96;
        private int scienceMarks;
        private String name = "Shankar";

        public UserExamBuilder setEnglishMarks(int englishMarks) {

            this.englishMarks = englishMarks;
            return  this;
        }

        public UserExamBuilder setMathsMarks(int mathsMarks) {

            this.mathsMarks = mathsMarks;
            return this;
        }

        public UserExamBuilder setScienceMarks(int scienceMarks)
        {
            this.scienceMarks = scienceMarks;
            return this;
        }
//In the setter method we are returning the current UserExamBuilder class current objects
        public UserExamBuilder setName(String name) {
            this.name = name;
            return  this;// this is used to return current class object
        }

        public UserExam build() {
            //1. Validation of attributes
            if (englishMarks > 100
                    || mathsMarks > 100
                    || scienceMarks > 100) {
                throw new InvalidParameterException("Marks > 100");
            }
            if ((englishMarks + scienceMarks) > 200) {
                throw new InvalidParameterException("Marks > 100");
            }
            if (name.startsWith("0")) {
                throw new InvalidParameterException("Name cant start with Digits");
            }


            //2. Object creation of UserExam/Parent class in UserExamBuilder class
           //UserExamBuilder class is inside UserExam class

            UserExam userExam = new UserExam();
            userExam.englishMarks=this.englishMarks;
            userExam.scienceMarks=this.scienceMarks;
            userExam.mathsMarks=this.mathsMarks;
            userExam.name=this.name;
            return userExam;
        }
    }

}
