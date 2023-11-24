public class lab1 {
    public static void main(String[] args) {
        //// Материалы лекции
        System.out.println("----------------------");
        System.out.println("LECTURE MATERIALS");
        System.out.println("----------------------");
        // Сложение строк
        String str = "str";
        String str1 = str + 1;
        String str2 = str + (1+1);
        String str3 = str1 + str2;

        System.out.println("s1: " + str1);
        System.out.println("s2: " + str2);
        System.out.println("s1 + s2: " + str3);

        // Сравнение строк ( == , equals)
        String str4 = "string";
        String str5 = "string";
        String str6 = str + "ing";

        System.out.println("\nCompare with == :  ");
        System.out.println("1) Identical addresses:  " + (str4 == str5));
        System.out.println("2) Identical addresses:  " + (str4 == "string"));
        System.out.println("3) Different addresses:  " + (str4 == str6));

        System.out.println("\nCompare with equals:  ");
        System.out.println("1) Identical addresses: " + (str4.equals(str5)));
        System.out.println("2) Identical addresses: " + (str4.equals("string")));
        System.out.println("3) Different addresses: " + (str4.equals(str6)));

        // Нулевая строка
        String str7 = null;
        System.out.println("\nCompare with null string: str = null");
        System.out.println("str == null: " + (str7 == null));

        String str8 = "";
        System.out.println("\nCompare with null string: str = ''");
        System.out.println("str == null: " + (str8 == null));
        System.out.println("str.length(): " + (str8.length()));

        String str9 = new String();
        System.out.println("\nCompare with null string: str = new String()");
        System.out.println("str == null: " + (str9 == null));
        System.out.println("str.length(): " + (str9.length()));

        //// Другие методы для работы с объектами String
        System.out.println("\n----------------------");
        System.out.println("OTHER METHODS for working with String objects");
        System.out.println("----------------------");

        String s1= "Hello";
        System.out.println("s1: " + s1);

        //charAt
        System.out.println("\n- charAt: ");
        System.out.println("   s1.charAt(1): " + s1.charAt(1));

        //compareTo
        System.out.println("\n- compareTo: ");
        System.out.println("   s1==s2: " + s1.compareTo("H" + "ello"));
        System.out.println("   len(s1)>len(s2): " + s1.compareTo("Hel"));
        System.out.println("   len(s1)<len(s2): " + s1.compareTo("Hello world"));

        //compareToIgnoreCase
        System.out.println("\n- compareToIgnoreCase: ");
        System.out.println("   \"Hello\" vs \"hello\": " + s1.compareToIgnoreCase("hello"));

        //equals
        System.out.println("\n- equals: ");
        System.out.println("   s1==s2: " + s1.equals("H" + "ello"));
        System.out.println("   s1!=s2: " + s1.equals("Hello world"));

        //equalsIgnoreCase
        System.out.println("\n- equalsIgnoreCase: ");
        System.out.println("   \"Hello\" vs \"HELLO\": " + s1.equalsIgnoreCase("HELLO"));

        //concat
        System.out.println("\n- concat: ");
        System.out.println("   s1.concat(\" world\"): " + s1.concat(" world"));

        //join
        System.out.println("\n- join: ");
        String join_str = String.join(" + ", "element1", "element2", "element3");
        System.out.println("   join(\" + \", \"element1\", \"element2\", \"element3\"): " + join_str);

        //substring
        System.out.println("\n- substring: ");
        String sub_str = s1.substring(1,4);
        System.out.println("   s1.substring(0,3): " + sub_str);

        //valueOf
        System.out.println("\n- valueOf: ");
        System.out.println("   s1.valueOf(3): " + s1.valueOf(3.5));

        //regionMatches
        System.out.println("\n- regionMatches: ");
        System.out.println("   s1.regionMatches(1,\"Tell\", 1,3): " + s1.regionMatches(1,"Tell", 1,3));
        System.out.println("   s1.regionMatches(1,\"Call\", 1,3): " + s1.regionMatches(1,"Call", 1,3));

        //indexOf
        System.out.println("\n- indexOf: ");
        System.out.println("   s1.indexOf(\"ell\"): " + s1.indexOf("ell"));
        System.out.println("   s1.indexOf(\"l\"): " + s1.indexOf("l"));

        //lastIndexOf
        System.out.println("\n- lastIndexOf: ");
        System.out.println("   s1.lastIndexOf(\"ell\"): " + s1.lastIndexOf("ell"));
        System.out.println("   s1.lastIndexOf(\"l\"): " + s1.lastIndexOf("l"));

        //startsWith
        System.out.println("\n- startsWith: ");
        System.out.println("   s1.startsWith(\"H\"): " + s1.startsWith("H"));
        System.out.println("   s1.startsWith(\"Hel\"): " + s1.startsWith("Hel"));
        System.out.println("   s1.startsWith(\"HEL\"): " + s1.startsWith("HEL"));

        //endsWith
        System.out.println("\n- endsWith: ");
        System.out.println("   s1.endsWith(\"o\"): " + s1.endsWith("o"));
        System.out.println("   s1.endsWith(\"lo\"): " + s1.endsWith("lo"));
        System.out.println("   s1.endsWith(\"d\"): " + s1.endsWith("d"));

        //replace
        System.out.println("\n- replace: ");
        System.out.println("   s1.replace(\"ello\", \"alloween\"): " + s1.replace("ello", "alloween"));

        //toLowerCase
        System.out.println("\n- toLowerCase: ");
        System.out.println("   s1.toLowerCase(): " + s1.toLowerCase());

        //toUpperCase
        System.out.println("\n- toUpperCase: ");
        System.out.println("   s1.toUpperCase(): " + s1.toUpperCase());

        //trim
        System.out.println("\n- trim: ");
        String s2 = "     .  Spaces  .        ";
        System.out.println("   s2: " + s2);
        System.out.println("   s1.trim(): " + s2.trim());
    }
}
