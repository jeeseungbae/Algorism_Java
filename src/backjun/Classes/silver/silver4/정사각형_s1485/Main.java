package backjun.Classes.silver.silver4.정사각형_s1485;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private StringTokenizer st;
    private int[][] arr;
    private List<Integer> list;

    public static void main(String[] args) throws IOException {
        Main test = new Main();
        test.init();
    }
    public void solution(){

        for(int i=0; i<4; i++){
            for(int j= i+1; j<4; j++){
                int x = (int) (Math.pow(arr[i][0]-arr[j][0],2)+Math.pow(arr[i][1]-arr[j][1],2));
                list.add(x);
            }
        }
        Collections.sort(list);

        if(list.get(0).equals(list.get(1)) && list.get(1).equals(list.get(2)) && list.get(2).equals(list.get(3)) && list.get(list.size() - 1).equals(list.get(list.size() - 2))){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }

    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){
            arr = new int[4][2];
            list = new ArrayList<>();
            for(int j=0; j<4; j++){
                st = new StringTokenizer(br.readLine());
                arr[j][0] = Integer.parseInt(st.nextToken());
                arr[j][1] = Integer.parseInt(st.nextToken());
            }
            solution();
        }
    }
}
