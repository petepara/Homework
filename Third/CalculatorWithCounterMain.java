package homeworkJava.Third;

public class CalculatorWithCounterMain {
    public static void main(String[] args) {
        CalculatorWithOperator calcWO1 = new CalculatorWithOperator();
        CalculatorWithCounter calcWC = new CalculatorWithCounter(calcWO1);

        // 4.1 + 15 * 7 + (28 / 5) ^ 2
        double a = 4.1, result;
        double  b = 15, o = 7, c = 5, q = 28;
        int elev = 2;


        double f = calcWC.divide(q, c);
        System.out.println("28/5 = " + f);

        // TODO:сделать округление правильное

        double f2 = calcWC.elevation(f,elev);
        System.out.println(f + " ^ 2 = " + f2);

        double multi = calcWC.multiplication(b,o);
        System.out.println("15 * 7 = " + multi);

        result = calcWC.addition(calcWC.addition(a,multi), f2);
        System.out.println(a + " + " + multi + " + " + f2 + " = " + result);
        System.out.println("Counter = " + CalculatorWithCounter.getCountOperation());

    }
}

