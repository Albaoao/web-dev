package Loan;

public class SecondTierBank {
    private static final double FIXEDBANKREWARD = 0.02;
    private Calculator calculator;

    public SecondTierBank(){
        calculator = new Calculator();
    }

    public double calculateDeposit(double amount, int duration, String clientType){
        return calculator.depositReward(amount, duration, clientType) * FIXEDBANKREWARD;
    }
}

