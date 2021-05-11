package backjun.Simpleexample.정렬.s2577;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num=1;
        int[] answer = new int[10];
        num = num * Integer.parseInt(br.readLine());
        num = num * Integer.parseInt(br.readLine());
        num = num * Integer.parseInt(br.readLine());

        while(num!=0){
            int a = num%10;
            num = num/10;

            answer[a]++;
        }

        for (int i:answer){
            bw.write(String.valueOf(i));
            bw.newLine();
        }

        br.close();
        bw.close();

    }
}
