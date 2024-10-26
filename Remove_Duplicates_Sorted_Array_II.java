import java.util.*;

public class Remove_Duplicates_Sorted_Array_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int remaining = removeElements(arr);
        System.out.println(remaining);
    
}
    public static int removeElements(int[] nums) {
        int i = 0;
        for(int ele : nums){
            if(i == 0 || i == 1 || nums[i-2] != ele){
                nums[i] = ele;
                i++;
            }
        }
        return i;
    
    }
}