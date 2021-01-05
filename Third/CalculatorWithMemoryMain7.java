package homeworkJava.Third;

public class CalculatorWithMemoryMain7 {
    public static void main(String[] args) {
        // 4.1 + 15 * 7 + (28 / 5) ^ 2
        //В мэйне запрещается использование переменных для хранения значений участвующих в просчёте, а также результатов работы методов калькулятора
     //   double a = 4.1, result;
       // double  b = 15, o = 7, c = 5, q = 28;
      //  int elev = 2;


       CalculatorWithMemory7 calcWMO = new CalculatorWithMemory7(new CalculatorWithMathCopy3());

        CalculatorWithMemory7.putInMemory(calcWMO.divide(28,5));

        CalculatorWithMemory7.putInMemory(calcWMO.elevation(CalculatorWithMemory7.getFromMemory(),2));

        CalculatorWithMemory7.putInMemory(calcWMO.addition(CalculatorWithMemory7.getFromMemory(),calcWMO.multiplication(15,7)));

        CalculatorWithMemory7.putInMemory(calcWMO.addition(CalculatorWithMemory7.getFromMemory(),4.1));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + CalculatorWithMemory7.getFromMemory());
      //  CalculatorWithMemory.putInMemory();

       // double f = calcWMO.divide(q , c);
       // System.out.println("28/5 = " + f);

        //TODO:сделать округление красивое

      //  double f2 = calcWMO.elevation(f,elev);
      //  System.out.println(f + " ^ 2 = " + f2);

//        System.out.println("15 * 7 = " + multi);

      //  result = calcWMO.addition(calcWMO.addition(a,multi), f2);
       // System.out.println(calcWMO.divide(28,5));
    }
}
