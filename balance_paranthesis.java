import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class balance_paranthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        ArrayList<Character> al = new ArrayList<>();
        Stack<Character> st = new Stack<>();
        for (int i=0;i<n;i++)
            al.add(s.charAt(i));
        for(int i=0;i<n;i++)
        {
            if(al.get(i)=='(' || al .get(i)=='{' || al.get(i)=='[')
               {
                 st.push(al.get(i));
                 System.out.println("pushing in stack"+al.get(i));
               }
            else{
                if(st.peek()=='[' && al.get(i)==']')
                {
                    st.pop();
                }
                else if(st.peek()=='(' && al.get(i)==')')
                {
                    st.pop();
                }
                 else if(st.peek()=='{' && al.get(i)=='}')
                {
                    st.pop();
                }
                else{
                    System.out.println("Paranthesis are not balanced");
                    System.exit(0);
                }
            }

        }
        if(st.empty())  System.out.println("Paranthesis are Balanced");

       // else System.out.println("Paranthesis are not balanced");
        
    }
    
}
