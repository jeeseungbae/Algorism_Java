package backjun.Classes.gold.gold2.IQTest_s1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    private int a ,b,n;
    private int[] list;
    private int flag=0;
    private List<int[]> answers = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Main test = new Main();
        test.init();
    }

    public String solution(){
        if(n==1){
            return "A";
        }
        if(n==2){
            if(list[0]==list[1]){
                return String.valueOf(list[0]);
            }
            else{
                return "A";
            }
        }
        if(list[0]==list[1]){
            for(int i=1; i<n; i++){
                if(list[i]!=list[i-1]){
                    return "B";
                }
            }
            return String.valueOf(list[0]);
        }

        if((list[2]-list[1])%(list[1]-list[0]) == 0){
            a = (list[2]-list[1]) / (list[1] - list[0]);
            b = list[1]-list[0]*a;
            if(check(a,b)){
                return String.valueOf(list[n-1]*a+b);
            }
            else{
                return "B";
            }
        }
        else{
            return "B";
        }

    }

    private boolean check(int a, int b){
        for(int i=1; i<n; i++){
            if((list[i-1]*a+b)!=list[i]){
                return false;
            }
        }
        return true;
    }
    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        list = new int[n];

        st = new StringTokenizer(br.readLine());
        list[0] = Integer.parseInt(st.nextToken());
        for(int i=1; i<n; i++){
            list[i] = Integer.parseInt(st.nextToken());
            if(list[i]*list[i-1]<0){
                flag=1;
            }
        }
        System.out.println(solution());
    }
}
