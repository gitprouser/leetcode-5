/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if (newInterval == null || intervals == null) {
            return intervals;
        }

        List<Interval> res = new ArrayList<Interval>();
        int insertPos = 0;

        for(Interval item:intervals){
            if(item.end<newInterval.start){
                res.add(item);
                insertPos++;
            }else if(item.start>newInterval.end){
                res.add(item);
            }else{
                newInterval.start = Math.min(item.start,newInterval.start);
                newInterval.end = Math.max(item.end,newInterval.end);
            }
        }
        res.add(insertPos,newInterval);
        return res;
    }
}
