package Day_09_Factory_DP_05;


//Step 2 :- Create Concrete classes
public class NewTaxReime implements TaxAlgorithm {


    @Override
    public double caluclateTax(SalaryDetails salaryDetails) {
        return 0.4 * salaryDetails.getBasePay() + 0.3 * salaryDetails.getHra() + 0.2*salaryDetails.getLta();


    }
}
