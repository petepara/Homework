package homeworkJava.Third.calcs.additional;

import homeworkJava.Third.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        // 4.1 + 15 * 7 + (28 / 5) ^ 2
        //В мэйне запрещается использование переменных для хранения значений участвующих в просчёте, а также результатов работы методов калькулятора
        double a = 4.1, result;
        double  b = 15, o = 7, c = 5, q = 28;
        int elev = 2;


       CalculatorWithMemory calcWMO = new CalculatorWithMemory(new CalculatorWithMathCopy());

        CalculatorWithMemory.putInMemory(calcWMO.divide(28,5));

        CalculatorWithMemory.putInMemory(calcWMO.elevation(CalculatorWithMemory.getFromMemory(),2));

        CalculatorWithMemory.putInMemory(calcWMO.addition(CalculatorWithMemory.getFromMemory(),calcWMO.multiplication(15,7)));

        CalculatorWithMemory.putInMemory(calcWMO.addition(CalculatorWithMemory.getFromMemory(),4.1));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + CalculatorWithMemory.getFromMemory());


//        double f = calcWMO.divide(q , c);
//        System.out.println("28/5 = " + f);
//
//
//        double f2 = calcWMO.elevation(f,elev);
//        System.out.println(f + " ^ 2 = " + f2);
//
//        System.out.println("15 * 7 = " + multi);
//
//        result = calcWMO.addition(calcWMO.addition(a,multi), f2);
//        System.out.println(calcWMO.divide(28,5));
    }
}
