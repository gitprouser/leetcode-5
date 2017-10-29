class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] s = new int[26];
        for(char c:tasks){
            s[c-'A']++;
        }
        Arrays.sort(s);
        int i=25;
        while(i>=0&&s[i]==s[25])i--;
        return Math.max(tasks.length,(n+1)*(s[25]-1)+25-i);
    }
}
