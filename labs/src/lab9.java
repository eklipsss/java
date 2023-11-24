import java.lang.reflect.*;
public class lab9 {
    public static class MyObject {
        private String info_str;
        private int info_int;
        public MyObject(String str, int x) {
            info_str = str;
            info_int = x;
        }
        public void print() {
            System.out.println("Object: ");
            System.out.println("  info_str: " + info_str);
            System.out.println("  info_int: " + info_int);
        }
        public String get_info_str() {
            return info_str;
        }
        public int get_info_int() {
            return info_int;
        }
        public void set_info_str(String str) {
            info_str = str;
        }
    }

    public static void main(String[] args) {
        try {
            MyObject obj = new MyObject("info_str", 999);
            String class_name = obj.getClass().getName();
            System.out.println("Class name: " + class_name);
            Class<?> instance = Class.forName(class_name);
            Constructor<?> constructor = instance.getConstructor(String.class, int.class);
            Object obj2 = constructor.newInstance("data", 666);

            String methodName1 = "print";
            String methodName2 = "set_info_str";
            String methodName3 = "get_info_str";
            String methodName4 = "get_info_int";

            Method method1 = instance.getMethod(methodName1);
            Method method2 = instance.getMethod(methodName2, String.class);
            Method method3 = instance.getMethod(methodName3);
            Method method4 = instance.getMethod(methodName4);

            method1.invoke(obj2);

            Object x = method3.invoke(obj2);
            System.out.println("GET info_int:  " + x);
            Object str = method4.invoke(obj2);
            System.out.println("GET info_str:  " + str);

            System.out.println("--> Update info_str --> ");

            method2.invoke(obj2, "new_data");
            method1.invoke(obj2);
        }
        catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());
        }
        catch (NoSuchMethodException e) {
            System.err.println("Method not found: " + e.getMessage());
        }
        catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            System.err.println("Error with creating: " + e.getMessage());
        }
    }
}
