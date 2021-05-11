package backjun.Simpleexample.BFS_DFS.s2178;

import java.io.*;
import java.util.*;


public class Main {

    private int row;
    private int column;
    private int count=0;

    private List<int[]> bfs = new ArrayList<>();

    private int[][] board;
    private int[][] direction;
    private int[] dx = {0,1,0,-1};
    private int[] dy = {1,0,-1,0};

    public static void main(String[] args) throws IOException {
        Main s2178 = new Main();
        s2178.init();
    }

    public void solution() throws IOException {

        while(!bfs.isEmpty()){
            int[] position =  bfs.remove(0);
            count = direction[position[0]][position[1]]+1;

            int x,y;

            for(int i=0; i<4; i++){
                x = position[0]+dx[i];
                y = position[1]+dy[i];

                if(board[x][y]==1){
                    board[x][y] = 0;
                    direction[x][y] = count;
                    bfs.add(new int[]{x,y});
                }
            }

        }
    }


    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());

        row = Integer.parseInt(st.nextToken());
        column = Integer.parseInt(st.nextToken());

        board = new int[row+2][column+2];
        direction = new int[row+2][column+2];
        direction[1][1]=1;

        for(int i=1; i<=row; i++){
            String[] locate = br.readLine().split("");
            for(int j=1; j<=column; j++){
                board[i][j]=Integer.parseInt(locate[j-1]);
            }
        }


        bfs.add(new int[]{1,1});
        board[1][1]=0;
        solution();

        sb.append(direction[row][column]);
        bw.write(sb.toString());
        bw.close();
        br.close();

    }
}


