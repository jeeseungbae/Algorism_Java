package backjun.Classes.silver.silver2.유기농배추_s1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private boolean[][] board;
    private int[] dx ={0,1,0,-1};
    private int[] dy ={1,0,-1,0};
    private Queue<int[]> store = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        Main test = new Main();
        test.init();
    }

    public void solution(int row,int column){
        int count =0;

        for(int i=0 ; i<row; i++){
            for(int j=0; j<column; j++){
                if(board[i][j]){
                    board[i][j]=false;
                    store.add(new int[]{i,j});
                    check();
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public void check(){

        while(!store.isEmpty()) {
            int[] pos = store.poll();

            for (int k = 0; k < 4; k++) {
                int nRow = pos[0] + dx[k];
                int nColumn = pos[1] + dy[k];

                if (0 > nColumn || nRow < 0 || board.length <= nRow || board[0].length <= nColumn){}
                else {
                    if(board[nRow][nColumn]){
                        board[nRow][nColumn]=false;
                        store.add(new int[]{nRow,nColumn});
                    }
                }
            }
        }
    }

    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());

            int column = Integer.parseInt(st.nextToken());
            int row = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            board = new boolean[row][column];

            for(int j=0; j<k; j++){
                st = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                board[y][x] = true;
            }

            solution(row,column);

        }

    }
}
