import java.util.*;

class missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum=0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum+=a[i];
           
        }
        int res=(n+1)*(n+2)/2;
        int ser=res-sum;
         System.out.println(ser);
         
    }
}
