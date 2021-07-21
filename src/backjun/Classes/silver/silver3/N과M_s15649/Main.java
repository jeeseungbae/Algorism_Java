package backjun.Classes.silver.silver3.N과M_s15649;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private StringBuilder sb;
    private int n,m;
    private boolean[] check;
    private int[] answer;

    public static void main(String[] args) throws IOException {
        Main test = new Main();
        test.init();
    }

    public void solution(int count){
        if(count==m){
            for(int i=0; i<m; i++){
                sb.append(answer[i]);
                sb.append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=1; i<=n; i++){
            if(!check[i]){
                check[i]=true;
                answer[count]=i;
                solution(count+1);
                check[i]=false;
            }
        }
    }

    private void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        check = new boolean[9];
        answer= new int[9];

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        solution(0);

        bw.write(sb.toString());
        bw.close();
        br.close();

    }

}
