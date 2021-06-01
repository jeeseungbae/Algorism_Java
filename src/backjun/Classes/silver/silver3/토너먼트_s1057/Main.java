package backjun.Classes.silver.silver3.토너먼트_s1057;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        Main test = new Main();
        test.init();
    }

    public int solution(int n,int jimin,int hansu){
        int count=0;

        
        while(jimin!=hansu){
            jimin = jimin/2 + jimin%2;
            hansu = hansu/2 + hansu%2;
            count++;
        }

        return count;
    }

    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int jimin = Integer.parseInt(st.nextToken());
        int hansu = Integer.parseInt(st.nextToken());

        int answer = solution(n,jimin,hansu);

        System.out.println(answer);
    }

}
