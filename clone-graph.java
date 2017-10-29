/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node==null) return node;
        List<UndirectedGraphNode> nodes = getAllNodes(node);
        HashMap<UndirectedGraphNode,UndirectedGraphNode> map= new HashMap();
        for(UndirectedGraphNode temp:nodes){
            map.put(temp,new UndirectedGraphNode(temp.label));
        }
        for(UndirectedGraphNode temp:nodes){
            UndirectedGraphNode newNode= map.get(temp);
            for(UndirectedGraphNode nei:temp.neighbors){
                UndirectedGraphNode newNei =map.get(nei);
                newNode.neighbors.add(newNei);
            }
        }
        return map.get(node);
    }
    public List<UndirectedGraphNode> getAllNodes(UndirectedGraphNode node){
        Queue<UndirectedGraphNode> queue = new LinkedList();
        HashSet<UndirectedGraphNode> set=new HashSet();
        queue.offer(node);
        set.add(node);
        while(!queue.isEmpty()){
            UndirectedGraphNode head = queue.poll();
            for(UndirectedGraphNode nei:head.neighbors){
                if(!set.contains(nei)){
                    set.add(nei);
                    queue.offer(nei);
                }
            }
        }
        return new ArrayList<UndirectedGraphNode>(set);
    }
}
