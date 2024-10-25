import java.util.*;
class Remove_Elements{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            }
            System.out.println("Enter the element to be removed:");
            int val = sc.nextInt();
            int remaining = removeElements(arr , val);
            System.out.println(remaining);
            sc.close();
    }

    public static int removeElements(int[] arr , int val){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != val){
                arr[count++] = arr[i];
                }
                }
                return count;
    }
}