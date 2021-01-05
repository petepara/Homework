package homeworkJava.Third;

public class CalculatorWithOperatorMain2 {
    public static void main(String[] args) {
        // 4.1 + 15 * 7 + (28 / 5) ^ 2
        double a = 4.1, result;
        double  b = 15, o = 7, c = 5, q = 28;
        int elev = 2;

        CalculatorWithOperator2 calcWMO = new CalculatorWithOperator2();

        double f = calcWMO.divide(q , c);
        System.out.println("28/5 = " + f);

       //TODO:сделать округление красивое

        double f2 = calcWMO.elevation(f,elev);
        System.out.println(f + " ^ 2 = " + f2);

        double multi = calcWMO.multiplication(b,o);
        System.out.println("15 * 7 = " + multi);

        result = calcWMO.addition(calcWMO.addition(a,multi), f2);
        System.out.println(a + " + " + multi + " + " + f2 + " = " + result);

    }
}
