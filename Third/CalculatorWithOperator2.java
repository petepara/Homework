package homeworkJava.Third;

public class CalculatorWithOperator2 implements ICalculator6 {

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

    public double sqrtNumber(double number) // на дробных числах зависает
    {
        double minNumber=0;
        double maxNumber=number;
        double temp=0;
        int count = 10;

        while(temp*temp!=number || count>0)
        {
            temp=(minNumber+maxNumber)/2;

            if(temp*temp > number){
                maxNumber = temp;
            }
            else{
                minNumber = temp;
            }
            count--;
        }

        return temp;
    }


}


