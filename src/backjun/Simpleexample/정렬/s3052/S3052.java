package backjun.Simpleexample.정렬.s3052;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class S3052 {
    public static void main(String[] args) throws IOException {
        S3052 main = new S3052();
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
