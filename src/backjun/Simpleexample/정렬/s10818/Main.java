package backjun.Simpleexample.정렬.s10818;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for (int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(min>arr[i]){min = arr[i];}
            if(max<arr[i]){max = arr[i];}
        }

        StringBuilder sb = new StringBuilder();
        sb.append(min).append(" ").append(max);
        bw.write(sb.toString());

        bw.close();
        br.close();

    }
}
