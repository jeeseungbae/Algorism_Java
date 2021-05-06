package backjun.Simpleexample.input_output.s1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1000 {
    public static void main(String[] args) throws IOException {
        S1000 s1000 = new S1000();
        s1000.solution();
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
//        String[] w = br.readLine().split(" ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a+b);
    }
}


