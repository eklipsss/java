import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите \"file\"/\"console\", чтобы  считать слова из файла/из консоли:");
        String user_command = input.next();

        if (user_command.equalsIgnoreCase("file")){
            String dir = System.getProperty("user.dir");
            System.out.println(dir);
            try {
                Scanner fin = new Scanner(Paths.get(dir, "words.txt"), "UTF-8");
                System.out.println("Слова, полученные из файла:");
                while(fin.hasNext()) {
                    String elem = fin.next();
                    System.out.println("--> " + elem);
                }
            }
            catch (NoSuchFileException e) {
                System.out.println("Exception 1: " + e);
            }
            catch (IOException e) {
                System.out.println("Exception 2: " + e);
            }
            catch (Exception e) {
                System.out.println("Exception 3: " + e);
            }
        }
        else if (user_command.equalsIgnoreCase("console")) {
            System.out.println("Вводите слова через пробел или enter, для завершения введите \"...\"");

            while (input.hasNext()) {
                String elem = input.next();

                if (elem.equals("...")) {
                    break; // Выход из цикла при вводе '!!'
                }
                System.out.println("--> " + elem);
            }

        }
        input.close();
    }
}
