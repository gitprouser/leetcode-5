class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        Trie trie = new Trie();
        for(int i=0;i<dict.size();i++){
            trie.insert(dict.get(i));
        }
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length;i++){
            if(i!=words.length-1){
                sb.append(trie.rooten(words[i])+" ");    
            }else{
                sb.append(trie.rooten(words[i]));    
            }
        }
        return sb.toString();
    }
}

class Trie {
    private TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for(int i=0;i<word.length();i++){
            char cur = word.charAt(i);
            if(!node.containsKey(cur)){
                node.put(cur,new TrieNode());
            }
            node = node.get(cur);
        }
        node.setEnd();
    }

    public String rooten(String s){
        TrieNode node = root;
        StringBuilder res =new StringBuilder();
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            res.append(temp);
            if(node.containsKey(temp)){
                node = node.get(temp);
                if(node.isEnd()){
                    return res.toString();
                }                
            }else{
                return s;
            }
        }
        return res.toString();
    }
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
            TrieNode node = searchPrefix(word);
            return node!=null&&node.isEnd();
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
            TrieNode node = searchPrefix(prefix);
            return node!=null;
    }

    private TrieNode searchPrefix(String word){
        TrieNode node = root;
        for(int i=0;i<word.length();i++){
            if(!node.containsKey(word.charAt(i))){
                return null;
            }
            node = node.get(word.charAt(i));
       }
       return node;

    }
}
class TrieNode{
    private TrieNode[] links;
    private final int R=26;
    private boolean isEnd;
    public TrieNode(){
        links = new TrieNode[R];
    }
    public boolean containsKey(char ch){
        return links[ch-'a']!=null;
    }
    public TrieNode get(char ch){
        return links[ch-'a'];
    }
    public void put(char ch,TrieNode node){
        links[ch-'a']=node;
    }
    public void setEnd(){
        isEnd=true;
    }
    public boolean isEnd(){
        return isEnd;
    }
}


