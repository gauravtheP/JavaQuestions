package CollectionsAssignmentArrayList.Ques2;

/*
 * Created by gaurav on 25/6/17.
 */
public class Loan {
    private int LoanAmount, PeriodOfLoan;
    private double RateOfInterest;
    Loan(int LoanAmount, int PeriodOfLoan, double RateOfInterest){
        this.LoanAmount = LoanAmount;
        this.PeriodOfLoan = PeriodOfLoan;
        this. RateOfInterest = RateOfInterest;
    }
    public String toString(){
        return "LOAN DETAILS\n"+"Loan Amount: $"+LoanAmount+ "\nPeriod of Loan: "+PeriodOfLoan+"yrs"+"\nRate of Interest: "+RateOfInterest+"% Per Annum\n";
    }
}
