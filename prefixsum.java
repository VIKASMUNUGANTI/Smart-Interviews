import java.util.*;

class prefixsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int k=0;k<n;k++){
            a[k]=sc.nextInt();
        }
       for(int j=1;j<a.length;j++){
           a[j]=a[j-1]+a[j];
       
       System.out.print(a[j]+" ");
       }
    }
}
