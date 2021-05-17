package backjun.Classes.gold.gold4.환상의짝궁_s15711;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    private Boolean[] eratos = new Boolean[2000000];
    private ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        Main s15711 = new Main();
        s15711.init();
    }

    public String solution(long total){

        if(total<4){
            return "NO\n";
        }
        // 골드바흐의 추측
        else if(total%2==0){
            return "YES\n";
        }
        else{
            if(prime(total-2)){
                return "YES\n";
            }
        }
        return "NO\n";
    }

    public Boolean prime(long k){
        for(int i=0; i<list.size() && list.get(i)*list.get(i)<=k; i++){
            if(k%list.get(i)==0){
                return false;
            }
        }
        return true;
    }

    // 에라토스테네스의 체 false = 소수 / true = 소수 x
    public void listCheck(){
        eratos[0]=false;
        eratos[1]=false;
        for(int i=2; i<2000000; i++){
            if(eratos[i]==null){
                list.add(i);
                eratos[i]=true;
                for(int j=i+i; j<2000000; j+=i){
                    eratos[j]=false;
                }
            }
        }
    }


    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(st.nextToken());
        listCheck();

        for(int i=0; i<t; i++){
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            sb.append((solution(a+b)));
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }

}
