package programmers.level2.카카오프렌즈컬러링북;

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();

        int m = 6;
        int n = 4;
//        int [][] picture = new int[][]{{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
//        int [][] picture = new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
//        int [][] picture = new int[][]{{3, 2, 2, 3}, {1, 2, 2, 1}, {1, 2, 2, 1}, {1, 2, 2, 1}, {1, 2, 2, 1}, {0, 1, 1, 0}};
//        int [][] picture = new int[][]{{1, 2, 3, 4}, {4, 3, 2, 1}, {1, 2, 3, 4}, {4, 3, 2, 1}, {1, 2, 3, 4}, {4, 3, 2, 1}};
        m=3;
        n=3;
        int w = (int) (Math.pow(2,31)-1);
        int[][] picture = new int[][]{
                {0,1,0},
                {2,Integer.MAX_VALUE,w},
                {0,5,0}
        };

        int[] a = s.solution(m,n,picture);
        System.out.print(a[0]);
        System.out.print(" ");
        System.out.println(a[1]);
    }
}
