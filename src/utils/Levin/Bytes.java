package utils.Levin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bytes extends Common {
    public static void process() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("./input.txt");
        System.out.println("请输入你的字符串:");
        String str, flag;
        while (true) {
            flag = str = input.nextLine();
            if (flag.equals("-1")) {
                System.out.println("退出录入");
                break;
            }
            fileOutputStream.write(str.getBytes());
            fileOutputStream.flush();

            System.out.println("请输入你的字符串:");
        }
    }

    public static void show() throws IOException {
        String str="";
        FileInputStream fileInputStream = new FileInputStream("./input.txt");
        byte[] bytes = new byte[10240];
        int flag=0;
        while((flag=fileInputStream.read(bytes))!=-1){
            str=new String(bytes, 0, flag);
        }
        System.out.println("input.txt中的字符串：");
        System.out.println(str);
    }
}
