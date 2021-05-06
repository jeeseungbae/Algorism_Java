package backjun.Simpleexample.BFS_DFS.s7576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class S7576 {

    private int row;
    private int column;

    private int max=0;
    private int flag=0;

    private int[][] board;
    private Queue<int[]> bfs = new LinkedList<>();

    private int[] dx = {0,1,0,-1};
    private int[] dy = {1,0,-1,0};

    public static void main(String[] args) throws IOException {
        S7576 s7576 = new S7576();
        s7576.init();
    }

    public void solution() throws IOException {
        int x,y;

        while(!bfs.isEmpty()){
            int[] position = bfs.poll();
            int count = board[position[0]][position[1]]+1;


            for(int i=0; i<4; i++){
                x = position[0]+dx[i];
                y = position[1]+dy[i];

                if(board[x][y]==0){
                    bfs.add(new int[]{x,y});
                    board[x][y]= count;
                    if(max<count){
                        max = count;
                    }
                }
            }
        }
    }


    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        column = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());

        board = new int[row+2][column+2];

        for(int i=0; i<row+2; i++){
            if(1<=i&&i<=row){ st = new StringTokenizer(br.readLine());}

            for(int j=0; j<column+2; j++){

                if((1<=i&&i<=row)&&(1<=j&&j<=column)){
                    board[i][j]= Integer.parseInt(st.nextToken());
                    if(board[i][j]==1) {
                        bfs.add(new int[]{i, j});
                    }
//                    else if(board[i][j]==0){
//                        flag=1;
//                    }
                }
                else{
                    board[i][j]=2;
                }
            }
        }
//        if(flag==0){
//            System.out.println(0);
//            System.exit(0);
//        }
        solution();
        for (int[] i:board){
            for(int j : i){
                if(j==0){
                    System.out.println(-1);
                    System.exit(0);
                }
            }
        }
        System.out.println(max-1);
    }
}


