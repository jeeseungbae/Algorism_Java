package backjun.Simpleexample.solution_stack.s10828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class S10828 {

    private List<Integer> stack = new ArrayList<>();
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        S10828 main = new S10828();
        main.init();
    }

    public void solution(String order) throws IOException {

        if(order.contains("push")){
            String[] findNum = order.split(" ");
            push(Integer.parseInt(findNum[1]));
        }
        else if(order.contains("pop")){
            pop();
        }
        else if(order.contains("size")){
            size();
        }
        else if(order.contains("empty")){
            empty();
        }
        else if(order.contains("top")){
            top();
        }
    }

    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        for (int i=0; i<n; i++){
            solution(br.readLine());
        }
        bw.write(String.valueOf(sb));
        bw.close();
        br.close();
    }

    private void push(int inputNum){
        stack.add(inputNum);
    }
    
    private void pop(){
        if(stack.isEmpty()){
            sb.append(-1);
        }
        else {
            sb.append(stack.remove(stack.size()-1));
        }
        sb.append("\n");

    }

    private void size(){
        sb.append(stack.size());
        sb.append("\n");
    }

    private void empty(){
        if(stack.isEmpty()){
            sb.append(1);
        }
        else{
            sb.append(0);
        }
        sb.append("\n");
    }

    private void top(){
        if(stack.isEmpty()){
            sb.append(-1);
        }
        else {
            sb.append(stack.get(stack.size()-1));
        }
        sb.append("\n");
    }

}
