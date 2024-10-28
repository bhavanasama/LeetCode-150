import java.util.*;
public class Rotate_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            }
            System.out.println("Original array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
            System.out.println("Enter the element ");
            int val = sc.nextInt();
            rotate(arr , val);
            System.out.println("Array after rotation:");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            sc.close();
    }
   
        public static void rotate(int[] nums, int k) {
            k %= nums.length;
            reverse(nums, 0, nums.length-1);
            reverse(nums, 0, k-1);
            reverse(nums, k, nums.length-1);
        }
    
        public static void reverse(int[] nums, int start, int end){
            while(start < end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }       
    }

}
