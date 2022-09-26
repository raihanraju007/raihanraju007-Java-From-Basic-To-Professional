package Class_03_Java_Variables;

public class JavaVariables {
    public static void main(String[] args) {
       byte b = 112 + (byte) 12;
        System.out.println(Byte.class.isInstance(b));

        short sh = (short)32769;
        System.out.println(sh);

        long l = 2_147_483_648L;
        System.out.println(l);

        double d = 214_748_3649L;
        System.out.println(d);

        float f = 214_748_3649L;
        System.out.println(f);

        char ch = 'a';
        System.out.println(ch);

        String s = "Something";
        System.out.println("This is a String");
        System.out.println(s);

        String name = "Raihan";
        System.out.println("My name is " + name);

        System.out.println(50 + 30 + "=" + 50 + 30 * 2);

//        BYTE
//        All numbers in the interval[-128, 127] can be stored in a byte variable
byte b1 = -128; // OK
byte b2 = -127; // OK
byte b3 = -100; // OK

//byte b4 = -129; // ERROR
//byte b5 =  128; // ERROR

// SHORT
//        All numbers in the interval [-32768, 32767] can be stored a short variable
        short s1 = 5000; //OK
        short s2 = 32767; //OK

//        short s3 = 32768; //OK

//LONG
//        All numbers in the interval
//        [-9223372036854775808L, 9223372036854775807L]
//        can be stored in a long variable
       long l1 = -9223372036854775808L; //OK
       long l2 = -1839; //OK

//        long l3 = -9223372036854775808; //ERROR



    }
}
