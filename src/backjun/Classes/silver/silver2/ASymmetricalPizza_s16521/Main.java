package backjun.Classes.silver.silver2.ASymmetricalPizza_s16521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        Main s16521 = new Main();
        s16521.init();
    }

    public int solution(double r){
        int answer;

        int share = (int) Math.round(r*100);
        int x = 360*100;

        while(x%share!=0){
            x+=360*100;
        }

        answer = x/share;

        return answer;
    }

    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double r = Double.parseDouble((st.nextToken()));
        System.out.println(solution(r));
    }
}
