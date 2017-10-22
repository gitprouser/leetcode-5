class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList[] graph = new ArrayList[numCourses];
        int[] indegree = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            graph[i]= new ArrayList<Integer>();
        }
        for(int i=0;i<prerequisites.length;i++){
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
            indegree[prerequisites[i][0]]++;
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                queue.add(i);
            } 
        }
        int cnt = 0;
        while(!queue.isEmpty()){
            Integer curr = queue.poll();
            cnt++;
            ArrayList<Integer> nexts=graph[curr];
            for(int i=0;i<nexts.size();i++){
                indegree[nexts.get(i)]--;
                if(indegree[nexts.get(i)]==0){
                    queue.offer(nexts.get(i));
                }
            }
        }
        return cnt==numCourses;
    }
}
