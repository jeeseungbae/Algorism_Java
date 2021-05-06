package backjun.Simpleexample.backtracking.s9663;

import java.io.*;
import java.util.*;

public class S9663 {

    private Stack<Integer> row = new Stack<>();
    private Stack<Integer> column = new Stack<>();
    private Queue<Integer> a = new LinkedList<>();


    private int count;


    public static void main(String[] args) throws IOException {
        S9663 s9663 = new S9663();
        s9663.init();
    }


    public void solution(int n) {

        if(column.size()==n && row.size()==n){
            count+=1;
            return ;
        }
        String[] a = {"ww","yy"};
    }

    public void init() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        solution(n);
        System.out.println(count/2);

    }
}
