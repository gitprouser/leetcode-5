class Solution {
    public String frequencySort(String s) {
        Map<Character ,Integer> map = new HashMap<Character,Integer>(); 
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }else{
                map.put(temp,1);
            }
        }
        Queue<Pair> kq = new PriorityQueue<Pair>(new Comparator<Pair>(){
            @Override
            public int compare(Pair a,Pair b){
                return b.count-a.count;
            }
        });
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            kq.add(new Pair(entry.getKey(),entry.getValue()));
        }
        StringBuilder sb = new StringBuilder();
        while(kq.size()>0){
            Pair temp=kq.poll();
            for(int i=0;i<temp.count;i++){
                sb.append(temp.ch);
            }
        }
        return sb.toString();
    }
}
class Pair{
    char ch;
    int count;
    public Pair(char ch,int count){
        this.ch=ch;
        this.count=count;
    }
}
