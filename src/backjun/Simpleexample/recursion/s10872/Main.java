package backjun.Simpleexample.recursion.s10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.init();
    }

    public int solution(int n) throws IOException {

        if(n<=1){
            return 1;
        }
        else{
            return n*solution(n-1);
        }
    }

    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        System.out.println(solution(n));

    }
}
