import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Constructor;
public class lab8 {
    public static class MyObject {
        private String info_str;
        public int info_int;
        private MyObject(int info_int_){
            info_str = "info";
            info_int = info_int_;
        }
        protected MyObject(String info_str_){
            info_str = info_str_;
            info_int = 555;
        }
        public MyObject(String info_str_, int info_int_) {
            info_str = info_str_;
            info_int = info_int_;
        }
        public void print() {
            System.out.println("info_str: " + info_str);
            System.out.println("info_int: " + info_int);
        }
        public String get_info_str() { return info_str; }
        public int get_info_int() { return info_int; }
    }
    public static void print_class_name(Class<?> instance) {
        System.out.println("Class name: " + instance.getName());
    }
    public static void print_class_modifier(Class<?> instance) {
        int mods = instance.getModifiers();
        System.out.print("Class modifier: ");
        if (Modifier.isPublic(mods))
            System.out.print("public");
        if (Modifier.isAbstract(mods))
            System.out.print("abstract");
        if (Modifier.isFinal(mods))
            System.out.print("final");
        System.out.println();
    }
    public static void print_fields(Field[] fields) {
        for (var field : fields) {
            Class<?> field_type = field.getType();
            System.out.println("  Field --->  type: " + field_type.getName() + "  |  name: " + field.getName());
        }
        System.out.println();
    }
    public static void print_constructors(Constructor<?>[] constructors) {
        for (var constructor : constructors) {
            System.out.print("  Constructor " + constructor.getName() + "(");
            Class<?>[] params = constructor.getParameterTypes();
            for (var param : params)
                if (param == params[params.length-1])
                    System.out.print(param.getName() + ")\n");
                else
                    System.out.print(param.getName() + ", ");
        }
    }
    public static void print_class_constructors(Class<?> instance) {
        Constructor<?>[] constructors = instance.getConstructors();
        System.out.println("\nPublic constructors:");
        print_constructors(constructors);

        constructors = instance.getDeclaredConstructors();
        System.out.println("\nAll constructors (public, protected, private and default:");
        print_constructors(constructors);
    }
    public static void print_class_fields(Class<?> instance) {
        Field[] fields = instance.getFields();
        System.out.println("\nPublic fields:");
        print_fields(fields);

        fields = instance.getDeclaredFields();
        System.out.println("All fields (public, protected, private and default (excludes inherited fields):");
        print_fields(fields);
    }
    public static void print_methods(Method[] methods) {
        for (var method : methods) {
            System.out.println("  Method" + "\n     name: " + method.getName());
            Class<?>[] params = method.getParameterTypes();
            System.out.print("     parameters: ");
            for (var paramType : params)
                System.out.print(" " + paramType.getName());
            System.out.println("\n     return type: " + method.getReturnType().getName());
            System.out.println();
        }
        System.out.println();
    }
    public static void print_class_methods(Class<?> instance) {
        Method[] methods = instance.getMethods();
        System.out.println("\nPublic methods:");
        print_methods(methods);

        methods = instance.getDeclaredMethods();
        System.out.println("All methods (public, protected, private and default (excludes inherited methods):");
        print_methods(methods);
    }
    public static void print_class_interfaces(Class<?> instance) {
        Class<?>[] ifs = instance.getInterfaces();
        System.out.println("Interfaces:\n");
        for (var ifc : ifs)
            System.out.println(ifc.getName());
    }
    public static void printClassInfo(Class<?> instance) {
        print_class_name(instance);
        print_class_modifier(instance);
        print_class_constructors(instance);
        print_class_fields(instance);
        print_class_methods(instance);
        print_class_interfaces(instance);
    }

    public static void main(String[] args) {
        MyObject obj = new MyObject("info", 999);
        Class<?> class_obj = obj.getClass();
        printClassInfo(class_obj);
    }

}
