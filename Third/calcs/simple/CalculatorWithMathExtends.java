package homeworkJava.Third.calcs.simple;

import homeworkJava.Third.calcs.additional.ICalculator6;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator6 {
    @Override
    public double elevation(double number, int stepen) {
        return Math.pow(number,stepen);
    }

    @Override
    public double modulo(double number) {
        return Math.abs(number);
    }

    @Override
    public double sqrtNumber(double number) {
        return Math.sqrt(number);
    }


}
