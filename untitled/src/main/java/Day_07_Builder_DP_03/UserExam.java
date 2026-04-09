package Day_07_Builder_DP_03;

import java.security.InvalidParameterException;

public class UserExam {
    private int englishMarks;
    private int mathsMarks;
    private int scienceMarks;
    private String name;

    private  UserExam(){

    }

    public static UserExamBuilder getBuilder(){
        return new UserExamBuilder();
    }


    public static class UserExamBuilder {

        private int englishMarks;
        private int mathsMarks;
        private int scienceMarks;
        private String name;

        public void setEnglishMarks(int englishMarks) {
            this.englishMarks = englishMarks;
        }

        public void setMathsMarks(int mathsMarks) {
            this.mathsMarks = mathsMarks;
        }

        public void setScienceMarks(int scienceMarks) {
            this.scienceMarks = scienceMarks;
        }

        public void setName(String name) {
            this.name = name;
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
