package backjun.Classes.silver.silver4.수의정렬_s1015;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private int[] A;
    private int[] B;
    private int n;
    private StringBuilder sb;

    public static void main(String[] args) throws IOException {
        Main test = new Main();
        test.init();
    }

    public void solution(){
        sb = new StringBuilder();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(A[i]==B[j]){
                    B[j]=0;
                    sb.append(j);
                    sb.append(" ");
                    break;
                }
            }
        }
    }

    public void init() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        A = new int[n];
        B = new int[n];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            int x = Integer.parseInt(st.nextToken());
            A[i] = x;
            B[i] = x;
        }

        Arrays.sort(B);

        solution();

        bw.write(sb.toString());
        bw.close();
        br.close();
    }

}
