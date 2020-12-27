package homeworkJava.Third;

public class CalculatorWithCounter {
    private long counter = 0;

    private final CalculatorWithOperator calcWO;
    private final CalculatorWithMathCopy calcWMC;
    private final CalculatorWithMathExtends calcWME;

    public CalculatorWithCounter(CalculatorWithOperator calcWO) {
        this.calcWO = calcWO;
        this.calcWMC = null;
        this.calcWME = null;
    }

    public CalculatorWithCounter(CalculatorWithMathCopy calcWMC){
        this.calcWO = null;
        this.calcWMC = calcWMC;
        this.calcWME = null;
    }

    public CalculatorWithCounter(CalculatorWithMathExtends calcWME){
        this.calcWO = null;
        this.calcWMC = null;
        this.calcWME = calcWME;
    }

    public double addition(double firstNumber, double secondNumber) {
        this.counter++;
        if(this.calcWO!=null) {
            return this.calcWO.addition(firstNumber, secondNumber);
        }else if (this.calcWMC!=null){
            return this.calcWMC.addition(firstNumber, secondNumber);
        }
        else{
            return this.calcWME.addition(firstNumber, secondNumber);
        }
    }


    public double subtraction(double firstNumber, double secondNumber) {
        this.counter++;
        if(this.calcWO!=null) {
            return this.calcWO.subtraction(firstNumber, secondNumber);
        }else if (this.calcWMC!=null){
            return this.calcWMC.subtraction(firstNumber, secondNumber);
        }
        else{
            return this.calcWME.subtraction(firstNumber, secondNumber);
        }
    }


    public double multiplication(double firstNumber, double secondNumber) {
        this.counter++;
        if(this.calcWO!=null) {
            return this.calcWO.multiplication(firstNumber, secondNumber);
        }else if (this.calcWMC!=null){
            return this.calcWMC.multiplication(firstNumber, secondNumber);
        }
        else{
            return this.calcWME.multiplication(firstNumber, secondNumber);
        }
    }


    public double divide(double firstNumber, double secondNumber){
        this.counter++;
        if(this.calcWO!=null) {
            return this.calcWO.divide(firstNumber, secondNumber);
        }else if (this.calcWMC!=null){
            return this.calcWMC.divide(firstNumber, secondNumber);
        }
        else{
            return this.calcWME.divide(firstNumber, secondNumber);
        }
    }

    public double elevation(double number, int stepen) {
        this.counter++;
        if(this.calcWO!=null) {
            return this.calcWO.elevation(number,stepen);
        }else if (this.calcWMC!=null){
            return this.calcWMC.elevation(number, stepen);
        }
        else{
            return this.calcWME.elevation(number, stepen);
        }
    }


    public  double modulo(double number){
        this.counter++;
        if(this.calcWO!=null) {
            return this.calcWO.modulo(number);
        }else if (this.calcWMC!=null){
            return this.calcWMC.modulo(number);
        }
        else{
            return this.calcWME.modulo(number);
        }
    }

    public double sqrtNumber(double number) // на дробных числах зависает
    {
        this.counter++;
        if(this.calcWO!=null) {
            return this.calcWO.sqrtNumber(number);
        }else if (this.calcWMC!=null){
            return this.calcWMC.sqrtNumber(number);
        }
        else{
            return this.calcWME.sqrtNumber(number);
        }
    }

    public  long getCountOperation(){

       return counter;
    }


}
