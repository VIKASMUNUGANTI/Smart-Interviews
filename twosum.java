import java.util.*;

class twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n];
       int t=sc.nextInt();
       for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               if(a[i]+a[j]==t){
                   System.out.print(i+" ");
               }
           }
       }
    }
}
