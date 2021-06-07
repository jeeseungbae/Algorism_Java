package backjun.Classes.silver.silver1.단지번호붙이기_s2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    private boolean[][] board;
    private int n,count;
    private List<Integer> arr;
    private int[] dx = new int[]{1,-1,0,0};
    private int[] dy = new int[]{0,0,1,-1};

    public static void main(String[] args) throws IOException {
        Main test = new Main();
        test.init();
    }

    public void solution(){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]){
                    board[i][j]=false;
                    count=1;
                    check(i,j);
                    arr.add(count);
                }
            }
        }

        Collections.sort(arr);

        System.out.println(arr.size());
        for(int i:arr){
            System.out.println(i);
        }
    }

    public void check(int i,int j){

        for(int k=0; k<4; k++){
            int x = i + dx[k];
            int y = j + dy[k];
            if(0<=x&&x<n&&0<=y&&y<n){
                if(board[x][y]){
                    board[x][y]=false;
                    count++;
                    check(x,y);
                }
            }
        }
    }

    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        board = new boolean[n][n];

        for(int i=0; i<n; i++){
            String word = br.readLine();
            for(int j=0; j<n; j++){
                if(word.charAt(j)=='1'){
                    board[i][j]=true;
                }
            }
        }

        arr = new ArrayList<>();
        solution();
    }
}
