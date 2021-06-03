package backjun.Classes.silver.silver1.팰린드롬만들기_s1254;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private String s;

    public static void main(String[] args) throws IOException {
        Main test = new Main();
        test.init();
    }

    public int solution(){

        for(int i=0; i<s.length(); i++){
            if(check(s,i,s.length()-1)){
                return i+s.length();
            }
        }
        return 1;
    }

    public boolean check(String s, int ln, int rn){
        while(ln<rn){
            if(s.charAt(ln++)!=s.charAt(rn--)){
                return false;
            }
        }
        return true;
    }

    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        s = st.nextToken();

        System.out.println(solution());
    }
}
