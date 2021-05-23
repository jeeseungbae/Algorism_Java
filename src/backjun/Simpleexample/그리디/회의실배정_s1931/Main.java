package backjun.Simpleexample.그리디.회의실배정_s1931;
import java.io.*;
import java.util.*;

public class Main {

    /*
    N개의 회의시간 사용표
    시작시간 ~ 끝 시간
    회의 겹치면 안됨
    한 회의 끝나는것과 동시에 다음 회의 시작
    시작 시간 끝나는시간 같을 수 o
    1<=N<=100000
    0<=시간<2^31-1 int로 가능
     */

    private int n;
    private List<int[]> arr;
    private int max;

    public static void main(String[] args) throws Exception {
        Main test = new Main();
        test.init();
    }

    public void solution(){
        int count=1;
        int[] pos = arr.get(0);

        for(int i=1;i<n; i++){
            if(pos[1]<=arr.get(i)[0]){
                count++;
                pos=arr.get(i);
            }
        }

        System.out.println(count);
    }

    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr.add(new int[]{x, y});
        }

        Collections.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]) {
                    return o1[0] - o2[0];
                }
                else{
                    return o1[1]-o2[1];
                }
            }
        });

        solution();

    }
}
