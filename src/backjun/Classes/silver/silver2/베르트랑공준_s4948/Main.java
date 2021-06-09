package backjun.Classes.silver.silver2.베르트랑공준_s4948;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private boolean[] ertos = new boolean[300001];

    public static void main(String[] args) throws IOException {
        Main test = new Main();
        test.init();
    }

    public void ertosthenes(){
        ertos[0]=true;
        ertos[1]=true;
        for(int i=2; i<ertos.length; i++){
            if(!ertos[i]){
                for(int j=i+i; j<ertos.length; j+=i){
                    ertos[j]=true;
                }
            }
        }
    }

    public void init() throws IOException {
        ertosthenes();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int count=0;
            if(n==0)break;

            for(int i=n+1; i<=2*n; i++){
                if(!ertos[i]){
                    count++;
                }
            }
            sb.append(count);
            sb.append("\n");

        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
