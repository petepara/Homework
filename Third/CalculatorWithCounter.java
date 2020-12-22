package homeworkJava.Third;

public class CalculatorWithCounter {
    private static long counter = 0;

    CalculatorWithOperator calcWO;
    CalculatorWithMathCopy calcWMC;
    CalculatorWithMathExtends calcWME;

    public CalculatorWithCounter(CalculatorWithOperator calcWO) {
        this.calcWO = calcWO;

    }

    public CalculatorWithCounter(CalculatorWithMathCopy calcWMC){
        this.calcWMC = calcWMC;

    }
    public CalculatorWithCounter(CalculatorWithMathExtends calcWME){
        this.calcWME = calcWME;

    }

    public double addition(double firstNumber, double secondNumber) {
        counter++;
        if(calcWO!=null) {
            return calcWO.addition(firstNumber, secondNumber);
        }else if (calcWMC!=null){
            return calcWMC.addition(firstNumber, secondNumber);
        }
        else{
            return calcWME.addition(firstNumber, secondNumber);
        }
    }


    public double subtraction(double firstNumber, double secondNumber) {
        counter++;
        if(calcWO!=null) {
            return calcWO.subtraction(firstNumber, secondNumber);
        }else if (calcWMC!=null){
            return calcWMC.subtraction(firstNumber, secondNumber);
        }
        else{
            return calcWME.subtraction(firstNumber, secondNumber);
        }
    }


    public double multiplication(double firstNumber, double secondNumber) {
        counter++;
        if(calcWO!=null) {
            return calcWO.multiplication(firstNumber, secondNumber);
        }else if (calcWMC!=null){
            return calcWMC.multiplication(firstNumber, secondNumber);
        }
        else{
            return calcWME.multiplication(firstNumber, secondNumber);
        }
    }


    public double divide(double firstNumber, double secondNumber){
        counter++;
        if(calcWO!=null) {
            return calcWO.divide(firstNumber, secondNumber);
        }else if (calcWMC!=null){
            return calcWMC.divide(firstNumber, secondNumber);
        }
        else{
            return calcWME.divide(firstNumber, secondNumber);
        }
    }

    public double elevation(double number, int stepen) {
        counter++;
        if(calcWO!=null) {
            return calcWO.elevation(number,stepen);
        }else if (calcWMC!=null){
            return calcWMC.elevation(number, stepen);
        }
        else{
            return calcWME.elevation(number, stepen);
        }
    }


    public  double modulo(double number){
        counter++;
        if(calcWO!=null) {
            return calcWO.modulo(number);
        }else if (calcWMC!=null){
            return calcWMC.modulo(number);
        }
        else{
            return calcWME.modulo(number);
        }
    }

    public double sqrtNumber(double number) // на дробных числах зависает
    {
        counter++;
        if(calcWO!=null) {
            return calcWO.sqrtNumber(number);
        }else if (calcWMC!=null){
            return calcWMC.sqrtNumber(number);
        }
        else{
            return calcWME.sqrtNumber(number);
        }
    }


    public static long getCountOperation(){

       return counter;
    }


}
