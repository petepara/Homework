package homeworkJava.First;

public class Homework21 {
    public static void main(String[] args) {
        int eight = 8, seven = 7, five = 5, two = 2 , three = 3, six = 6;
        int twelve = 12, twenty = 20, twentyTwo = 22, sixtyEight = 68, oneHNineteen = 119;
        int result = 0;
        boolean resultBoolean;
        // 2.1) 5 + 2 / 8
        result = five+two/eight;
        System.out.println(result);  // 1) 2/8 = 0, 2) 5+0=5

        // 2.2) (5 + 2) / 8
        result =(five+two)/eight;
        System.out.println(result); // 1) 5+2=7, 2) 7/8=0

        // 2.3) (5 + 2++) / 8
        result =(five+two++)/eight;
        System.out.println(result); // 1) 5+2 = 7, 2) m = 2+1 = 3, 3) 8/8=0

        // 2.4) (5 + 2++) / --8
        two = 2;
        result = (five+two++)/--eight;
        System.out.println(result); // 1) 5+2=7, 2) two = 2+1 = 3, 3) 8-1 = 7, 4) 7/7=1

        // 2.5)(5 * 2 >> 2++) / --8
        eight = 8;
        two = 2;
        result = (five*two>>two++)/--eight;
        System.out.println(result); // 1) 5*2=10=00001010, 2) 10>>2 = 00000010 = 2,  3) m = 2+1 = 3, 4) 1/7=0

        // 2.6) (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8
        eight = 8;
        two = 2;
        result = (five + seven > twenty ? sixtyEight : twentyTwo * two >> two++)/--eight;
        System.out.println(result); // 1) 5+7=12, 2) 12 меньше 20, поэтому 22*2 = 44 = 00101100, 3) 44>>2 = 00001011 = 11
                                    // 4) 8-1 = 7, 5) 11/7=1

        // 2.7) (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8
        //result = (five + seven > twenty ? sixtyEight >= sixtyEight : twentyTwo * two >> two++ )/ --eight  ;
        // System.out.println(result) ; Ошибка, попытка произвести арифметическую операцию между булевым значением и целочисленным

        // 2.8) 6 - 2 > 3 && 12 * 12 <= 119
        resultBoolean = six - two > three && twelve * twelve <= oneHNineteen;
        System.out.println(resultBoolean);  // 1) 6-2= 4, 2)4 больше 3 (первая часть true), 3) 12*12=144,
                                            // 4) 144 больше 119, поэтому правая часть false, а значит и всё выражение false
        //2.9) true && false
        resultBoolean = true && false;
        System.out.println(resultBoolean);  // для того, чтобы результат выражения был true, необходимо, чтобы обе части выражения были true,
                                            // т.к. в правой части false, то результат выражения будет false
    }
}
