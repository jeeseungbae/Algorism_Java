package backjun.Simpleexample.정렬.s8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    private int n;
    private List<String[]> quiz = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }

    public void solution() throws IOException {
        init();

        for (int i=0; i<n; i++){
            int count =0;
            int sum_OX = 0;
            for(int j=0; j<quiz.get(i).length; j++){
                if(quiz.get(i)[j].equals("O")){
                    // quiz.get(i).charAt(0) 이면 0번째 문자를 알려준다.
                    count+=1;
                }
                else{
                    count=0;
                }
                sum_OX+=count;
            }
            System.out.println(sum_OX);
        }
    }

    public void init() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            quiz.add(st.nextToken().split(""));
        }
    }
}
