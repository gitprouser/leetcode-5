public class Solution{


    public int lenghtOfLongestSubstring(String s){
        int ans=0;
        int n=s.length();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0,j=0;j<n;j++){
           if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)),i)
           } 
           ans = Math.max(ans,j-i+1);
           map.put(s.charAt(j),j+1);
        }
        return ans;
    }
    public int lenghtOfLongestSubstring(String s){
        int n = s.length()
        Set<Character> set = new HashSet<>();

        int ans = 0,i=0,j=0;
        while(i<n&&j<n){
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans,j-i);
            }else{
                set.remove(s.charAt(i++))
            }
        }
        return ans
    }
    public int lenghtOfLongestSubstring(String s){
        if(str==null){
            return str;
        }

        int maxlen = 0;
        int index = 0;
        int lastIndex=0;
        int[] dp = new int[s.length()];

        dp[0]=1;
        HashMap<Character,Integer> map  = new HashMap<Character,Integer>();
        map.put(str.charAt(0),0);

        for(int i=1;i<s.length();i++){
            if(map.get(s.charAt(i))==null){
                map.put(s.charAt((i),i);
                dp[i] = dp[i-1]+1;
            }else{
                if(lastIndex<=map.get(s.charAt(i))){
                    dp[i]=i-map.get(s.charAt(i));
                }
            }
        }
    }

    public int lenghtOfLongestSubstring(String s){
        if(str==null){
            return 0;
        }
        int maxlen=0;
        int index=0;
        int lastIndex=0;
        int[] dp = new int[s.length()];
        dp[0]=1;
        for(int i=1;i<s.length();i++){
            for(int j=i-1;j>lastIndex;j--){
                if(s.charAt[i]==s.charAt(j)){
                    dp[i]=i-j;
                    lastIndex=j+1;
                    break;
                }else fi(j==lastIndex){
                    dp[i]=dp[i-1]+1;
                }
            }
            if(dp[i]>maxlen){
                maxlen=dp[i];
                index = i+1-maxlen;
            }
        }
        return maxlen
    }
    public int lenghtOfLongestSubstring(String s){
        if(s==null){
            return 0;
        }
        int maxlen=0;
        int lastIndex=0;
        int index=0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        for(int i=0;i<s.length();i++){
            map.clear();
            map.put(s.charAt(i),i);
            for (int j=i+1;j<s.length();j++){
                if(map.get(s.charAt(i))!=null){
                    break;
                } 
                map.put(s.charAt(j),1);
            }
            if (j-i>maxlen){
                maxlen = j-1;
                index=i;
            }
        }
    }
    public int lenghtOfLongestSubstring(String s){
        int n = s.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;i<n;j++){
                if(allUnique(s,i,j)){
                    ans = Math.max(ans,j-i);
                }
            }
        }
        return ans;
    }

    public boolean allUnique(String s,int start,int end){
        Set<Character> set = new HashSet<>();
        for (int i=start;i<end;i++){
            Character ch = s.charAt(i);
            if(set.contains(ch)){
                return false;
            }
            set.add(ch);
        }
    }
}
