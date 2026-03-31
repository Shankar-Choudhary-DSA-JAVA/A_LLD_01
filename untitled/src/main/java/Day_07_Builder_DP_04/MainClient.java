package Day_07_Builder_DP_04;


public class MainClient {
    public static void main(String[] args) {
        //M1
        UserExam userExam;
        try {
             userExam = UserExam.getBuilder()
                    .setName("Naman")
                    .setEnglishMarks(100)
                    .setScienceMarks(90)
                    .build();




        } catch (Exception e) {
            System.out.println("Some parameters are wrong");
        }
    }
}
