import java.util.*;
class Remove_Duplicates_Sorted_Array_I{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            }
            int remaining = removeDuplicates(arr);
            System.out.println(remaining);
            sc.close();
    }
    public static int removeDuplicates(int[] nums) {
        
        
        if (nums.length == 0) return 0; 
        
        int count = 1; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { 
                nums[count] = nums[i];
                count++; 
            }
        }
        
        return count; 
    }
}