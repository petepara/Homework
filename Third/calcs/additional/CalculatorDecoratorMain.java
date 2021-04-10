package homeworkJava.Third.calcs.additional;

import homeworkJava.Third.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {

        ICalculator6 calc = new CalculatorWithMathExtends();
        ICalculator6 calc1 = new CalculatorWithMemoryDecorator(calc);
        ICalculator6 calc2 = new CalculatorWithCounterDecorator(calc1);
        ((CalculatorWithMemoryDecorator)calc1).putInMemory(calc2.divide(28,5));

        ((CalculatorWithMemoryDecorator)calc1).putInMemory(calc2.elevation( ((CalculatorWithMemoryDecorator)calc1).getFromMemory(),2));

        ((CalculatorWithMemoryDecorator)calc1).putInMemory(calc2.addition( ((CalculatorWithMemoryDecorator)calc1).getFromMemory(),calc2.multiplication(15,7)));

        ((CalculatorWithMemoryDecorator)calc1).putInMemory(calc2.addition( ((CalculatorWithMemoryDecorator)calc1).getFromMemory(),4.1));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " +  ((CalculatorWithMemoryDecorator)calc1).getFromMemory());
        System.out.println("Калькулятором воспользовались " + ((CalculatorWithCounterDecorator)calc2).getCountOperation() + " раз");
    }
}
