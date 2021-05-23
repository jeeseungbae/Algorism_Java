package backjun.Simpleexample.그리디.동전0_s11047;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    /*
    N종류의 동전(각각 많이 가지고 있다.)을 이용해서
    그 가치의 합을 k로 만들기
    필요한 동전 개수는 최소
    입력 :
    N,K
    N개의 줄에 동전의 가치 Ai 오름차순
    출력 :
    K원을 만드는데 필요한 동전 개수 최소값
     */

    public static void main(String[] args) throws IOException {
        Main test = new Main();
        test.init();
    }

    public void solution(int n, int k,int[] arr){
        int count=0;

        for(int i : arr){
            if(k>=i){
                count+= k/i;
                k = k%i;
            }
        }

        System.out.println(count);
    }

    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for(int i=n-1; i>=0; i--){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solution(n,k,arr);
    }
}
