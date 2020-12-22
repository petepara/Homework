package homeworkJava.Third;

public class CalculatorWithCounterInterface{
    private static long counter = 0;

       ICalculator calculator;

    public CalculatorWithCounterInterface(ICalculator calculator ){
        this.calculator = calculator;

    }

    public double addition(double firstNumber, double secondNumber){
        counter++;
        return calculator.addition(firstNumber, secondNumber);

    }


    public double subtraction(double firstNumber, double secondNumber){
        counter++;
        return calculator.subtraction(firstNumber, secondNumber);
    }


    public double multiplication(double firstNumber, double secondNumber){
        counter++;
        return calculator.multiplication(firstNumber, secondNumber);
    }


    public double divide(double firstNumber, double secondNumber){
        counter++;
        return calculator.divide(firstNumber, secondNumber);
    }

    public double elevation(double number, int stepen){
        counter++;
        return calculator.elevation(number, stepen);
    }


    public  double modulo(double number){
        counter++;
        return calculator.modulo(number);
    }

    public double sqrtNumber(double number){// на дробных числах зависает
        counter++;
        return calculator.sqrtNumber(number);
    }

    public static long getCountOperation(){
       return counter;
    }


}
