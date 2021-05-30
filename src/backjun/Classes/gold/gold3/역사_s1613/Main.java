package backjun.Classes.gold.gold3.역사_s1613;

import java.io.*;
import java.util.*;

public class Main<list> {

    /*
           사건의 갯수 n 사건의 전후 관계의 개수 k
           사건의 전 후 관계를 알고 싶은 쌍의 수 s
           먼저 일어나 사건 - 후에 일어난 사건
           알고싶은 사건 쌍의 수 s 1<= s <=N
           앞 먼저 -1
           뒤 먼저 1
           모르면 0
     */

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private boolean[][] arr;
    private int n;
    private int k;


    public static void main(String[] args) throws IOException {

        Main test = new Main();
        test.init();
    }

    public void init() throws IOException {
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new boolean[n+1][n+1];

        for(int i=0; i<k; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y]=true;
        }

        //  플로이드 와샬 알고리즘
        for(int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                for (int k=1; k<=n; k++){
                    if(arr[j][i]&&arr[i][k]){
                        arr[j][k]=true;
                    }
                }
            }
        }


        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());

        for(int i=0; i<s; i++){
            st = new StringTokenizer(br.readLine());
            int front = Integer.parseInt(st.nextToken());
            int back = Integer.parseInt(st.nextToken());

            if(arr[front][back]){
                sb.append(-1+"\n");
            }
            else if(arr[back][front]){
                sb.append(1+"\n");
            }
            else{
                sb.append(0+"\n");
            }

        }

        bw.write(sb.toString());
        bw.close();
        br.close();


    }
}
