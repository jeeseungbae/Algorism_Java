package backjun.Classes.silver.silver1.포도주시식_s2156;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private int[] dp;
    private int[] list;
    private int answer;
    private int n;

    public static void main(String[] args) throws IOException {
        Main test = new Main();
        test.init();
    }

    public void solution(){
        int pos=3;
        while(pos<n+3){
            dp[pos] = Math.max(dp[pos-3]+list[pos-1]+list[pos],dp[pos-2]+list[pos]);
            dp[pos] = Math.max(dp[pos-1],dp[pos]);
            answer = Math.max(answer,dp[pos]);
            pos++;
        }
    }

    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        list = new int[n+3];
        dp = new int[n+3];
        answer=0;

        for(int i=3; i<n+3; i++){
            st = new StringTokenizer(br.readLine());
            list[i]=Integer.parseInt(st.nextToken());
        }
        solution();
        System.out.println(answer);
    }
}
