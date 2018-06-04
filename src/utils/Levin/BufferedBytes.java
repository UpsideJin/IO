package utils.Levin;

import java.io.*;

public class BufferedBytes extends Common {
    public static void process() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("./input.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        System.out.println("请输入你的字符串:");
        String str,flag;
        while(true){
            flag = str = input.nextLine();
            if(flag.equals("-1")){
                System.out.println("退出录入");
                break;
            }
            bufferedOutputStream.write(str.getBytes());
            bufferedOutputStream.flush();

            System.out.println("请输入你的字符串:");
        }
    }
    public static void show() throws IOException{
        String str = "";
        FileInputStream fileInputStream = new FileInputStream("./input.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        byte[] buffer=new byte[10240];
        int flag=0;
        while((flag=bufferedInputStream.read(buffer))!=-1){
            str=new String(buffer, 0, flag);
        }
        System.out.println("input.txt中的字符串：");
        System.out.println(str);
    }
}
