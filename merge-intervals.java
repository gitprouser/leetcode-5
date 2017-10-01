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
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> ans = new ArrayList<>();
        intervals.sort(Comparator.comparing(i -> i.start));
        Interval last=null;
        for(Interval item:intervals){
            if(last==null||last.end<item.start){
                ans.add(item);
                last=item;
            }else{
                last.end = Math.max(last.end,item.end);
            }
        }
        return ans;
    }
}
