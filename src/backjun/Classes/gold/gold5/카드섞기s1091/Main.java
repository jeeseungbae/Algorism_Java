package backjun.Classes.gold.gold5.카드섞기s1091;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private int n;
    private int[] p;
    private int[] s;

    private int[] nowPos;
    private int[] newPos;
    private int[] first;

    public static void main(String[] args) throws IOException {
        Main s1091 = new Main();
        s1091.init();
    }

    public int solution() throws IOException {

        nowPos = new int[n];
        newPos = new int[n];
        int count=0;

        for(int i=0; i<n; i++){
            newPos[i]=i;
        }
        first=newPos.clone();

        while(check(newPos,p)){

            count++;
            nowPos= newPos.clone();

            for(int i=0; i<n; i++){
                newPos[i] = nowPos[s[i]];
            }

            if(Arrays.equals(first, newPos)){
                return -1;
            }

        }
        return count;
    }

    public Boolean check(int[] newpos,int[] p){
        for(int i=0; i<p.length; i++){
            if(newpos[i]%3 != p[i]){
                return true;
            }
        }
        return false;
    }

    public void init() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        p = new int[n];
        s = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            p[i]= Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            s[i]= Integer.parseInt(st.nextToken());
        }
        System.out.println(solution());
    }
}
