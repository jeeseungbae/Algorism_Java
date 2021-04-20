package backjun.Simpleexample.arrangement.s1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    private double maxscore = 0;
    private int n;
    private double sum=0;
    private List<Integer> score = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }

    private void solution() throws IOException {

        init();

        for (int i=0; i<n; i++){
            sum += score.get(i)*100/maxscore;
            // int로 나누게 되면 몫만 계산된다.
            // double 형으로 나누게 되면 나머지 모두 구할수 있다.
        }

        System.out.println(sum/n);
    }


    private void init() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i=0; i<n; i++){
            score.add(Integer.parseInt(st.nextToken()));
            if (maxscore<score.get(i)){
                maxscore = score.get(i);
            }
        }
    }
}
