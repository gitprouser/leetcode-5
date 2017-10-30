/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
class Solution {
    public int maxPoints(Point[] points) {
        if(points==null||points.length==0){
            return 0;
        }        
        HashMap<String,Integer> map = new HashMap();
        int max=1;
        for(int i=0;i<points.length;i++){
            map.clear();
            // map.put((double)Integer.MIN_VALUE,1);
            // int dup = 0;
            int maxPoints=0,overlap=0,vertical=0;
            for(int j=i+1;j<points.length;j++){
                if(points[i].x==points[j].x){
                    if(points[i].y==points[j].y){
                        overlap++;
                    }else{
                        vertical++;
                    }
                    continue;
                }                
                int dx = points[i].x - points[j].x;
                int dy = points[i].y - points[j].y;
                int tmp = gcd(dx, dy);
                dx /= tmp;
                dy /= tmp;
                String key = dy + "/" + dx;
                if (!map.containsKey(key)) {
                    map.put(key, 0);
                }
                map.put(key, map.get(key) + 1);
                maxPoints = Math.max(maxPoints,map.get(key));
            }
            maxPoints = Math.max(maxPoints,vertical);
            max = Math.max(max,maxPoints+overlap+1);
        }
        return max;
    }
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
