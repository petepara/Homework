package homeworkJava;

public class homework21 {
    public static void main(String[] args) {
        int a = 8;
        int m = 2;

        System.out.println(5+2/a);  // 1) 2/8 = 0, 2) 5+0=5
        System.out.println((5+2)/a); // 1) 5+2=7, 2) 7/8=0
       // System.out.println((5+2++)/a); // compile time error: unexpected type required: variable, found: value 5+2=7, 7/8=0
        System.out.println((5+m++)/a); // 1) 5+2 = 7, 2) m = 2+1 = 3, 3) 7/8=0
       // System.out.println((5+2++)/--a); // compile time error: unexpected type required: variable, found: value 5+2=7, 8-1=7, 7/7=1
        System.out.println((5+m++)/--a); // 1) 5+2=7, 2) m = 2+1 = 3, 3) 8-1 = 7, 4) 7/7=1
       // System.out.println((5*2>>2++)/--a); // compile time error: unexpected type required: variable, found: value
        System.out.println((5*2>>m++)/--a); // 1) 5*2=10=00001010, 2) 10>>2 = 00000010 = 2,  3) m = 2+1 = 3, 4) 2/8=0
        //System.out.println((5 + 7 > 20 ? 68 : 22 * 2 >> 2++>>2++)/--a);
        System.out.println((5 + 7 > 20 ? 68 : 22 * 2 >> m++>>m++)/--a); // 1) 5+7=12, 2) 12 меньше 20, поэтому 22*2 = 44 = 00101100, 3) 44>>2 = 00001011 = 11, 4) m=2+1=3, 5) 11>>3 = 00000001 = 1,
                                                                                                                                                         //6) 8-1 = 7, 7) 1/7=0
        //System.out.println((5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --a);
        System.out.println(6 - 2 > 3 && 12 * 12 <= 119); // 1) 6-2= 4, 2)4 больше 3 (первая часть true), 3) 12*12=144, 4) 144 больше 119, поэтому правая часть false, а значит и всё выражение false
        System.out.println(true && false); //для того, чтобы результат выражения был true, необходимо, чтобы обе части выражения были true, т.к. в правой части false, то результат выражения будет false
    }
}
