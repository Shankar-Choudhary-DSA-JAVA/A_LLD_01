package Day_09_Factory_DP_005;

//Wrong way
public class SalaryDetails {

    private Double basePay;
    private Double hra;
    private  Double lta;

    public SalaryDetails(Double basePay, Double hra, Double lta) {
        this.basePay = basePay;
        this.hra = hra;
        this.lta = lta;
    }

    public SalaryDetails(Double basePay, Double hra) {
        this.basePay = basePay;
        this.hra = hra;
    }

    public Double getBasePay() {
        return basePay;
    }

    public Double getHra() {
        return hra;
    }

    public Double getLta() {
        return lta;
    }
}
