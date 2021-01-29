public class InsuranceStrategy {
    int getConstant() {
        return 105600;
    }

    double getWeight() {
        return 0.02;
    }

    int getAdjustment() {
        return 60000;
    }

    double calculateInsuranceVeryHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }
}
