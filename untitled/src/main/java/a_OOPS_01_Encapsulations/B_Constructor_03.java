package a_OOPS_01_Encapsulations;

public class B_Constructor_03 {

        int id;
        String name;
        double marks;

    @Override
    public String toString() {
        return "B_Constructor_03{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    B_Constructor_03(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public static void main(String[] args) {

            B_Constructor_03 s = new B_Constructor_03(101, "Shankar");
            //Without toString
            //System.out.println(s);//a_OOPS_01_Encapsulations.B_Constructor_03@7c30a502
            System.out.println(s.toString());//or System.out.println(s);

            System.out.println(s.id);
            System.out.println(s.name);
            System.out.println(s.marks);
    }
}
