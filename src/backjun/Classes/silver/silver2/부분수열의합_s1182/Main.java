package backjun.Classes.silver.silver2.부분수열의합_s1182;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private int n;
    private int s;
    private int[] sequence;
    private int answer=0;

    public static void main(String[] args) throws IOException {
        Main test = new Main();
        test.init();
    }

    public int solution(int pos,int count){

        for(int i=pos; i<n; i++){
            count += sequence[i];
            if(count==s){
                answer++;
            }
            solution(i+1,count);
            count -= sequence[i];
        }

        return count;
    }

    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        sequence = new int[n];

        for(int i=0; i<n; i++){
            sequence[i] = Integer.parseInt(st.nextToken());
        }

        solution(0,0);

        System.out.println(answer);
    }

}
