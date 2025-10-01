import java.util.Arrays;

public class merge_sorted_array {
    public static void main(String[] args) {
        int [] ar1= {10,20,24,38,75,86};
        int [] ar2= {12,25,34,38,76,80,83};
        int n1 = ar1.length;
        int n2 = ar2.length;
        int [] arr = new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2)
        {
            if(ar1[i]<=ar2[j])
                {
                    arr[k]=ar1[i];
                    i++;
                    k++;
                }
                else{
                    arr[k]=ar2[j];
                    j++;
                    k++;             
                   }      
    }
            if(i==n1)
            {
                while(j!=n2)
                {
                    arr[k]=ar2[j];
                    j++;
                    k++; 
                }
            }
            else{
                while(i!=n1)
                {
                     arr[k]=ar1[i];
                    i++;
                    k++;
                }
            }
    System.out.println(Arrays.toString(arr));
}
}
