import utils.Levin.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args)throws IOException {
        Scanner input = new Scanner(System.in );
        Instruct.show();
        int n = input.nextInt();
        switch(n){
            case 1:
                Bytes.process();
                Bytes.show();
                break;
            case 2:
                Chars.process();
                Chars.show();
                break;
            case 3:
                BufferedBytes.process();
                BufferedBytes.show();
                break;
            case 4:
                BufferedChar.process();
                BufferedChar.show();
                break;
        }
    }
}
