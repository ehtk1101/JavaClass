package org.dimigo.oop;

public class WrapperTest {
    public static void main(String[] args) {
        // Wrapper 클래스 : Primitive Type을 Wrapping해주는 클래스
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toHexString(10));
        System.out.println(Integer.toOctalString(10));

        // Boxing(Primitive Type -> Wrapper 객체)
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        Integer i3 = Integer.valueOf(200);
        Integer i4 = Integer.valueOf("200");
        Double d1 = Double.valueOf(3.14);

        // Unboxing (Wrapper 객체 -> Primitive Type)
        int r1 = i1.intValue();
        double r2 = d1.doubleValue();

        // 문자열 -> 해당되는 Primitivee Type
        int r3 = Integer.parseInt("300");
        double r4 = Double.parseDouble("2.14");

        System.out.println(args[0] + args[1]);
        // 100 + 200 = 300
        //System.out.println(Integer.sum(Integer.parseInt(args[0]), Integer.parseInt(args[1]))); //args[0] 100, args[1] 200
        int n1 = Integer.parseInt(args[0]);
        int n2 =Integer.parseInt(args[1]);
        System.out.printf("%d + %d  = %d\n",n1,n2,n1+n2);

        Integer obj1 = new Integer(1000);
        Integer obj2 = new Integer(2000);
        Integer obj3 = obj1 + obj2;
        System.out.println(obj3);
        System.out.println(obj1 + obj2);

        Integer a = 1000;       // Autoboxing
        int b = a + 100;        // Autounboxing

        Integer C = 10; // Autoboxing
        Integer D = C + 20; // Autoboxing, Autounboxing
        Integer result = C + D;// Autoboxing, Autounboxing, Autounboxing
    }
}
