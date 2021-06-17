package backjun.Classes.silver.silver2.잃어버린괄호_s1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private int x;
    private int answer;
    private char flag;

    public static void main(String[] args) throws IOException {
        Main test = new Main();
        test.init();
    }
    private void calculate(){
        if(flag=='-'){
            answer -= x;
        }
        else {
            answer += x;
        }
    }

    private void selectflag(int count, int i){
        if(count!=-1&&i>=count){
            flag='-';
        }
        else{
            flag='+';
        }
    }

    private void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String words = br.readLine();
        x =answer = 0;
        flag='0';
        int count = words.indexOf('-');

        for(int i=0; i<words.length(); i++){
            if('0'<=words.charAt(i)&& words.charAt(i)<='9'){
                x = x*10 + Integer.parseInt(words.substring(i,i+1));
            }
            else {
                calculate();
                selectflag(count,i);
                x=0;
            }
        }

        calculate();
        System.out.println(answer);
    }
}
