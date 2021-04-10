package homeworkJava.Third.calcs.simple;

import homeworkJava.Third.calcs.additional.ICalculator6;

public class CalculatorWithMathCopy implements ICalculator6 {
    public double addition(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double subtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public double multiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divide(double firstNumber, double secondNumber){
        return firstNumber / secondNumber;
    }

    public  double elevation(double number, int stepen) {
        return Math.pow(number,stepen);
    }

    public double modulo(double number){
        return Math.abs(number);
    }

    public double sqrtNumber(double number){
        return Math.sqrt(number);
    }


}
