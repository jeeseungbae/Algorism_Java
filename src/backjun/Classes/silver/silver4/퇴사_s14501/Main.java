package backjun.Classes.silver.silver4.퇴사_s14501;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private int n;
    private int[] t;
    private int[] p;
    private int[] dp;

    public static void main(String[] args) throws IOException {

        Main test = new Main();
        test.init();
    }

    public int solution(){

        for(int i=n; i>0; i--){
            int next = i+t[i];
            if(next>n+1){
                dp[i] = dp[i+1];
            }
            else{
                dp[i]= Math.max(dp[i+1],dp[next]+p[i]);
            }

        }
        return dp[1];
    }


    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        t = new int [n+2];
        p = new int [n+2];
        dp = new int [n+2];

        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }

        sb.append(solution());



        bw.write(sb.toString());
        bw.close();
        br.close();
    }

}
