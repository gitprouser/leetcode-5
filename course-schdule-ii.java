class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList[] graph = new ArrayList[numCourses];
        int[] indegree = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            graph[i]=new ArrayList<Integer>();
        }
        for(int i=0;i<prerequisites.length;i++){
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
            indegree[prerequisites[i][0]]++;
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }
        int[] res = new int[numCourses];
        int cnt=0;
        while(!queue.isEmpty()){
            Integer curr = queue.poll();
            res[cnt++]=curr;
            for(int i=0;i<graph[curr].size();i++){
                int temp = (int)graph[curr].get(i);
                indegree[temp]--;
                if(indegree[temp]==0){
                    queue.offer(temp);
                }
            }
        }
        return cnt==numCourses?res:new int[0];
    }
}
