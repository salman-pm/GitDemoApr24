public class InterestCalculator {
    public static double calculate(double principal, int noOfYears, double interestRate){
        return (principal * noOfYears * interestRate) / 100;
    }
}
