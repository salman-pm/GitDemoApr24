public class Main {
    public static void main(String[] args) {
        System.out.println("I am Main method");
        System.out.println("Add 1 and 2 : " + Calculator.add(1, 2));
        System.out.println("Calculate Interest: " + InterestCalculator.calculate(1000000, 10, 8));
        System.out.println("SIP: " + SIPCalculator.calculate(8000, 15, 18));
    }
}
