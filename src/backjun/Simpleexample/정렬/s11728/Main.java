package backjun.Simpleexample.정렬.s11728;

import java.io.*;
import java.util.*;

public class Main {

    int n_count,m_count;
    StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.init();
    }

    public void solution(int[] n , int[] m) throws IOException {
        int nidx=0;
        int midx=0;

        for(int i=0; i<n_count+m_count; i++){

            if(nidx>=n_count){sb.append(m[midx++]+" ");}
            else if(midx>=m_count){sb.append(n[nidx++]+" ");}
            else if(n[nidx]<m[midx]){sb.append(n[nidx++]+" ");}
            else{sb.append(m[midx++]+" ");}
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());

        bw.close();

    }

    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n_count = Integer.parseInt(st.nextToken());
        m_count = Integer.parseInt(st.nextToken());

        int[] n = new int[n_count];
        int[] m = new int[m_count];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n_count; i++){
            n[i]=Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m_count; i++){
            m[i]=Integer.parseInt(st.nextToken());
        }

        solution(n,m);
        br.close();

    }
}
