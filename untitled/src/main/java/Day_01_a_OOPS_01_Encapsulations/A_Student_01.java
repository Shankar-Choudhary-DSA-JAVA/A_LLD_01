package Day_01_a_OOPS_01_Encapsulations;

public class A_Student_01 {

    String name;
    int age;
    String batch;
    String address;
    long mobile;


    public void changeBatch(String batchName){
//        this.batch=batchName; //or
        System.out.println(this.batch=batchName);
    }
    public long changeMobile(){
       return this.mobile=952141001L;
    }




}
