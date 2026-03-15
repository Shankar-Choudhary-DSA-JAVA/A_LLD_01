package a_OOPS_01_Encapsulations;

public class B_Student_04 {
    public B_Student_04(String name, int age, String batch, String address, long mobile) {
        this.name = name;
        this.age = age;
        this.batch = batch;
        this.address = address;
        this.mobile = mobile;
    }

    public B_Student_04(String name) {
        this.name = name;
    }

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
