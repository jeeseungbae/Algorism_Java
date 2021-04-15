package backjun.Simpleexample.Solution1236;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<String> c = new ArrayList<>();
        ArrayList<Character> q = new ArrayList<>();
        int num =0;

        for (int i=0; i<n; i++){
            c.add(String.valueOf(br.readLine()).toUpperCase());
        }
        for (int i=0; i<Integer.max(n,m);i++){

            for (int j =0; j<Integer.min(n,m);j++){
                q.add(c.get(i).charAt(j));
            }
            if (!c.get(i).contains("X")||!q.contains("X")){
//                c.get(i). = "X";
                num+=1;
            }
            q.clear();

        }
        System.out.println(num);
    }
}
