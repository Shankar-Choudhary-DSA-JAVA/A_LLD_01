package Day_07_Builder_DP_03;

import Day_07_Builder_DP_01.A_UserExam;
import Day_07_Builder_DP_01.UserExamParameters;

public class MainClient {
    public static void main(String[] args) {
        //M1
        UserExam userExam;
        try {
            UserExam.UserExamBuilder userExamBuilder =UserExam.getBuilder();

            userExamBuilder.setName("Naman");
            userExamBuilder.setEnglishMarks(100);
            userExamBuilder.setScienceMarks(90);
            userExam=userExamBuilder.build();

        }catch (Exception e){
            System.out.println("Some parameters are wrong");
        }
    }
}
