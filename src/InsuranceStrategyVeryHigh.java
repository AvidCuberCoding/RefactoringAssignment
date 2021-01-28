public class InsuranceStrategyVeryHigh extends InsuranceStrategy {

    @Override
    int getConstant() {
        return 105600;
    }

    @Override
    double getWeight() {
        return 0.02;
    }

    @Override
    public int getAdjustment() {
        return 60000;
    }
}