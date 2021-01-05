package homeworkJava.Third;

public class CalculatorWithMemoryDecorator8 implements ICalculator6{

    private final ICalculator6 calculator;

    public static double toMemory = 0;
    public static boolean isTaken = false;

    public CalculatorWithMemoryDecorator8(ICalculator6 calculator ){
        this.calculator = calculator;

    }

    public double addition(double firstNumber, double secondNumber){
        isTaken = false;
        putInMemory(calculator.addition(firstNumber, secondNumber));
        return  calculator.addition(firstNumber, secondNumber);

    }


    public double subtraction(double firstNumber, double secondNumber){
        isTaken = false;
        putInMemory(calculator.subtraction(firstNumber, secondNumber));
        return calculator.subtraction(firstNumber, secondNumber);
    }


    public double multiplication(double firstNumber, double secondNumber){
        isTaken = false;
        putInMemory(calculator.multiplication(firstNumber, secondNumber));
        return calculator.multiplication(firstNumber, secondNumber);
    }


    public double divide(double firstNumber, double secondNumber){
        isTaken = false;
       putInMemory(calculator.divide(firstNumber, secondNumber));
       return calculator.divide(firstNumber, secondNumber);
    }

    public double elevation(double number, int stepen){
        isTaken = false;
        putInMemory(calculator.elevation(number, stepen));
        return  calculator.elevation(number, stepen);
    }


    public  double modulo(double number){
        isTaken = false;
        putInMemory(calculator.modulo(number));
        return calculator.modulo(number);
    }

    public double sqrtNumber(double number){// на дробных числах зависает
        isTaken = false;
        putInMemory(calculator.sqrtNumber(number));
        return  calculator.sqrtNumber(number);
    }

    public static void putInMemory(double numberInMemory){
       toMemory = numberInMemory;

    }

    public static double getFromMemory(){
        if(!isTaken){
            isTaken = true;
            return toMemory;
        }
        else{
            toMemory = 0;
            System.out.println("Последнее сообщение в памяти очищено");
            return toMemory;
        }


    }
    public ICalculator6 getCalculator(){
        return calculator;
    }
}
