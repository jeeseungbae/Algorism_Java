package backjun.Simpleexample.recursion.s11729;


import java.io.*;

public class Main {

    StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException {
        Main s11729 = new Main();
        s11729.init();
    }

    public void solution(int a,int b,int n) throws IOException {

        if(n==1){
            sb.append(a+" " + b + "\n");
            return;
        }

        solution(a,6-a-b,n-1);
        sb.append(a + " "+ b +"\n");
        solution(6-a-b,b,n-1);

    }

    public void init() throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        sb.append(Math.round(Math.pow(2,n))-1);
        sb.append("\n");


        solution(1,3,n);

        bw.write(String.valueOf(sb));
        bw.close();
        br.close();

    }
}
