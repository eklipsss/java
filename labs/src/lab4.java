public class lab4 {
    public static void main(String[] args) {
        byte b = 1;
        short sh = 5;
        char ch = 'm';
        int i = 2;
        String str = "Hello world";

        System.out.println("switch with byte b:");
        switch (b) {
            case 1:
                System.out.println("switch1: " + b);
                break;
            case 101:
                System.out.println("switch2: " + b);
                break;
            default:
                System.out.println("switchdef: " + b);
                break;
        }

        System.out.println("\nswitch with short sh:");
        switch (sh) {
            case 1:
                System.out.println("switch1: " + sh);
                break;
            case 2:
                System.out.println("switch2: " + sh);
                break;
            default:
                System.out.println("switchdef: " + sh);
                break;
        }

        System.out.println("\nswitch with char ch:");
        switch (ch) {
            case 'a':
                System.out.println("switch1: " + ch);
                break;
            case 'm':
                System.out.println("switch2: " + ch);
                break;
            default:
                System.out.println("switchdef: " + ch);
                break;
        }

        System.out.println("\nswitch with int i:");
        switch (i) {
            case 1:
                System.out.println("switch1: " + i);
                break;
            case 2:
                System.out.println("switch2: " + i);
                break;
            default:
                System.out.println("switchdef: " + i);
                break;
        }
        System.out.println("\nswitch with String str:");
        switch (str) {
            case "Hello":
                System.out.println("switch1: " + str);
                break;
            case "world":
                System.out.println("switch2: " + str);
                break;
            default:
                System.out.println("switchdef: " + str);
                break;
        }
    }
}
