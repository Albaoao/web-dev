package Loan;

class Calculator {
    private static final double RATEFORLEGALENTITIES = 0.08;
    private static final double RATEFORINDIVIDUALS = 0.10;

    double depositReward(double amount, int duration, String clientType){
        if("individual".equals(clientType)){
            return amount + amount * RATEFORINDIVIDUALS * duration / 12.0;
        } else if ("legalEntity".equals(clientType)){
            return amount + amount * RATEFORLEGALENTITIES * duration / 12.0;
        } else {
            System.out.println("Invalid client type!");
            return 0;
        }
    }
}

