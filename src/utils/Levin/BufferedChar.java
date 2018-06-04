package utils.Levin;

import java.io.*;

public class BufferedChar extends Common {
    public static void process() throws IOException {

        FileWriter fileWriter = new FileWriter("./input.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        System.out.println("请输入你的字符串:");
        String str, flag;
        while (true) {
            flag = str = input.nextLine();
            if (flag.equals("-1")) {
                System.out.println("退出录入");
                break;
            }
            bufferedWriter.write(str);
            bufferedWriter.flush();
            System.out.println("请输入你的字符串:");
        }
    }

    public static void show() throws IOException {
        String str;
        FileReader fileReader = new FileReader("./input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        str = bufferedReader.readLine();
        System.out.println("input.txt中的字符串：");
        System.out.println(str);
    }
}
