public class lab3 {
    public static void main(String[] args) {
        int x = 220;
        int y = 15;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //использование логических операций && || !
        if (x%6!=0)
            System.out.println("Число 6 не является делителем x");
        else System.out.println("Число 6 - делитель x");

        if (x%5==0 && y%5==0)
            System.out.println("Число 5 - общий делитель x и y");
        else System.out.println("Число 5 не является общим делителем x и y");

        if (x%2==0 || y%2==0)
            System.out.println("Произведение xy делится на 2 (либо x, либо y делится на 2)");
        else System.out.println("Произведение xy не делится на 2 (ни x, ни y не делятся на 2)");

        //использование тернарной операции x < y ? x : y
        System.out.println("min(x,y): " + (x < y ? x : y));
        System.out.println("max(x,y): " + (x > y ? x : y));

        //использование поразрядных логических операций & | ^ ~
        int a = 10; //01010
        int b  = 21; //10101
        System.out.println("a = " + a + "  -->  " + Integer.toBinaryString(a));
        System.out.println("b = " + b + "  -->  " + Integer.toBinaryString(b));
        System.out.println("Поразрядное логическое отрицание a: " + (~a) + "  -->  " + Integer.toBinaryString(~a));
        System.out.println("Поразрядное логическое отрицание b: " + (~b) + "  -->  " + Integer.toBinaryString(~b));
        System.out.println("Поразрядное логическое умножение a&b: " + (a & b) + "  -->  " + Integer.toBinaryString(a & b));
        System.out.println("Поразрядное логическое сложение a|b: " + (a | b) + "  -->  " + Integer.toBinaryString(a | b));
        System.out.println("Поразрядное логическое исключающее ИЛИ a^b: " + (a ^ b) + "  -->  " + Integer.toBinaryString(a ^ b));

        //использование операций сдвига >> << >>>
        int c = 4;
        int d = 2;
        int e = -8;
        System.out.println("c = " + c + "  -->  " + Integer.toBinaryString(c));
        System.out.println("d = " + d + "  -->  " + Integer.toBinaryString(d));
        System.out.println("e = " + e + "  -->  " + Integer.toBinaryString(e));
        System.out.println("c >> d: " + (c >> d) + "  -->  " + Integer.toBinaryString(c >> d));
        System.out.println("c >>> d: " + (e >>> d) + "  -->  " + Integer.toBinaryString(e >>> d));
        System.out.println("c << d: " + (c << d) + "  -->  " + Integer.toBinaryString(c << d));

    }
}
