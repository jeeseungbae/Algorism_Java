package backjun.Classes.gold.gold3.파티_s1238;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    private int n;
    private int m;
    private int x;
    private int[][] roads;
    private int[] answers;
    private int min =Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        Main test = new Main();
        test.init();
    }

    private void solution(){

        for(int i=1; i<=n; i++){
            answers[i]=minTime(i,x,0,new ArrayList());
            min =Integer.MAX_VALUE;
            answers[i] += minTime(x,i,0,new ArrayList<>());
            min =Integer.MAX_VALUE;
        }

        int max=0;
        for(int i=1; i<=n; i++){
            if(answers[i]>max){
                max = answers[i];
            }
        }
        System.out.println(max);
    }
    private int minTime(int first,int end, int total, List<Integer> places){
        if(first==end){
            return total;
        }
        places.add(first);
        for(int i=1; i<=n; i++){
            if(!places.contains(i)&&i!=first&&roads[first][i]!=0){
                int num = minTime(i,end,total+roads[first][i],places);
                if(min>num){
                    min=num;
                }
            }
        }
        return min;
    }

    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        roads = new int[n+1][n+1];
        answers = new int[n+1];

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            roads[first][end] = time;
        }
        solution();
    }
}
