package backjun.Simpleexample.input_output.s2557;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2557 {
    public static void main(String[] args) throws IOException {
        S2557 s2557 = new S2557();
        s2557.solution();
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] a = br.readLine().split(" ");

        System.out.println(Integer.parseInt(a[0])+Integer.parseInt(a[1]));

    }
}
