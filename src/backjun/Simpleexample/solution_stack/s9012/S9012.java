package backjun.Simpleexample.solution_stack.s9012;

import java.io.*;
import java.util.StringTokenizer;

public class S9012 {

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        S9012 main = new S9012();
        main.init();
    }

    public void solution(String order) throws IOException {

        while(order.contains("()")){
            order = order.replace("()","");
        }

        if(order.isEmpty()) {
            sb.append("YES");
            sb.append("\n");
        }
        else {
            sb.append("NO");
            sb.append("\n");
        }

    }

    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        for (int i=0; i<n; i++){
            solution(br.readLine());
        }
        bw.write(String.valueOf(sb));
        bw.close();
        br.close();
    }



}
