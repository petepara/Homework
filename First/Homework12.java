package homeworkJava.First;

public class Homework12 {
    public static void main(String[] args) {
        byte a = (byte)0b11010110; // 00101010 = 11010101 = 11010110
        byte b = (byte)0b11110001; // 00001111 = 11110000 = 11110001
        int c;
        System.out.println(a);

        System.out.println(b);

        System.out.println(~a); // 11010110 = 00101001 = 41

        System.out.println(~b); // 11110001 = 00001110 = 14

        System.out.println(a & b); // 11010110
                                   // 11110001
                                   // =11010000
        c = a & b;
        System.out.println(c);

        System.out.println(a | b);  // 11010110
                                    // 11110001
                                    // =11110111
        c = a | b;
        System.out.println(c);
        System.out.println(a ^ b);  // 11010110
                                    // 11110001
                                    // 00100111
        c = a ^ b;
        System.out.println(c);
        System.out.println(a >> 4); // -42 = 11010110 = 11111101 = 00000010 + 1 = 000000011 = -3
        System.out.println(b >> 3); // -15 = 11110001 = 11111110 = 00000001 + 1 = 000000010 = -2
        System.out.println(a << 2); // -42 = 11111111 11111111 11111111 11010110
                                    //       11111111 11111111 11111111 01011000 = -168
        System.out.println(b << 1); // -15 = 11111111 11111111 11111111 11110001
                                    //       11111111 11111111 11111111 11100010 = -30
        System.out.println(a >>> 4); // 11111111 11111111 11111111 11010110
                                     // 00001111 11111111 11111111 11111101
        System.out.println(b >>> 3); // 11111111 11111111 11111111 11110001
                                     // 00011111 11111111 11111111 11111110

    }
}
