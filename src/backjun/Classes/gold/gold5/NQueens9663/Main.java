package backjun.Classes.gold.gold5.NQueens9663;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private int count=0;

    public static void main(String[] args) throws IOException {
        Main s9663 = new Main();
        s9663.init();
    }

    public void solution(int n, int row,int[] list) {
        if(row==n-1){
            count++;
        }
        else {
            for (int i = 0; i < n; i++) {
                list[row+1] = i;
                if (check(list,row+1)) {
                    solution(n, row + 1, list);
                }
            }
        }
    }

    public boolean check(int[] list,int row){

        for(int i=0; i<row; i++){
            if(list[i]==list[row]){
                return false;
            }
            if(Math.abs(i-row)==Math.abs(list[i]-list[row])){
                return false;
            }
        }

        return true;
    }


    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] list = new int[n];

        for(int i=0; i<n; i++) {
            list[0] = i;
            solution(n, 0, list);
        }

        System.out.println(count);

    }
}
