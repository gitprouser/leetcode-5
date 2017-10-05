class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<String>();
        int wordscount=words.length;
        int curLen = 0;
        int lastI=0;
        for(int i=0;i<=wordscount;i++){
            if(i==wordscount||curLen+words[i].length()+i-lastI>maxWidth){
                StringBuffer buf = new StringBuffer();
                int spaceCount =maxWidth -curLen;
                int spaceSlot = i-lastI-1;
                if(spaceSlot==0||i==wordscount){
                    for(int j=lastI;j<i;j++){
                        buf.append(words[j]);
                        if(j!=i-1){
                            appendSpace(buf,1);
                        }
                    }
                    appendSpace(buf,maxWidth-buf.length());
                }else{
                    int spaceEach = spaceCount/spaceSlot;
                    int spaceExtra = spaceCount%spaceSlot;
                    for(int j=lastI;j<i;j++){
                        buf.append(words[j]);
                        if(j!=i-1){
                            appendSpace(buf,spaceEach+(j-lastI<spaceExtra?1:0));
                        }
                    }
                }
                res.add(buf.toString());
                lastI=i;
                curLen=0;
            }
            if(i<wordscount){
                curLen +=words[i].length();
            }
        }
        return res;
    }
    public void appendSpace(StringBuffer buf,int count){
        for(int i=0;i<count;i++){
            buf.append(' ');
        }
    }
}
