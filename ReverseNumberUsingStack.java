import java.util.*;

public class ReverseNumberUsingStack {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> ans = new Stack<Integer>();
        int t = sc.nextInt();
        for(int z = 0 ; z < t ; z++){
            int x = sc.nextInt();
            while(x > 0){
                ans.push(x%10);
                x /= 10;
            }
         
            int reverse = 0;
            int i = 1;
            while (!ans.isEmpty()){
                //System.out.println(ans);
                reverse = reverse + (ans.peek() * i);
                ans.pop();
                i = i * 10;
            }
            System.out.println(reverse);
        }
        sc.close();
    }
}