package _08_binary_search;

import java.util.ArrayList;
import java.util.List;

public class _08_find_K_closest_elements {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,5,5,6,7};
        int k = 4;
        int x = 5;

        int n = nums.length;
        int low = 0;
        int high = n - k;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (x - nums[mid] > nums[mid + k] - x){
                low = mid + 1;
            }else{
                high = mid;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = low; index < low + k; index++){
            ans.add(nums[index]);
        }

        System.out.println(ans);
    }
}
