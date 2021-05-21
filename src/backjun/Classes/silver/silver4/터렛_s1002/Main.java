package backjun.Classes.silver.silver4.터렛_s1002;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        Main test = new Main();
        test.init();
    }

    public int solution(int x1,int y1,int r1,int x2,int y2,int r2){

        double diagonal = Math.pow(x1-x2,2)+Math.pow(y1-y2,2);
        double real_diagonal_p = Math.pow(r1+r2,2);
        double real_diagonal_m = Math.pow(r1-r2,2);

        if(x1==x2&&y1==y2&&r1==r2) {
            return -1;
        }
        else if(diagonal>real_diagonal_p||diagonal<real_diagonal_m){
            return 0;
        }
        else if(diagonal==real_diagonal_p||diagonal==real_diagonal_m){
            return 1;
        }
        else{
            return 2;
        }
    }


    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){

            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            sb.append(solution(x1,y1,r1,x2,y2,r2));
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }

}
