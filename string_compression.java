
import java.util.*;
public class string_compression {
    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);
        // String demo=sc.nextLine();
        String demo="aaabbbbc";
        ArrayList<Character> al = new ArrayList<>();
        ArrayList<Character> cl = new ArrayList<>();
        
        HashSet<Character> hs = new HashSet<>();
        int n = demo.length();
        for(int i=0;i<n;i++)
        if(!hs.contains(demo.charAt(i)))
            {
                hs.add(demo.charAt(i));
                al.add(demo.charAt(i));
            }
        System.out.println("enter string: ");
        int uele=hs.size();
        for(int i=0;i<n;i++)
            cl.add(demo.charAt(i));
        
        int [] arr = new int[uele];
        
            for(int i=0;i<uele;i++)
            {
                arr[i]=0;
                for(int j=0;j<n;j++)
                {
                    if(al.get(i)==cl.get(j))
                        arr[i]++;
                }
            }

            System.out.println(Arrays.toString(arr));
            sc.close();

    

    }
    
}
