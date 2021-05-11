package backjun.Simpleexample.recursion.s1074;


import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private StringBuffer sb = new StringBuffer();

    private int count;

    public static void main(String[] args) throws IOException {
        Main s1074 = new Main();
        s1074.init();
    }

    public int solution(int n, int row,int column) throws IOException {

        if(n==0) return 0;
        int half = (int)Math.pow(2,n-1);

        if(row<half && column<half) return solution(n-1,row,column);
        if(row<half && column>=half) return half*half+solution(n-1,row,column-half);
        if(row>=half && column<half) return 2*half*half+solution(n-1,row-half,column);

        return 3*half*half + solution(n-1,row-half,column-half);

    }

    public void init() throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());

        System.out.println(solution(n,row,column));

    }
}
