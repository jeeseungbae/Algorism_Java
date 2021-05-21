package backjun.Classes.gold.gold2.빵집_s3109;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private int[][] board;
    private int[] dx = new int[]{-1,0,1};
    private int[] dy = new int[]{1,1,1};
    private int count=0;

    public static void main(String[] args) throws IOException {

        Main test = new Main();
        test.init();
    }

    public boolean solution(int c,int[] pos){

        if(pos[1]==c){
            count++;
            return true;
        }

        for(int i=0; i<3; i++){
            int new_dx = pos[0]+dx[i];
            int new_dy = pos[1]+dy[i];

            if(board[new_dx][new_dy]==1){
                board[new_dx][new_dy]=0;
                if(solution(c,new int[]{new_dx,new_dy})){
                    return true;
                }
            }

        }

        return false;
    }


    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        board = new int[r+2][c+2];

        for (int i=1; i<=r; i++){
            String read = br.readLine();
            for(int j=0; j<c; j++){
                if(read.charAt(j)=='.'){
                    board[i][j+1]=1;
                }
            }
        }

        for(int i=1; i<=r; i++){
            solution(c,new int[]{i, 1});
        }

        sb.append(count);

        bw.write(sb.toString());
        bw.close();
        br.close();
    }

}
