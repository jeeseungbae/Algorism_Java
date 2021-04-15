package backjun.Simpleexample.input_output.solution2557;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] a = br.readLine().split(" ");

        System.out.println(Integer.parseInt(a[0])+Integer.parseInt(a[1]));

    }
}
