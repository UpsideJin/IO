package utils.Levin;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Chars extends Common {
    public static void process() throws IOException {
        FileWriter fileWriter = new FileWriter("./input.txt");
        System.out.println("请输入你的字符串:");
        String str, flag;
        while (true) {
            flag = str = input.nextLine();
            if (flag.equals("-1")) {
                System.out.println("退出录入");
                break;
            }
            fileWriter.write(str);
            fileWriter.flush();
            System.out.println("请输入你的字符串:");
        }
    }

    public static void show() throws IOException {
        String str;
        FileReader fileReader = new FileReader("./input.txt");
        char[] chars = new char[10240];
        fileReader.read(chars);
        str = new String(chars);
        System.out.println("input.txt中的字符串：");
        System.out.println(str);
    }
}
