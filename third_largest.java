import java.util.Scanner;

class third_largest{
    public static void main(String args[]){

        Scanner in=new Scanner(System.in);
        
        //array input
        int n=in.nextInt();

        
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                else{
                    continue;
                }
            }
        }

        int result=arr[n-3];
        System.out.println(result);
    }
}
