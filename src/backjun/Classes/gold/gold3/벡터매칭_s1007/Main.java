package backjun.Classes.gold.gold3.벡터매칭_s1007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private double min;

    public static void main(String[] args) throws IOException {

        Main test = new Main();
        test.init();
    }

    public void solution(int[][] list){



    }

    public void init() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){
            min = Double.MAX_VALUE;
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int[][] list = new int[m][2];
            for(int j=0; j<m; j++){
                st = new StringTokenizer(br.readLine());
                list[j][0] = Integer.parseInt(st.nextToken());
                list[j][1] = Integer.parseInt(st.nextToken());
            }

            solution(list);

        }


    }
}
