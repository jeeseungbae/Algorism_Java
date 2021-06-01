package backjun.Classes.silver.silver4.베스트셀러_s1302;

import java.io.*;
import java.util.*;

public class Main {

    private HashMap<String,Integer> list;
    private int max=0;
    private List<String> answerList;

    public static void main(String[] args) throws Exception{
        Main test = new Main();
        test.init();
    }

    public void solution(String a){
        if(list.get(a)==null){
            list.put(a,1);
        }
        else{
            list.put(a,list.get(a)+1);
        }

        if(list.get(a)>max){
            max = list.get(a);
        }
    }

    public void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s=null;


        int n = Integer.parseInt(st.nextToken());
        list = new HashMap<>();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            solution(st.nextToken());
        }

        for(String i : list.keySet()){
            if(list.get(i)==max){
                if(s==null){
                    s=i;
                }
                else{
                    if(s.compareTo(i)>0){
                        s= i;
                    }
                }
            }
        }

        System.out.println(s);

    }
}
