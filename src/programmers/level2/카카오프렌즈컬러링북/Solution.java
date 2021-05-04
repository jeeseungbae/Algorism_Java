package programmers.level2.카카오프렌즈컬러링북;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    int[] dx = {1,0,-1,0};
    int[] dy = {0,1,0,-1};

    List<Integer> answerlist = new ArrayList<>();
    Queue<int[]> bfs = new LinkedList<>();

    private int bfsStart(int m, int n, long[][] picture,long position){

        int[] now;

        if(bfs.isEmpty()){
            return 0;
        }

        now = bfs.poll();

        for(int i=0; i<4; i++){
            int newdx = now[0]+dx[i];
            int newdy = now[1]+dy[i];
            if(newdx>=0 && newdx<m && newdy>=0 && newdy<n) {
                if (picture[newdx][newdy] == position) {
                    bfs.add(new int[]{newdx, newdy});
                    picture[newdx][newdy] = 0;
                }
            }
        }

        return 1+ bfsStart(m,n,picture,position);
    }

    public int[] solution(int m, int n, int[][] picture){

        int count=0;
        long position =0;

//        int[][]p = picture;
        long[][] p = new long[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                p[i][j]= picture[i][j];
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(p[i][j]!=0){
                    position = p[i][j];
                    bfs.add(new int[]{i,j});
                    p[i][j]=0;
                    count = bfsStart(m,n,p,position);
                    answerlist.add(count);
                }
            }
        }

        int max=0;
        for(int i:answerlist){
            if(max<i){
                max = i;
            }
        }

        int[] answer = new int[2];
        answer[0] = answerlist.size();
        answer[1] = max;
        return answer;
    }

}
