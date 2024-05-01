package Loan;

public class NationalBank {
    private static final double FIXEDBANKREWARD = 0.01;
    private Calculator calculator;

    public NationalBank(){
        calculator = new Calculator();
    }

    public double calculateDeposit(double amount, int duration, String clientType){
        return calculator.depositReward(amount, duration, clientType) * FIXEDBANKREWARD;
    }
}
