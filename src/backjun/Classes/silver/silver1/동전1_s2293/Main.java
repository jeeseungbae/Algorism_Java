package backjun.Classes.silver.silver1.동전1_s2293;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private int[] coin;
    private int[] count;

    public static void main(String[] args) throws IOException {
        Main test = new Main();
        test.init();
    }

    private void solution(int n, int k) {

        for(int i=1; i<=n; i++){
            for(int j=1; j<=k; j++){
                if(j>=coin[i]){
                    count[j]+=count[j-coin[i]];
                }
            }
        }
    }

    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        coin = new int[n+1];
        count = new int[k+1];
        count[0]=1;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            coin[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(coin);

        solution(n,k);

        System.out.println(count[k]);
    }
}
