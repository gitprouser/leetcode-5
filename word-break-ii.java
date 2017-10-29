class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet();
        for(String t:wordDict){
            set.add(t);
        }
        return helper(s,set,new HashMap<String,LinkedList<String>>());        
    }
    public List<String> helper(String s,Set<String> wordDict,HashMap<String,LinkedList<String>>map){
        if(map.containsKey(s)){
            return map.get(s);
        }
        LinkedList<String> res = new LinkedList();
        if(s.length()==0){
            res.add("");
            return res;
        }
        for(String word: wordDict){
            if(s.startsWith(word)){
                List<String> subliet = helper(s.substring(word.length()),wordDict,map);
                for(String sub:subliet){
                    res.add(word+(sub.isEmpty()?"":" ")+sub);
                }
            }
        }
        map.put(s,res);
        return res;
    }

}
