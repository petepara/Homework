package homeworkJava.Third.calcs.simple;

import homeworkJava.Third.calcs.additional.ICalculator6;

public class CalculatorWithOperator implements ICalculator6 {

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

    public double elevation(double number, int stepen) {
        double result = 1;
        for (int i = 0; i < stepen; i++) {
            result *= number;
        }
        return result;
    }
    public  double modulo(double number){
        double numberModul = number;
        if(numberModul<0){
            numberModul *=-1;
        }
        return numberModul;
    }
    public double sqrtNumber(double number)
    {
        return Math.sqrt(number);
    }


}


