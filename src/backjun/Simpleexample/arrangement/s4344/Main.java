package backjun.Simpleexample.arrangement.s4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    private double n;
    private List<Integer> score = new ArrayList<>();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.init();
    }

    public void solution() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int sum_score=0;
        int count_score=0;

        for (int i=0; i<n; i++){
            score.add(Integer.parseInt(st.nextToken()));
            sum_score += score.get(i);
        }

        double mean_score = sum_score/n;

        for (int i:score){
            if(i>mean_score){
                count_score+=1;
            }
        }

        double answer = count_score*100/n;

        System.out.println(String.format("%.3f",answer)+"%");

    }

    public void init() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());

        for (int i=0; i<count; i++){
            solution();
            score.clear();
        }

    }

}
