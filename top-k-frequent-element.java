orlass Solution {
    
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        Queue<Pair> kq = new PriorityQueue<Pair>(new Comparator<Pair>() {
            @Override
            public int compare(Pair a, Pair b) {
                return a.count - b.count;
            }
        });
        
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            Pair temp = new Pair(entry.getKey(),entry.getValue());
            kq.add(temp);
            if(kq.size()>k){
                kq.poll();
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        while(kq.size()>0){
            res.add(kq.poll().num);
        }
        return res;
    }
}
class Pair{
        int num;
        int count;
        public Pair(int num , int count){
            this.num=num;
            this.count=count;
        }
}
