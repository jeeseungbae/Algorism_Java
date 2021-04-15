package backjun.Simpleexample.arrangement.s3052;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> a = new ArrayList<>();

        for (int i=0; i<10;i++){
            int q =Integer.parseInt(br.readLine())%42;
            if(!a.contains(q)){
                a.add(q);
            }
        }

        System.out.println(a.size());


        br.close();


    }
}
