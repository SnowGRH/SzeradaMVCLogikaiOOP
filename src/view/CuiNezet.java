package view;

import java.util.Scanner;

public class CuiNezet {
    private static final Scanner sc = new Scanner(System.in);
    private static final String SEP = System.lineSeparator();
    
    private void konzolra(String msg){
        System.out.println(msg);
    }
    public void leiraMegjelneito(String msg){
        konzolra(msg +SEP);
    }
        public void feladatMegjelneito(String msg){
        konzolra(msg + SEP);
    }
    public int Bekeres(String msg){
        konzolra(msg);
        return sc.nextInt();
    }
        public void NyertMegjelneito(String msg){
        konzolra(msg + SEP);
    }
}
