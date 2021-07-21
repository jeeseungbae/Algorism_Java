package backjun.Classes.silver.silver4.PencilFactory_s7121;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        Main test = new Main();
        test.init();
    }

    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        Long m = Long.parseLong(st.nextToken())+1;
        Long n = Long.parseLong(st.nextToken())+1;
        Long k = Long.parseLong(st.nextToken());

        Long minMultiple = commonMultiple(m,n);

        Long b = k/minMultiple;
        Long c = k/n-b;
        Long d = k/m-b;
        Long a = k-b-c-d;

        sb.append(a).append(" ");
        sb.append(b).append(" ");
        sb.append(c).append(" ");
        sb.append(d);

        bw.write(sb.toString());
        bw.close();
        br.close();

    }

    private Long commonMultiple(Long m, Long n){
        Long maxNum = Math.max(m,n);
        Long minNum = Math.min(m,n);

        while(maxNum%minNum!=0){
            Long mid = maxNum;
            maxNum = minNum;
            minNum = mid%minNum;
        }
        return (m/minNum)*n;
    }
}
