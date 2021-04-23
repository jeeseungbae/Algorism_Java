package backjun.Simpleexample.solution_stack.s3425;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private int n;

    private List<List<Integer>> board = new ArrayList<>();
    private List<int[]> snake_position = new ArrayList<int[]>();

    private int[] snake_run = new int[2];
    private int[] copy = new int[2];

    private int direct = 0;
    private int[] dx = {1,0,-1,0};
    private int[] dy = {0,1,0,-1};
    private int count=0;

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.init();
    }

    public void solution(String order){
        String[] move = order.split(" ");

        for (int i = count; i < Integer.parseInt(move[0]); i++) {
            count+=1;
            int present_position = snake_position.size()-1;

            copy[0] = snake_position.get(present_position)[0];
            copy[1] = snake_position.get(present_position)[1];

            snake_run = copy.clone();
            snake_run[0] += dx[direct];
            snake_run[1] += dy[direct];

            if (snake_run[0] >= n || snake_run[1] >= n ) {
                System.out.println(count);
                System.exit(0);
            }
            else if(snake_run[0] < 0 || snake_run[1]< 0){
                System.out.println(count);
                System.exit(0);
            }
            for(int j=0; j<snake_position.size(); j++){
                if(snake_position.get(j)[0] == snake_run[0] &&snake_position.get(j)[1] == snake_run[1]){
                    System.out.println(count);
                    System.exit(0);
                }
            }

            snake_position.add(snake_run);

            if (board.get(snake_run[1]).get(snake_run[0]) != 1) {
                snake_position.remove(0);
            }else{
                board.get(snake_run[1]).set(snake_run[0],0);
            }

        }

        switch (move[1]) {
            case "D":
                if (direct == 3) {
                    direct = 0;
                } else {
                    direct += 1;
                }
                break;
            case "L":
                if (direct == 0) {
                    direct = 3;
                } else {
                    direct -= 1;
                }
                break;
        }
    }

    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        for (int i=0; i<n; i++){
            List<Integer> sample = new ArrayList<>();
            for(int j=0; j<n; j++){
                sample.add(0);
            }
            board.add(sample);
        }

        snake_position.add(new int[]{0, 0});

        st = new StringTokenizer(br.readLine());
        int num_apple = Integer.parseInt(st.nextToken());

        for (int i=0; i<num_apple; i++){
            st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken())-1;
            int column = Integer.parseInt(st.nextToken())-1;
            board.get(row).set(column,1);
        }

        st = new StringTokenizer(br.readLine());
        int num_snake = Integer.parseInt(st.nextToken());

        for (int i=0; i<num_snake; i++){
            solution(br.readLine());
        }
        solution("100 D");
    }
}
