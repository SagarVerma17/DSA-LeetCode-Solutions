class Solution {
    public int lengthOfLongestSubstring(String s) {
       Map<Character, Integer> map= new HashMap<Character, Integer>();
       int release=0,answer=0;

       for(int i=0;i<s.length();i++)
       {
           char currentVal=s.charAt(i);

               while(map.containsKey(currentVal))
               {
                   char discard=s.charAt(release);
                   map.remove(discard);
                   release++;
               }
            
            map.put(currentVal, 1);
            answer = Math.max(answer,i- release+1);
        
       }
       return answer;
    }
}

// Time Complexity - O(N)
// Space Complexity - O(K)  K =  is the number of distinct characters in the input string "s."
