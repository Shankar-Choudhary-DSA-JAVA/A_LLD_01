package b_OOPS_02_Inheritance_01;

public class Instructor extends  A_User{
    private String assignedBatch;
    private String description;

    public String getAssignedBatch() {
        this.setName("Pankaj");
        return assignedBatch;
    }

    public void setAssignedBatch(String assignedBatch) {
        this.assignedBatch = assignedBatch;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
