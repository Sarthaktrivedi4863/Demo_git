import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class duplicate_characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<Character> hs = new HashSet<>();
        ArrayList<Character> al = new ArrayList<>();
        int n = str.length();
        for(int i=0;i<n;i++)
        {
            if(!hs.contains(str.charAt(i)))
            {
                hs.add(str.charAt(i));
            }
            else{
                al.add(str.charAt(i));
            }
        }

        System.out.println("Repeated Characters are: ");
        for(int i=0;i<al.size();i++)
            System.out.print(al.get(i)+",");

    }
}
