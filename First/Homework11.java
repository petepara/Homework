package homeworkJava.First;

public class Homework11 {
    public static void main(String[] args) {
        int a = 42; // 00101010
        int b = 15; // 00001111
        int c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(~a); // 11010101 = 10101010 = -43
        System.out.println(~b); // 11110000 = 10001111 = -16
        System.out.println(a & b); // 00101010
                                   // 00001111
                                   // 00001010 = 10
        c = a & b;
        System.out.println(c);
        System.out.println(a | b);  // 00101010
                                    // 00001111
                                    // 00101111 = 47
        c = a | b;
        System.out.println(c);
        System.out.println(a ^ b);  // 00101010
                                    // 00001111
                                    // 00100101 = 37
        c = a ^ b;
        System.out.println(c);
        System.out.println(a >> 4); // 42 = 00101010 = 00000010 = 2
        System.out.println(b >> 3); // 15 = 00001111 = 00000001 = 1
        System.out.println(a << 2); // 42 = 00101010 = 10101000 = 168
        System.out.println(b << 1); // 15 = 00001111 = 00011110 = 30
        System.out.println(a >>> 4); // 42 = 00101010 = 00000010 = 2
        System.out.println(b >>> 3); // 15 = 00001111 = 00000001 = 1
    }
}