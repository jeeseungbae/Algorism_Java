package backjun.Classes.gold.gold3.소수의연속합_s1644;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private List<Integer> ertos = new ArrayList<>();
    private int decimal_range;

    public static void main(String[] args) throws IOException {

        Main test = new Main();
        test.init();
    }

    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        decimal_range = n;
        make_decimal();
        System.out.println(solution());
    }

    // 소수의 연속 시작점 확인
    public int solution(){
        int count =0;

        for(int i=0; i<ertos.size(); i++){
            if(check(i)){
                count++;
            }
        }

        return count;
    }

    // 연속된 수가 n의 값과 같은지 확인
    public boolean check(int k){
        int add = 0;

        for(int i=k; i<ertos.size(); i++){
            add += ertos.get(i);
            if(add==decimal_range){
                return true;
            }
            else if(add>decimal_range){
                return false;
            }
        }
        return false;
    }

    // 에라토스테네스의 체
    public void make_decimal(){
        boolean[] board = new boolean[decimal_range+1];
        for(int i = 2; i<= decimal_range; i++){
            if(board[i]==false){
                ertos.add(i);
                for(int j=i+i; j<=decimal_range; j+=i){
                    board[j]=true;
                }
            }
        }
    }
}
