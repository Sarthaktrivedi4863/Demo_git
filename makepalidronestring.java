import java.util.ArrayList;
import java.util.Scanner;

public class makepalidronestring {
    public static void main(String[] args) {
        String str="";
        Scanner sc = new Scanner(System.in);
        str= sc.nextLine();
        int n = str.length();
        ArrayList<Character> al = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            al.add(str.charAt(i));
        }
        for(int i=0;i<n;i++)
        {
            String out="";
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    out=out+al.get(j);

                }
            }
            String out2= "";
            for(int k=n-2;k>=0;k--)
                out2=out2+out.charAt(k);

            if(out.equals(out2))
            {
                System.out.println("palidrone");
                return;
            }

        }
        System.out.println("Not able to convert in Palidrome");
    }
}
