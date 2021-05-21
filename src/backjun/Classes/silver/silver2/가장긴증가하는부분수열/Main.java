package backjun.Classes.silver.silver2.가장긴증가하는부분수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        Main s11053 = new Main();
        s11053.init();
    }

    public int solution(int[] list){

        int count=0;


        return count;
    }

    public void init() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        Set<Integer> list = new HashSet<>();
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        List answerlist = new ArrayList(list);
        answerlist.sort(null);
        
        System.out.println(answerlist);

    }
}
