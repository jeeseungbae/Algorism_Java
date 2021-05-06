package backjun.Simpleexample.recursion.s10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S10872 {
    public static void main(String[] args) throws IOException {
        S10872 s10872 = new S10872();
        s10872.init();
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
