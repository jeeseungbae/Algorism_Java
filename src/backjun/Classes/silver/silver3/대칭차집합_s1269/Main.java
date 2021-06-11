package backjun.Classes.silver.silver3.대칭차집합_s1269;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private boolean[] list = new boolean[100000001];
    private int count=0;

    public static void main(String[] args) throws IOException {
        Main test = new Main();
        test.init();
    }

    public void check(int x){
        if(!list[x]){
            list[x]=true;
            count++;
        }
        else{
            count--;
        }
    }

    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num_a = Integer.parseInt(st.nextToken());
        int num_b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<num_a; i++){
            int x = Integer.parseInt(st.nextToken());
            check(x);
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<num_b; i++){
            int x = Integer.parseInt(st.nextToken());
            check(x);
        }
        System.out.println(count);
    }

}
