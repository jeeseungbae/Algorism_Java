package backjun.Classes.silver.silver3.숫자정사각형_s1051;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    /*
    크기 : n*m 직사각형
    꼭짓점의 수가 모두 같아야 한다.

    최대의 정사각형 갯수
    => 정사각형 수를 큰수부터 작은수 순으로 해결
    => 시간 2초  n,m <=50
     */

    private int[][] board;
    private int n;
    private int m;

    public static void main(String[] args) throws IOException {

        Main test = new Main();
        test.init();
    }

    public int solution(){

        int min = Math.min(n,m);

        for(int i=min; i>1; i--) {
            if (check(i)){
                return i*i;
            }
        }
        return 1;
    }

    public boolean check(int k){

        for(int i=0; i<=n-k; i++){
            for(int j=0; j<=m-k; j++){
                int recLeftUp = board[i][j];
                int recRightUp = board[i][j+k-1];
                int recLeftDown = board[i+k-1][j];
                int recRightDown = board[i+k-1][j+k-1];
                if(recLeftUp==recRightUp&&recRightUp==recRightDown&&recRightDown==recLeftDown){
                    return true;
                }
            }
        }
        return false;
    }

    public void init() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());

       n = Integer.parseInt(st.nextToken());
       m = Integer.parseInt(st.nextToken());

       board = new int[n][m];

       for(int i=0; i<n; i++){
           String input = br.readLine();
           for(int j=0; j<input.length(); j++){
               board[i][j] = input.charAt(j);
           }
       }

        System.out.println(solution());

    }

}
