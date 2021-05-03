package programmers.level2.문자열압축;

public class Solution {
    int min;

    public  int solution(String s){
        int answer = 0;
        min=s.length();

        for(int i=1; i<=s.length()/2; i++){
            answer  = w(i,s);
            if(min>answer){
                min = answer;
            }
        }

        return min;
    }

    private int w(int i, String str){

        String sb="";

        int count=1;

        String beforeStr="";
        String newstr="";

        for(int j=0; j<= str.length()/i; j++){

            int from = j*i;
            int to = i*(j+1);

            if(to>str.length()){to=str.length();}

            newstr = str.substring(from,to);

            if(newstr.equals(beforeStr)){
                count+=1;
            }
            else{
                if(count>1){sb+= String.valueOf(count);}
                sb +=newstr;
                count=1;
            }
            beforeStr = newstr;
        }

        if(count>1){
            sb+=String.valueOf(count);
            sb+=newstr;
        }

        return sb.length();
    }
}
