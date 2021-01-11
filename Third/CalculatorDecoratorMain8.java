package homeworkJava.Third;

public class CalculatorDecoratorMain8 {
    public static void main(String[] args) {

        ICalculator6 calc = new CalculatorWithMathExtends4();
        ICalculator6 calc1 = new CalculatorWithMemoryDecorator8(calc);
        ICalculator6 calc2 = new CalculatorWithCounterDecorator8(calc1);
        ((CalculatorWithMemoryDecorator8)calc1).putInMemory(calc2.divide(28,5));

        ((CalculatorWithMemoryDecorator8)calc1).putInMemory(calc2.elevation( ((CalculatorWithMemoryDecorator8)calc1).getFromMemory(),2));

        ((CalculatorWithMemoryDecorator8)calc1).putInMemory(calc2.addition( ((CalculatorWithMemoryDecorator8)calc1).getFromMemory(),calc2.multiplication(15,7)));

        ((CalculatorWithMemoryDecorator8)calc1).putInMemory(calc2.addition( ((CalculatorWithMemoryDecorator8)calc1).getFromMemory(),4.1));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " +  ((CalculatorWithMemoryDecorator8)calc1).getFromMemory());
        System.out.println("Калькулятором воспользовались " + ((CalculatorWithCounterDecorator8)calc2).getCountOperation() + " раз");
    }
}
