package backjun.Classes.gold.gold1.책페이지_s1019;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private int[] answer;

    public static void main(String[] args) throws IOException {
        Main test = new Main();
        test.init();
    }

    public void solution(int n) throws IOException {

        int start =1;
        int digit = 1;
        int end = n;

        while(start<=end){

            while(start%10!=0 && start<=end){
                check(start,digit);
                start++;
            }

            while(end%10!=9 && start<=end){
                check(end,digit);
                end--;
            }

            if(start>end){break;}

            start /=10;
            end /=10;

            for(int i=0; i<10; i++){
                answer[i] += (end-start+1)*digit;
            }

            digit *=10;

        }


        for(int i=0; i<10; i++){
            System.out.print(answer[i]+" ");
        }

    }

    public void check(int start,int digit){
        while(start>0){
            answer[start%10] += digit;
            start/=10;
        }
    }

    public void init() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        answer = new int[10];

        solution(n);
    }

}
