package backjun.Classes.silver.silver1.RGB거리_s1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private BufferedReader br;
    private StringTokenizer st;

    public static void main(String[] args) throws IOException {
        Main test = new Main();
        test.init();
    }

    public int solution(int n) throws IOException {

        int[][] dp = new int[n][3];

        st = new StringTokenizer(br.readLine());
        dp[0][0] = Integer.parseInt(st.nextToken());
        dp[0][1] = Integer.parseInt(st.nextToken());
        dp[0][2]= Integer.parseInt(st.nextToken());



        for(int i=1; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            int G = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            dp[i][0] = R + Math.min(dp[i-1][1],dp[i-1][2]);
            dp[i][1] = G + Math.min(dp[i-1][0],dp[i-1][2]);
            dp[i][2] = B + Math.min(dp[i-1][0],dp[i-1][1]);
        }

        int min=Integer.MAX_VALUE;

        for(int i=0; i<3; i++){
            if(min>dp[n-1][i]){
                min = dp[n-1][i];
            }
        }

        return min;
    }

    public void init() throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int answer = 0;

        answer = solution(n);

        System.out.println(answer);
    }
}
