package backjun.Classes.silver.silver3.사람의수_s1206;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        Main s1206 = new Main();
        s1206.init();
    }

    public int solution(float[] list){
        int answer =0;
        int flag=0;

        while(flag==0){
            answer++;
            for(int i=0; i<list.length; i++){
                float x = list[i]*answer;
                float roundx = (float)(Math.round((x%1)*10)/10);

                if( x%1==0 || roundx==1){
                    float dx = (float) Math.round(x)/answer;
                    float up_x = (float) Math.floor(dx*1000)/1000;
                    if(up_x==list[i]){
                        if(i==list.length-1){
                            flag=1;
                        }
                    }else{
                        break;
                    }
                }
                else{
                    break;
                }

            }
        }

        return answer;
    }

    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        float[] list = new float[n];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            list[i] = Float.parseFloat(st.nextToken());
        }

        sb.append(solution(list));

        bw.write(sb.toString());
        bw.close();
        br.close();
    }

}
