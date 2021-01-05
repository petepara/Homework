package homeworkJava.Third;

public class CalculatorWithCounterInterface{
    private long counter = 0;

      private final ICalculator6 calculator;

    public CalculatorWithCounterInterface(ICalculator6 calculator ){
        this.calculator = calculator;
    }

    public double addition(double firstNumber, double secondNumber){
        this.counter++;
        return  this.calculator.addition(firstNumber, secondNumber);
    }


    public double subtraction(double firstNumber, double secondNumber){
        this.counter++;
        return  this.calculator.subtraction(firstNumber, secondNumber);
    }


    public double multiplication(double firstNumber, double secondNumber){
        this.counter++;
        return  this.calculator.multiplication(firstNumber, secondNumber);
    }


    public double divide(double firstNumber, double secondNumber){
        this.counter++;
        return  this.calculator.divide(firstNumber, secondNumber);
    }

    public double elevation(double number, int stepen){
        this.counter++;
        return  this.calculator.elevation(number, stepen);
    }


    public  double modulo(double number){
        this.counter++;
        return  this.calculator.modulo(number);
    }

    public double sqrtNumber(double number){// на дробных числах зависает
        this.counter++;
        return  this.calculator.sqrtNumber(number);
    }

    public long getCountOperation(){
       return counter;
    }


}
