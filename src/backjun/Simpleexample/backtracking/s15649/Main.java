package backjun.Simpleexample.backtracking.s15649;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private StringBuffer sb = new StringBuffer();
    private int[] store;
    private boolean[] used;


    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.init();
    }

    public void solution(int n, int m,int k) {

        if(m==k){
            for(int i:store){
                sb.append(i);
                sb.append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=0; i<n; i++){
            if(!used[i]){
                store[k]=i+1;
                used[i]=true;
                solution(n,m,k+1);
                used[i]=false;
            }
        }

    }

    public void init() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        store = new int[m];
        used = new boolean[n];


        solution(n,m,0);

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
