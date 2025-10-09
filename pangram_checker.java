import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pangram_checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        if(n<26)
        System.out.println("Not Pangram");
        else{
            ArrayList<Character> al1 = new ArrayList<>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
            ArrayList<Character> al2 = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                if(al1.contains(str.charAt(i))){
                    if(!al2.contains(str.charAt(i))){
                        al2.add(str.charAt(i));
                    }
                }
            }
            if(al2.size()==26){
                System.out.println("Pangram");
            }
            else    System.out.println("Not Pangram");


        }
        
    }
}
