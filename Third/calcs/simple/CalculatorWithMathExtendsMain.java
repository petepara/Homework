package homeworkJava.Third.calcs.simple;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {

        double a = 4.1, result;
        double  b = 15, o = 7, c = 5, q = 28;
        int elev = 2;


        CalculatorWithMathExtends calcWME = new CalculatorWithMathExtends();
        double f = calcWME.divide(q,c);
        System.out.println("28/5 = " + f);

        //TODO:сделать округление красивое

        double f2 = calcWME.elevation(f,elev);
        System.out.println(f + " ^ 2 = " + f2);

        double multi = calcWME.multiplication(b,o);
        System.out.println("15 * 7 = " + multi);

        result = calcWME.addition(calcWME.addition(a,multi), f2);
        System.out.println(a + " + " + multi + " + " + f2 + " = " + result);

    }
}
