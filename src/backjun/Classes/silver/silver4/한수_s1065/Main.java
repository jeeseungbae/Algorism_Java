package backjun.Classes.silver.silver4.한수_s1065;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private int n;

    public static void main(String[] args) throws IOException {

        Main test = new Main();
        test.init();
    }

    public int solution(){

        int answer;

        if(n<100){
            return n;
        }
        else{
            answer = 99;

            for(int i=100; i<=n; i++){
                int[] arr = new int[3];

                arr[0] = i/100;
                arr[1] = (i/10) % 10;
                arr[2] = i%10;

                if(arr[2]-arr[1]==arr[1]-arr[0]){
                    answer++;
                }
            }
        }

        return answer;
    }


    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(st.nextToken());
        sb.append(solution());

        bw.write(sb.toString());
        bw.close();
        br.close();
    }

}
