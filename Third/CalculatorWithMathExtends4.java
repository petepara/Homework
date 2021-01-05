package homeworkJava.Third;

public class CalculatorWithMathExtends4 extends CalculatorWithOperator2 implements ICalculator6 {
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
