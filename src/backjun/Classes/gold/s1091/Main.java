package backjun.Classes.gold.s1091;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    int count=0;


    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.init();
    }

    public int solution(int n, int n_init, int k){

        while(n%k!=0) {
            count++;

            int new_n = n;

            for (int i = n_init; i > 0; i = i / 10) {
                new_n = new_n * 10;
            }

            new_n += n_init;

            if(n%k==new_n%k){
                return -1;
            }

            n = new_n;

        }

        return count+1;
    }

    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(solution(n,n,k));

        // 아직 모르겠음. ....
    }
}
