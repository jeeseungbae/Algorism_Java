package backjun.Classes.gold.s1430;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S1430 {

    private List<int[]> answer = new ArrayList<>();
    private List<int[]> side = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        S1430 s1430 = new S1430();
        s1430.init();
    }

    public double solution(int n,int r, double d,int x, int y, int count) {

        double attack=0;

        // 최대값으로 구하기
        for(int i=count; i<side.size(); i++){
            int[] instance = side.get(i);
            double distance = (Math.pow(x-instance[0],2) + Math.pow(y-instance[1],2));
            if(distance<=r*r){
                attack+=d;
                attack+=solution(n,r,d/2,instance[0],instance[1],i+1);
                side.remove(i);
            }
        }

        return Math.round(attack*1000)/1000.0;
    }


    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int[] input_n = new int[2];
            input_n[0] = Integer.parseInt(st.nextToken());
            input_n[1] = Integer.parseInt(st.nextToken());
            int distance = (int) (Math.pow(x-input_n[0],2) + Math.pow(y-input_n[1],2));
            if(distance<=r*r){
                answer.add(input_n);
            }else{
                side.add(input_n);
            }
        }

        double attack=0;

        for(int[] i : answer){
            attack+=d;
            attack+=solution(n,r,d/2,i[0],i[1],0);
        }

        System.out.println(attack);
    }
}
