package backjun.Simpleexample.BFS_DFS.s1926;

import java.io.*;
import java.util.*;


public class S1926 {

    private int[][] board;
    private int count;
    private Queue<int[]> bfs = new LinkedList<>();
    private int[] dy = {0,1,0,-1};
    private int[] dx = {1,0,-1,0};
    private int[] max = {0,0};

    public static void main(String[] args) throws IOException {
        S1926 s1926 = new S1926();
        s1926.init();
    }

    public void solution() throws IOException {
        while(!bfs.isEmpty()) {
            int[] position = bfs.poll();
            max[1]+=1;
            for(int i=0; i<4; i++){
                if(board[position[0]+dy[i]][position[1]+dx[i]]==1){
                    int[] bfs_add = {position[0]+dy[i],position[1]+dx[i]};
                    bfs.add(bfs_add);
                    board[position[0]+dy[i]][position[1]+dx[i]]=0;
                }
            }
        }
        if(max[0]<max[1]){
            max[0]=max[1];
        }
    }


    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());

        board = new int[row+2][column+2];

        for(int i=1; i<=row; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=column; j++){
                board[i][j]= Integer.parseInt(st.nextToken());
            }
        }

        for(int i=1; i<=row; i++){
            for(int j=1; j<=column; j++){
                if(board[i][j]==1){
                    max[1]=0;
                    board[i][j]=0;
                    bfs.add(new int[]{i, j});
                    count+=1;
                    solution();
                }
            }
        }

        System.out.println(count);
        System.out.println(max[0]);

    }
}


