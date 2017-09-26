class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(int i=0;i<strs.length;i++){
            char[] arr = strs[i].toCharArray(); 
            Arrays.sort(arr);
            String temp = String.valueOf(arr);
            if(!map.containsKey(temp)){
                List<String> s = new ArrayList<String>();
                s.add(strs[i]);
                map.put(temp,s);
            }else{
                map.get(temp).add(strs[i]);
            }
        }
        for(Map.Entry<String, List<String>> entry:map.entrySet()){   
            res.add(entry.getValue());
        }
        return res;
    }
}
