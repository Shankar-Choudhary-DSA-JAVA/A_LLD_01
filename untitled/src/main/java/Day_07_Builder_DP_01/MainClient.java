package Day_07_Builder_DP_01;

public class MainClient {
    public static void main(String[] args) {

        UserExamParameters parameters = new UserExamParameters();
        parameters.englishMarks=900;
        parameters.name="Shankar";

        //M1
       // A_UserExam userExam = new A_UserExam(parameters);

        //M2
        A_UserExam userExam1;
        try {
            userExam1 = new A_UserExam(parameters);
        }catch (Exception e){
            System.out.println("Some parameters are wrong");
        }
    }
}
