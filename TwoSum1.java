import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        Map< Integer,Integer> map=new HashMap <Integer, Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int current=target-nums[i];
            if(map.containsKey(current))
            {
                arr[0]=map.get(current);
                arr[1]=i;
                return arr;                
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}

// Time Complexity - O(N)
// Space Complexity - O(N)