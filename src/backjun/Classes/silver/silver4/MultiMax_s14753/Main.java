package backjun.Classes.silver.silver4.MultiMax_s14753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private int[] list;
    private int ans;

    public static void main(String[] args) throws IOException {
        Main test = new Main();
        test.init();
    }

    public void solution(int n){
        int a = 4;
        int[] Occ = new int[a];

        Occ[0] = list[0]*list[1];
        Occ[1] = list[0]*list[1]*list[n-1];
        Occ[2] = list[n-1]*list[n-2];
        Occ[3] = list[n-1]*list[n-2]*list[n-3];

        for(int i=0; i<a; i++){
           if(Occ[i]>ans){
               ans = Occ[i];
           }
        }
        System.out.println(ans);
    }

    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        list = new int[n];
        st = new StringTokenizer(br.readLine());
        ans=0;

        for(int i=0; i<n; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(list);

        solution(n);
    }
}
