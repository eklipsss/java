public class lab5 {
    public static void main(String[] args) {
        if (args.length == 0)
            System.out.println("Nothing arguments");
        else {
            System.out.println("Arguments:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("args[" + (i + 1) + "] = " + args[i]);
            }
        }
    }
}
