package homeworkJava.Third;

public class CalculatorDecoratorMain8 {
    public static void main(String[] args) {
        ICalculator6 calcul = new CalculatorWithCounterDecorator8(new CalculatorWithMemoryDecorator8(new CalculatorWithMathExtends4()));

        // TODO: 27.12.2020 Разобраться как правильно сделать 
/*
        calcul.putInMemory(calcul.divide(28,5));

        calcul.putInMemory(calcul.elevation(calcul.getFromMemory(),2));

        calcul.putInMemory(calcul.addition(calcul.getFromMemory(),calcul.multiplication(15,7)));

        calcul.putInMemory(calcul.addition(calcul.getFromMemory(),4.1));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + calcul.getFromMemory());
        System.out.println("Калькулятором воспользовались " + calcul.getCountOperation() + " раз");*/
    }
}
