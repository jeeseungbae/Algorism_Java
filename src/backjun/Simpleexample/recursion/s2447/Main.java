package backjun.Simpleexample.recursion.s2447;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private String[][] pattern;

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.init();
    }

    public void solution(int x, int y,int n, boolean blank) throws IOException {

        if(blank){
            for(int i=x; i<x+n; i++){
                for(int j=y; j<y+n; j++){
                    pattern[i][j]=" ";
                }
            }
            return ;
        }
        if(n==1){
            pattern[x][y]="*";
            return ;
        }

        int size = n/3;
        int count=0;

        for(int i=x;i<x+n; i+=size){
            for(int j=y;j<y+n; j+=size){
                count++;
                if(count==5){
                    solution(i,j,size,true);
                }
                else{
                    solution(i,j,size,false);
                }
            }
        }



    }

    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(st.nextToken());
        pattern = new String[n][n];

        solution(0,0,n,false);

        for(String[] i :pattern){
            for(String j:i){
                sb.append(j);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
