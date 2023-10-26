package Stack;

import java.util.Stack;

public class StockSpanProblem {
    public static void stockSpan(int stokes[] , int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i=0;i<stokes.length ; i++){
            int currPrice = stokes[i];
            while(!s.isEmpty() && currPrice>stokes[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;

            }else{
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int [] stokes = {100, 80 , 60, 70, 60, 85 , 100};
        int [] span = new int[stokes.length];

        stockSpan(stokes , span);

        for(int i=0; i<span.length ;i++){
            System.out.println(span[i]+ " ");
        }
    }
}
